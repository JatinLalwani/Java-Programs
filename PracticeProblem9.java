/* Addition of all digits of binary representation of a decimal number */

import java.util.Scanner;
class PracticeProblem9{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		PracticeProblem9 p = new PracticeProblem9();
		System.out.print("\nEnter a number: ");	
		int n = sc.nextInt(); //accept the int
		String binRepresentation = Integer.toBinaryString(n); // convert it into binary string using inbuild func.
		long binNumber = Long.parseLong(binRepresentation); // convert that string to integer(long).
        System.out.print("\nThe binary representation is: "+binNumber+"\n");
		System.out.print("\nThe sum of Binary representation of "+n+" is: "+p.binSum(binNumber)+"\n");
	}
	
	int binSum(long n){
		int sum = 0;
		while(n != 0){
			sum += (int)n%10;
			n /= 10;
		}
		return sum;
	}
}