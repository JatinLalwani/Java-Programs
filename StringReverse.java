// "jatin knows java" to "avaj swonk nitaj"

import java.util.Scanner;
class StringReverse{
	public static void main(String... args){
		StringReverse s = new StringReverse();
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter a String: ");
		String str = sc.nextLine();
		String reversedString = s.strRev(str);
		System.out.println("\nReversed String: "+reversedString+"\n");
		
	}
	
	String strRev(String s){
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
/* ALTERNATIVE SOLUTION
class StringReverse{
	public static void main(String... args){
		String s = "jatin knows java";
        StringBuilder builder = new StringBuilder(s);
        System.out.println(builder.reverse());
	}
}
*/