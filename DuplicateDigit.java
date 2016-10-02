//If the number consists of duplicate digits.

import java.util.Scanner;
class DuplicateDigit{
	int digit;
	public static void main(String... args){
		DuplicateDigit d = new DuplicateDigit();
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter an Integer(not greater than  2^(64)-1): ");
		long n = sc.nextInt();
		if(d.repeated(n))
			System.out.print("\nDigit "+d.digit+" is repeated.\n");
		else
			System.out.print("\nNo digit is repeated.\n");
    }
    
    boolean repeated(long n){
		int r;
		int[] digits = new int[String.valueOf(n).length()]; // using valueOf() method of wrapper class converted long to
		                                                    // String and then calculated its length.sss
		for(int i=0;i<digits.length && n!=0;i++){
			r = (int)n%10;
			digits[i] = r;
			for(int j=i-1;j>=0;j--)
				if(digits[j] == r){
					digit = r;
					return true;
				}
			n/=10;	
		}
		return false;
	}	
}