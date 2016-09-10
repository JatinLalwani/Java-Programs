// "jatin knows java" to "nitaj swonk avaj"

import java.util.Scanner;
class ReverseWords{
	public static void main(String... args){
		ReverseWords s = new ReverseWords();
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter a String: ");
	    String str = sc.nextLine();
		String[] strArray = str.split(" ");
		System.out.print("\nThe string with words reversed: ");
		for(String ss : strArray)
			System.out.print(s.strRev(ss)+" ");
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