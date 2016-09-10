// Reverses both string as well as words.
// "jatin knows java" to "avaj swonk nitaj".
// Other types of String reversal are also there in the repository.

import java.util.Scanner;
class RevStrAndWords{
	public static void main(String... args){
		RevStrAndWords s = new RevStrAndWords();
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter a String: ");
	    String str = sc.nextLine();
		String[] strArray = str.split(" ");
		System.out.print("\nThe string with words reversed: ");
		for(int i=strArray.length-1;i>=0;i--)
			System.out.print(s.strRev(strArray[i])+" ");
		System.out.println();
		
	}
	
	public String strRev(String s){
		char[] chars = s.toCharArray();
		char temp;
		for(int i=0;i<(chars.length/2);i++){
			temp = chars[i];
			chars[i] = chars[chars.length-1-i];
			chars[chars.length-1-i] = temp;
		}
		return new String(chars);
	}
}