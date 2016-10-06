/*
	For a given array find out the GCD of the array.

Input:
First line of input contains the number of test cases 'T'. First line of test case contain an the size 'N' of array. Second line of test cases contain the array elements.


Output:
Find GCD and print it in seperate line. 


Constraints:
1 <= T <= 32
1 <= N <= 20
1 <= Arr[i] <= 100


Example:
Input:
1
2
5 10

Output:
5
*/

import java.util.Scanner;
import java.util.Arrays;
class PracticeProblem8{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		PracticeProblem8 p = new PracticeProblem8();
		System.out.println("\nInput:");
		int n = sc.nextInt(); // number of test cases.
		if(!(n >= 1 && n <= 32)){
				System.out.print("\nbetween 1 and 32");
				System.exit(0);
			}
		int[] Gcd = new int[n]; // Gcd of each test case will be stored.
        int[] numbers; // numbers of the test case will be stored here.
        int gcd; // gcd of any two elements.		
	    for(int i=0;i<n;i++){
			int noOfElements = sc.nextInt(); // no. of elements in that particular test case.
			if(!(noOfElements >= 1 && noOfElements <= 20)){
				System.out.println("\nbetween 1 and 20");
				System.exit(0);
			}
			numbers = new int[noOfElements];
			for(int k=0;k<noOfElements;k++){ // receiving all elements.
				numbers[k] = sc.nextInt();
				if(!(numbers[k] >= 1 && numbers[k] <= 100)){
					System.out.print("\n1 <= Arr[i] <= 100");
					System.exit(0);
				}
			}
			if(noOfElements == 1){ // if a test case have only one element then that number itself is gcd.
				Gcd[i] = numbers[0];
				continue;
			}
			gcd = p.Gcd(numbers[0],numbers[1]); // in the beginning gcd of first 2 elements is calculated.
			for(int j=2;j<noOfElements;j++){
				gcd = p.Gcd(gcd,numbers[j]);
			}
			Gcd[i] = gcd;
		}
		
		System.out.println("\nOutput: ");
		for(int i=0;i<n;i++)
			System.out.println(Gcd[i]);
	}
	
	int Gcd(int m, int n){
		int temp;
		if(m<n){
			temp = m;
			m = n;
			n = temp;
		}
		
		while(m%n != 0){ // actual gcd logic starts from here.
			temp = n;
			n = m%n;
			m = temp;
		}
		return n;
	}
}