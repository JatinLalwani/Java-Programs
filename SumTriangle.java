/* Let's consider a triangle of numbers in which a number appears in the first line, two numbers appear in the second line, three in the third line, etc. Develop a program which will compute the largest of the sums of numbers that appear on the paths starting from the top towards the base, so that:

on each path the next number is located on the row below, more precisely either directly below or below and one place to the right;
the number of rows is strictly positive, but less than 100
all numbers are positive integers between O and 99.
Input

In the first line integer n - the number of test cases (equal to about 1000). Then n test cases follow. 
Each test case starts with the number of lines which is followed by their content.

Output

For each test case write the determined value in a separate line.

Example

Input:
2
3
1
2 1
1 2 3
4 
1 
1 2 
4 1 2
2 3 1 1 

Output:
5
9
 */
 
 // LOGIC:
 /* Traverse all the possible combinations from top to bottom.
    Every time when you travese you make one element -1.
    example:
	
    1   1     1      1
    12  12    -12    -12
    123	-123   -123  -1-13  like wise. treverse from top to bottom. if the value is -1 take an immediate right.*/

import java.util.Scanner;
import java.lang.Math;	
class SumTriangle{
	public static void main(String... args){
	    Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
		int[] results = new int[TC];// for i, for many test cases only one array.
		int[] tempResults;
		int[][] values;
        for(int i=0;i<TC;i++){
			int noOfLevels = sc.nextInt();
			values = new int[noOfLevels][noOfLevels];
			
			// Getting values from the user.
            for(int m=0;m<noOfLevels;m++){ 
				for(int n=0;n<=m;n++){
					values[m][n] = sc.nextInt();
				}
			}
            
            int k=0,length1 = (int)Math.pow(2,(noOfLevels-1)),sum=0;
			tempResults = new int[length1];
			
			// Filling up the sums of all possible combinations in tempResults.
            for(int j=0;j<length1;j++){// length1 is the number of combinations.
				k=0; // check first
				sum = values[0][0];
				int l;
				for(l=1;l<noOfLevels;l++){ // looping through all rows.
					if(values[l][k] == -1){
						k++;
					}
					sum += values[l][k];
				}
				l--; // because of above for loop. when the control of execution will come out of this for loop
				     // values of l will be out of bounds of the array.
				tempResults[j] = sum;
				if(j%2 == 0) 
				    values[l][k] = -1;
				else
					values[l-1][k-1] = -1;
			}
			
			// Finding out the max in tempResults[].
			int max=-1;
            for(int p=0;p<length1;p++){
				if(max < tempResults[p])
					max = tempResults[p];
			}
            results[i] = max; 			
		}
		
		// Output:
		System.out.println("\nOutput: ");
        for(int i=0;i<TC;i++)
            System.out.println(results[i]);			
	}
}