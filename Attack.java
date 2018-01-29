public class Attack {

	public static void main(String[] args) {
		int key;
		int temp_key;
		int tmp;
		int tmp_int;
		String ciphertext = "XBBALBUQXHHTKOWWGWLZBRQWVZWIMDJ";
		String plaintext;
		System.out.println("Ciphertext : " + ciphertext);
		char ciphertext_array[]= ciphertext.toCharArray();
		char plaintext_array[]= ciphertext.toCharArray();
		for(int i=0;i<ciphertext_array.length;i++) {
			ciphertext_array[i] -= 65;
		}
		for(key=1;key<26;key++) {
			temp_key=key;
			for(int i=0;i<ciphertext_array.length;i++) {
				tmp_int = (int)ciphertext_array[i];
				tmp =tmp_int - temp_key;
				plaintext_array[i] = (char) mod(tmp) ;
				temp_key=(int)plaintext_array[i];
				plaintext_array[i] += 65;
			}
			
			plaintext = new String(plaintext_array);
			if(key<10)
				System.out.println("Key= 0"+key+"  decrypt= "+plaintext);
			else
				System.out.println("Key= "+key+"  decrypt= "+plaintext);
		}
	}
	
	private static int mod(int x)
	{
	    int result = x % 26;
	    if (result < 0)
	    {
	        result += 26;
	    }
	    return result;
	}

}
