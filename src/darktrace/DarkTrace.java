package darktrace;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Instant;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DarkTrace {
    public static final String HOST = "usw1-54655-01.cloud.darktrace.com";
    public static final String PUBLIC_TOKEN = "30e68a4adcc0d45123f92d7be31220fe8d6af98f";
    public static final String PRIVATE_TOKEN = "f15fa9ce14b8ad06faf822c883580bef34ddfeee";
    public static final String HARDCODED_SIGNATURE = "9cc1799db3dccedc15453b71c5f55450aa4e5f6d";
    private static final HttpClient httpClient = HttpClient.newHttpClient();
    private String host;
    private String publicToken;
    private String privateToken;
    private String baseUrl;

    public DarkTrace(String host, String publicToken, String privateToken) {
        this.host = host;
        this.publicToken = publicToken;
        this.privateToken = privateToken;
        this.baseUrl =  String.format("https://%s",host);
    }

    public static void main(String[] args) throws Exception {
        DarkTrace darkTrace = new DarkTrace(HOST,PUBLIC_TOKEN,PRIVATE_TOKEN);
        Map<String,String> params = new LinkedHashMap<>();
        Instant currDate = Instant.now();
        //5 days back time
        //String starttime = String.valueOf(currDate.toEpochMilli());
        String starttime = String.valueOf(Instant.now().minusSeconds(14* 24*60*60).toEpochMilli());
        String endDate = String.valueOf(currDate.toEpochMilli());
        params.put("starttime",starttime);
        params.put("endtime",endDate);
        String call = "modelbreaches";
        darkTrace.apiCall(params,call,currDate);
    }

    public String apiCall(Map<String, String> params, String call, Instant currDate) throws Exception {
        String paramString = params.entrySet().stream().map(e->e.getKey()+"="+e.getValue()).collect(Collectors.joining("&"));
        String requestUrl = String.format("/%s?%s%s",call,paramString,"&minimal=false&includeacknowledged=true&includebreachUrl=true&deviceattop=true");
        String finalURI = String.format("%s%s",baseUrl,requestUrl);
        System.out.println(finalURI);
        String sign = HmacSha1SignatureGenerator.generateSignature(String.valueOf(currDate.toEpochMilli()),PUBLIC_TOKEN,PRIVATE_TOKEN, requestUrl);
        //String message = String.format("%s\n%s\n%s",requestUrl,this.publicToken,Instant.now().toString());
        HttpRequest request =
                HttpRequest.newBuilder()
                        .GET()
                        .uri(URI.create(finalURI))
                        .setHeader("DTAPI-Token", "30e68a4adcc0d45123f92d7be31220fe8d6af98f") // add request header
                        .setHeader("DTAPI-Date",String.valueOf(currDate.toEpochMilli()))
                        .setHeader("DTAPI-Signature", sign)
                        .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
         // print status code
                 System.out.println(response.statusCode());
         // print response body
                System.out.println(response.body());
        return response.body();
    }

    public static byte[] calcHmacSha256(byte[] secretKey, byte[] message) {
           byte[] hmacSha256 = null;
           try {
                Mac mac = Mac.getInstance("HmacSHA256");
                SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey, "HmacSHA256");
                 mac.init(secretKeySpec);
                 hmacSha256 = mac.doFinal(message);
           } catch (Exception e) {
                throw new RuntimeException("Failed to calculate hmac-sha256", e);
           }
           return hmacSha256;
    }

}
