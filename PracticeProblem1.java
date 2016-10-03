/*
.If input string is ABCDJKCBJ and char is B, wap to to display two strings i.e,one string left to B and other right of B
ans:
AC
CJ
*/

import java.util.Scanner;
class PracticeProblem1{
	int digit;
	public static void main(String... args){
		PracticeProblem1 d = new PracticeProblem1();
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the string: ");
		String str = sc.nextLine();
		System.out.print("\nEnter a character: ");
		char c = sc.next().charAt(0);
		try{ // If the given character also appears at the end of the string then line 21 will throw out of bounds exception.
			for(int i=0;i<str.length();i++)
			if(str.charAt(i) == c)
				System.out.println(""+str.charAt(i-1)+str.charAt(i+1)); // # 21
		} catch(Exception e){
			    System.out.println(""+str.charAt(str.length()-2)); 
		}
		
	}	
}