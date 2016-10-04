/*
wap for given INDABCINDAKLND as an input string stored in singly linked list , whenever D and A is found
immediately in a string , insert I in between D and A.
*/
import java.util.Scanner;
class PracticeProblem2{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		PracticeProblem2 p = new PracticeProblem2();
		System.out.print("\nEnter a string: ");
		String str = sc.nextLine();
		System.out.print("\nModified string is: "+p.insertChar(str)+"\n");
	}

    String insertChar(String str){
		for(int i=0;i<str.length()-1;i++) // for every character.
			if(str.charAt(i) == 'd' && str.charAt(++i) == 'a') // if current char is 'd' and next is 'a'
				str = str.substring(0,i)+"i"+str.substring(i,str.length()); // put 'i'
			else if(str.charAt(i) == 'D' && str.charAt(++i) == 'A') // for capital characters.
				str = str.substring(0,i)+"I"+str.substring(i,str.length());
		return str;		
    }
}