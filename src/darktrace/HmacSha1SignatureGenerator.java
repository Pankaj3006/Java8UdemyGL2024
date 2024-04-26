package darktrace;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.Formatter;

public class HmacSha1SignatureGenerator {
	private static final String HMAC_SHA1_ALGORITHM = "HmacSHA1";

	private static String toHexString(byte[] bytes) {
		Formatter formatter = new Formatter();
		
		for (byte b : bytes) {
			formatter.format("%02x", b);
		}

		return formatter.toString();
	}

	public static String calculateRFC2104HMAC(String data, String key)
			throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, NoSuchAlgorithmException, InvalidKeyException {
		SecretKeySpec signingKey = new SecretKeySpec(key.getBytes(), HMAC_SHA1_ALGORITHM);
		Mac mac = Mac.getInstance(HMAC_SHA1_ALGORITHM);
		mac.init(signingKey);
		return toHexString(mac.doFinal(data.getBytes()));
	}

	public static String generateSignature(String endTime,String publictoken,String privateToken,String request) throws Exception {
		//String request = "/modelbreaches?starttime=1635937218000&endtime="+endTime+"&minimal=false&includeacknowledged=true&includebreachUrl=true&deviceattop=true";
;		return calculateRFC2104HMAC(request+"\n"+publictoken+"\n"+endTime, privateToken);

	}
}