/*
Find out the sum of all digit from M to N (both inclusive)

Input
 M=1 ,N=10
Output
46  (1+2+3+4+5+6+7+8+9+1+0)
Input M=10 N=15
Output 
21  (1+0+1+1+1+2+1+3+1+4+1+5)
*/

import java.util.Scanner;
class PracticeProblem3{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		PracticeProblem3 p = new PracticeProblem3();
		System.out.print("\nEnter the first number: ");
		int m = sc.nextInt();
		System.out.print("\nEnter the second number: ");
		int n = sc.nextInt();
		if(m>n){ // Then swap
			n=m+n;
			m=n-m;
			n=n-m;
		}
		System.out.print("\nThe sum of digits between "+m+" and "+n+" is: "+p.sumOfDigits(m,n)+"\n");
	}
	
	int sumOfDigits(int m,int n){
		int sum=0;
		for(int i=m;i<=n;i++){ // from m to n
			int temp = i;
			while(temp != 0){ 
				sum += temp%10;
				temp /= 10;
			}
		}
		return sum;
	}
}