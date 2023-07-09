package encryption decryption;

public class solution {
    public static String encode(String secretInformation) {
		// Write your code here.
		char[] strArray = secretInformation.toCharArray();
		for(int i = 0 ; i < strArray.length ; i++){
			strArray[i] += 3; 
		}
		return new String(strArray);
	}

	public static String decode(String encodedInformation) {
		// Write your code here.
		char[] strArray = encodedInformation.toCharArray();
		for(int i = 0 ; i < strArray.length ; i++){
			strArray[i] -= 3; 
		}
		return new String(strArray);
	}
}
