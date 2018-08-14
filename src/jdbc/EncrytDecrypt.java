package jdbc;

import java.util.Base64;

public class EncrytDecrypt {

	public static void main(String[] args) {
		Base64.Encoder encoder = Base64.getEncoder();
		String str = encoder.encodeToString("akshay".getBytes());  
        System.out.println("Encoded string: "+str);  
        // Getting decoder  
        Base64.Decoder decoder = Base64.getDecoder();  
        // Decoding string  
        String dStr = new String(decoder.decode(str));  
        System.out.println("Decoded string: "+dStr);  
	}

}
