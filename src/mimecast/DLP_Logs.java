package mimecast;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class DLP_Logs {

	public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException, IOException {
        String baseUrl = "https://us-api.mimecast.com";
        String uri = "/api/dlp/get-logs";
        String url = baseUrl + uri;
        String accessKey = "mYtOL3XZCOwG96BOiFTZRi8qWE0051x7EQ-nKspEg3jQ1J6t9DLNcHwHc2h4XhxPHLKKMOY0jtE8nBgnSkpSp-JTnGD_QaOqmnk52zHLVVt5c2lvA6iWnoh_52RFvnwQOXuza54VWd88W2Aj7Vvo2WLv27FG8FTm3krWsHwEMhU";
        String secretKey = "itHoEoztB1w4xtmaB1okqGD+AuE5Juh4m36ADwNZniQdB22YEeoRkRyycYJKA2dC4CYH8gsU2lgxMlqoMy5MbQ==";
        String appId = "8262e027-1d53-4c98-9d25-c69bf2e7a5f6";
        String appKey = "b78ba3de-7552-4830-94e1-990ba6e5cc2e";
 
        //create URL object
        java.net.URL obj = new java.net.URL(url);
 
        // set guid for x-mc-req-id header
        String guid = java.util.UUID.randomUUID().toString();
        System.out.println("GUID Is---->\n"+guid);
 
        // set date for x-mc-date header
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss z");
        sdf.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        String date = sdf.format(new java.util.Date());
        System.out.println("Date is---->\n"+date);
 
        //create signature for the Authorization header
        String dataToSign = date + ":" + guid + ":" + uri + ":" + appKey;
        String hmacSHA1 = "HmacSHA1";
        javax.crypto.spec.SecretKeySpec signingKey = new javax.crypto.spec.SecretKeySpec(Base64.getDecoder().decode(secretKey.getBytes()), hmacSHA1);
        javax.crypto.Mac mac = javax.crypto.Mac.getInstance(hmacSHA1);
        mac.init(signingKey);
        String sig = new String(Base64.getEncoder().encode(mac.doFinal(dataToSign.getBytes())));
 
        System.out.println("Signature is--->\n"+"MC " + accessKey + ":" + sig);
        
        // create request object
        javax.net.ssl.HttpsURLConnection con = (javax.net.ssl.HttpsURLConnection) obj.openConnection();
 
        //set request type to POST
        con.setRequestMethod("POST");
        con.setDoOutput(true);
 
        //add reuqest headers
        con.setRequestProperty("Authorization", "MC " + accessKey + ":" + sig);
        con.setRequestProperty("x-mc-req-id", guid);
        con.setRequestProperty("x-mc-app-id", appId);
        con.setRequestProperty("x-mc-date", date);
        con.setRequestProperty("Content-Type", "application/json");
        con.setRequestProperty("Accept", "application/json");
 
        //Add post body to the request
        String postBody = "{\r\n"
        		+ " \"meta\": {\r\n"
        		+ "     \"pagination\": {\r\n"
        		+ "         \"pageSize\": 10\r\n"
        		+ "     }\r\n"
        		+ " },\r\n"
        		+ " \"data\": [\r\n"
        		+ "     {\r\n"
        		+ "         \"oldestFirst\": true,\r\n"
        		+ "         \"from\": \"2020-11-18T14:49:18+0000\",\r\n"
        		+ "         \"to\": \"2021-11-18T00:00:59+0000\"\r\n"
        		+ "     }\r\n"
        		+ " ]\r\n"
        		+ "}";
        java.io.OutputStream os = con.getOutputStream();
        os.write(postBody.getBytes("UTF-8"));
        os.close();
 
        //process response
        java.io.BufferedReader in = new java.io.BufferedReader(
                new java.io.InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
 
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
 
        //return result
        java.lang.System.out.println(response.toString());
    }

}
