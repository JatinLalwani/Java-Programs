/*
	Given two positive numbers x and y, check if y is a power of x or not.

Input:
First line contains an integer, the number of test cases 'T'. Each test case should contain two positive numbers x and y.


Output:
Print 1 if y is a power of x, else print 0.


Constraints: 
1<=T<=30
1<=x<=1000
1<=y<=100000000


Example:
Input:
2
2 8
1 3

Output:
1
0

Explanation: 8 is a power of 2, but 3 is not a power of 1.
*/

import java.util.Scanner;
import java.lang.*;
class PracticeProblem5{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		PracticeProblem5 p = new PracticeProblem5();
		int n = sc.nextInt();
		if(!(n>=1 && n<=30)){
			System.out.print("Constraints: 1<=T<=30 1<=x<=1000 1<=y<=100000000");
			System.exit(0);
		} else{
			int[] results = new int[n];
			int x,y;
			for(int i=0;i<n;i++){
				x = sc.nextInt();
				y = sc.nextInt();
				if(!((x >= 1 && x <= 1000) && (y>=1 && y<=100000000))){
					System.out.print("Constraints: 1<=T<=30 1<=x<=1000 1<=y<=100000000");
					System.exit(0);
				} else{
					int value;
					for(int j=1;j<=Integer.MAX_VALUE;j++){
						value = (int)Math.pow(x,j);
						if(value > y || x==1){
							results[i] = 0;
							break;
						} else if(value == y){
							results[i] = 1;
							break;
						}
							
						    
					}
				}
			}
			for(int i=0;i<n;i++)
				System.out.println(results[i]);
		}
	}
}