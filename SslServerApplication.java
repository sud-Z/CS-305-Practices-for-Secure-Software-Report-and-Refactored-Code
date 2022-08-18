package com.snhu.sslserver;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}

}
//FIXME: Add route to enable check sum return of static data example:  String data = "Hello World Check Sum!";

@RestController
class ServerController{
	
	public static String bytesToHex(byte[] bytes) {
		// I found this bytes to hex function here: https://www.programiz.com/java-programming/examples/convert-byte-array-hexadecimal
		char[] hexArray = "0123456789ABCDEF".toCharArray();
        char[] hexChars = new char[bytes.length * 2];
        for ( int j = 0; j < bytes.length; j++ ) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
        }
        return new String(hexChars);
    }
	
	public String calculateHash(String data) {
		
		// Create hash string.
		String hash;
		
		try {
			
			// Create instance of MessageDigest with SHA-512 algorithm.
			MessageDigest md = MessageDigest.getInstance("SHA-512");
			// Generate byte array hash.
			byte byteHash[] = md.digest(data.getBytes());
			// Convert byte array to string.
			hash = bytesToHex(byteHash);
			
		} catch (NoSuchAlgorithmException e) {
			// Catch non-existent algorithm and return null.
			e.printStackTrace();
			return null;
			
		}
		
		// Return hex string hash value.
		return hash;
	}
	
    @RequestMapping("/hash")
    public String myHash(){
    	String data = "Hello World Check Sum!";
    	// Generate hash value.
    	String hash = calculateHash(data);
    	
    	if(hash != null) { 
    		// Return message containing original data, name of cipher algorithm, and hash value.
            return "Nicholas Ciesla" + "<p>Data: "+ data + "</br>Name of Cipher Algorithm Used: SHA-512</br>CheckSum Value: " + hash;
    	}
    	else {
    		// Upon a null hash, return error message.
    		return "<p>Algorithm error, security not guarenteed.";
    	}
    }
}