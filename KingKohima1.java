/*King Kohima has reserved a new exclusive street for his executive class employees where they can build their 
homes. He has assigned you to plan that street. You have to decide on which plots along the street are new 
building allowed to be built. In order to this, you first want to calculate the number of possible ways of 
assigning free plots to buildings while keeping in mind this restriction – No two consecutive plots can have 
buildings on them. This is done to ensure a sense of free space in the arena. The street is divided in M sections. 
Each section corresponds to 2 plots, one on each side of the street. Find the number of possible assignments.

Input

In the first line you’re given M ( M ≤ 1000 ). Output In the first and only line output the result/ 
Example Input: 3 Output: 25 Example explanation: If we just look at the one street side and mark X as a plot where 
building is allowed and Y as a free plot, we have: XYX, YXY, YYX, XYY, YYY. Since the same number exists on the 
other side, we have 5*5 = 25 combinations. */

//Type 1: In this I only output the number of total combinations on both the sides of street and not the
//        actual combinations. Ofcourse it wont be wont go upto M = 1000. because such a large number cannot
//        be stored in long.
// LOGIC:
/*  M  combinations on one side
    1  2(X,Y)
	2  3
	3  5(ie. 2+3)
	4  8(ie. 3+5)
	5  13(ie. 5+8)
	6  21(ie. 8+13)
	ie the number of combinations on one side of  current values of M is the sum of combinations on one side
	   for previous 2 values of M.
    	*/

import java.util.Scanner;
class KingKohima1{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long[] result = {2,3};
		long answer = 0;
		for(int i=3;i<=n;i++){
			answer = result[0] + result[1];
			result[0] = result[1];
			result[1] = answer;
		}
		System.out.println("the baap answer is: "+(answer*answer));
	}
}