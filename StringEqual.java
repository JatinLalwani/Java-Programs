/* Find out whether two strings are the same or not without using the equality operator nor the equals method. */

import java.util.Scanner;
class StringEqual{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter first string: ");
		String str1 = sc.next();
		System.out.print("\nEnter second string: ");
		String str2 = sc.next();
		if(equal(str1,str2))
			System.out.print("\nEqual");
		else
			System.out.print("\nNot Equal");
	}
	
	static boolean equal(String str1,String str2){
		int length1 = str1.length();
		int length2 = str2.length();
		if(length1 != length2)
			return false;
		for(int i=0;i<length1;i++){
			if(str1.charAt(i) != str2.charAt(i))
				return false;
		}
		return true;
	}
}