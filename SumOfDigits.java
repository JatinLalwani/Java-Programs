// Given two integers N and M (Non negative), 
// find the sum of digits of all integers from N to M, both inclusive. Example: Input: 1 10 Output: 46

import java.util.Scanner;
class SumOfDigits{
	private static int m,n,sum;
	static SumOfDigits s = new SumOfDigits();
	public static void main(String... args){
		s.getNumbers();
		System.out.print("\nThe sum of the digits is: "+s.sumOfDigits(m,n)+".\n");
	}
	
	int sumOfDigits(int m,int n){
		s.sum = 0;
		
		if(m>n){
			n=m+n; // used to
			m=n-m; // interchange the
			n=n-m; // numbers ;)
		}
		
		for(int i=m;i<=n;i++){
			int[] digits = s.digits(i);
			for(int j=0;j<digits.length;j++)
				s.sum += digits[j];
		}
		
		return s.sum;
	}
	
	void getNumbers(){
		Scanner sc = new Scanner(System.in);
		do{
			System.out.print("\nEnter two numbers(Non-negative): ");
	        m = sc.nextInt();
		    n = sc.nextInt();
			if(m<0 || n<0)
				System.out.print("\nPlease enter two Non negative numbers.\n");
		}while(m<0 || n<0);
	}
	
	int[] digits(int i){
		int[] digits = new int[10];
		int j=0;
		while(i!=0){
			digits[j] = i%10;
			i= i/10;
			j++;
		}
		return digits;	
	}
	
}