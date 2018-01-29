import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		int key;
		int temp_key;
		char tmp;
		int tmp_int;
		String plaintext = "ITISTIMETOTAKESECURITYSERIOUSLY";
		String ciphertext;
		System.out.println("Plaintext : " + plaintext);
		char ciphertext_array[]= plaintext.toCharArray();
		char plaintext_array[]= plaintext.toCharArray();
		for(int i=0;i<plaintext_array.length;i++) {
			plaintext_array[i] -= 65;
		}
		for(key=0;key<26;key++) {
			temp_key=key;
			for(int i=0;i<plaintext_array.length;i++) {
				tmp_int = (int)plaintext_array[i];
				tmp =(char)( tmp_int + temp_key);
				ciphertext_array[i] = (char) mod(tmp) ;
				ciphertext_array[i] += 65;
				temp_key=(int)plaintext_array[i];
			}
			
			ciphertext = new String(ciphertext_array);
			if(key<10)
				System.out.println("Key= 0"+key+"  Encrypt= "+ ciphertext);
			else
				System.out.println("Key= "+key+"  Encrypt= "+ ciphertext);
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
