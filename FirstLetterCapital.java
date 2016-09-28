// jatin knows java  -->  Jatin Knows Java

import java.util.Scanner;
class FirstLetterCapital{
	public static void main(String... args){
		FirstLetterCapital c = new FirstLetterCapital();
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter a String: ");
		String str = sc.nextLine(); // Accepting the string
		System.out.print("\nModified String: "+c.firstLetterCapital(str)+"\n"); // Printing modified array.
	}
	
	String firstLetterCapital(String str){
		String[] strArray = str.split(" "); // String to string array w.r.t spaces
		str = ""; 
		String tempStr;
		for(int i=0;i<strArray.length;i++){
			strArray[i] = strArray[i].substring(0, 1).toUpperCase() + strArray[i].substring(1); // String[i] = first character of
			                                                                                    // String[i] to capital +
																								// Remaining sub-string of
																								// String[i]
			str += strArray[i]+" ";// +" " is added for a space.
		}
			
		return str;
	}
}