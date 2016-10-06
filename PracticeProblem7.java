/*
	Write a program to sort an array of 0's,1's and 2's in ascending order.

Input:
The first line contains an integer 'T' denoting the total number of test cases. In each test cases, First line is number of elements in array 'N' and second its values.

Output: 
Print the sorted array of 0's, 1's and 2's.

Constraints: 

1 <= T <= 100
1 <= N <= 100
0 <= arr[i] <= 2

Example:

Input :

2
5
0 2 1 2 0
3
0 1 0
 

Output:

0 0 1 2 2
0 0 1
*/

import java.util.Scanner;
import java.util.Arrays;
class PracticeProblem7{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		PracticeProblem7 p = new PracticeProblem7();
		System.out.println("\nInput:");
		int n = sc.nextInt();
		if(!(n >= 1 && n <= 100)){
				System.out.print("between 1 and 100");
				System.exit(0);
			}
		int[][] arrays = new int[n][];
		int numberOfElements;
		for(int i=0;i<n;i++){
			numberOfElements = sc.nextInt();
			arrays[i] = new int[numberOfElements];
			if(!(numberOfElements >= 1 && numberOfElements <= 100)){
				System.out.print("between 1 and 100");
				System.exit(0);
			}
			for(int j =0;j<numberOfElements;j++){
				arrays[i][j] = sc.nextInt();
				
                if(!(arrays[i][j] == 0 || arrays[i][j] == 1 || arrays[i][j] == 2)){
					System.out.print("\nPlease enter array of 0's, 1's and 2's");
					System.exit(0);
				}				
			}
			Arrays.sort(arrays[i]);
		}
		
		System.out.println("Output: ");
		for(int i=0;i<n;i++){
			for(int j =0;j<arrays[i].length;j++)
				System.out.print(arrays[i][j]+" ");
			System.out.println();
		}
	}
}