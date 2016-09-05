// A Simple program to find out the factorial of a number.
// Can only take values up to 20. For bigger values you can use 'BigInteger' in java. 

import java.util.Scanner;
class Factorial{
	public static void main(String... args){
		Scanner s = new Scanner(System.in);
		Factorial f = new Factorial();
		int n = -1;
		while(n < 0){
			System.out.print("\nEnter a number(less than 21 otherwise the value will be too huge for java(long) to handle.): ");
	        n = s.nextInt();
		    if(n<0){
			    System.out.println("\nAbsurd value. Please enter a Non-negative number.");
		    }
		}
	    
	    System.out.println("\nThe Factorial of "+n+" is: "+f.Factorial(n)+".");
	}
	
	long Factorial(int n){
		long fact = 1l;
		if(n==0){
			return 1;
		}else{
			for(int i=1;i<=n;i++){
				fact*=i;
			}
		}
		return fact;
	}
	
}