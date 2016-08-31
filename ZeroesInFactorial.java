// To find out the number of zeroes trailing the factorial of a number.

import java.util.Scanner;
class ZeroesInFactorial{
	public static void main(String... args){
		System.out.println();
		System.out.println("To find out the number of zeroes trailing the factorial of a number.");
		System.out.println();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n = s.nextInt();
		System.out.println();
		if(n<0){
			System.out.println("Please enter a valid input");
			System.out.println();
		} else if(n>=0 && n<=4){
			System.out.println("Number of zeroes trailing "+n+"! is: "+0);
			System.out.println();
		}else{
			int count = noOfFives(n); // we are supposed to find number of Fives in PrimeFactors. So this will calculate prime
		                          // factors and will return number of fives in it.
		
            System.out.print("Number of zeroes trailing "+n+"! is/are: "+count);
			System.out.println();
		}
						
	}
	
	static int noOfFives(int n){
		int count=0;
		for(int i=2;i<=n;i++){
			if(i<=5){
				if(prime(i) && (n%i)==0){
				n = n/i;
				if(i == 5){
					count++;
				} 
				i--;
			}
			}else{
				break;
			}
		}
		
		return count;
	}
	
	static boolean prime(int n){
		int i;
		for(i=2;i<=(n/2);i++){
			if(n%i == 0)
			    break;	
		}
		
		
		if(i>n/2)
			return true;
		else
			return false;
	}
}