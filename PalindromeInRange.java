/*
Minimum number: 33

Maximum number: 100

Pallindrome numbers from 33 to 100 are: 33 44 55 66 77 88 99
*/

import java.util.Scanner;
class PalindromeInRange{
	public static void main(String... args){
		PalindromeInRange p = new PalindromeInRange();
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the Range");
		System.out.print("\nMinimum number: ");
		int min = sc.nextInt();
		System.out.print("\nMaximum number: ");
		int max = sc.nextInt();
		p.palindromeInRange(min,max);
	}
	
	void palindromeInRange(int min,int max){
		int sum,num,r;
		System.out.print("\nPallindrome numbers from "+min+" to "+max+" are: ");
		for(int i=min;i<=max;i++){
			sum=0; num=i;
			while(i!=0){
				r = i%10;
				sum=sum*10+r;
				i = i/10;
			}
			
			if(num == sum){
				System.out.print(num+" ");
			}
			i=num;
		}
		System.out.println();
	}
}