/*
Enter a string: jatin wins!!

Enter a character you want to know the position of: w

The character w was at position 7.
*/
import java.util.Scanner;
class CharOccurence{
	public static void main(String... args){
		CharOccurence c = new CharOccurence();
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter a string: ");
		String str = sc.nextLine();
		System.out.print("\nEnter a character you want to know the position of: ");
		char Char = sc.next().charAt(0); // Pay attention. This is the way to accept a char from the user.
		if(c.charOccur(str,Char) == -1){
			System.out.print("\nThe character "+Char+" was not found :(\n");
			System.exit(0);
		} else{
			System.out.print("\nThe character "+Char+" was at position "+(c.charOccur(str,Char)+1)+".\n");
		}	
	}
	
	int charOccur(String str,char c){
		int i;
		for(i=0;i<str.length();i++) 
			if(str.charAt(i) == c)
				break;
			
		if(i==str.length())
			return -1;
		return i;
	}
}
