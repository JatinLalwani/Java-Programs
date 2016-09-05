//A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
import java.util.Scanner;
class Palindrome{
	public static void main(String... args){
		Scanner s = new Scanner(System.in);
		System.out.println("\nA palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.");
		System.out.print("\nEnter a string(to check whether it is a palindrome or not): ");
		String a = s.nextLine();
		Palindrome p = new Palindrome();
		if(p.palindrome(a)){
			System.out.println("\n'"+a+"' is a palindrome!");
		} else{
			System.out.println("\n'"+a+"' is a not a palindrome!");
		}
	}
	
	boolean palindrome(String a){
		int i,j;
		char[] c = a.toCharArray();
		for(i=0,j=c.length-1;i<=j;i++,j--){
			if(c[i] != c[j])
				break;
		}
		
		if(i>j){
			return true;
		} else{
			return false;
		}
	}
}