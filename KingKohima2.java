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

// Type 2: in this I have shown not just the no. of combinations but the possible combinations at one side of the
// street. And I have not taken any inputs from user. I have used my own inputs.

// LOGIC:
// To access all combinations I have use binary numbers from 0 to (2^n) - 1. where i will be replacing 1 with x and 0 with y.
// if a binary number has 2 consecutive 1s then discard it.

import java.lang.Math;
class KingKohima2{
	static int count =0;
	public static void main(String... args){
		int n=4;
		int length = (int)Math.pow(2,n)-1;
		String bin;
		System.out.println("\nCombinations on one side are: ");
		jatin:
		for(int i=0;i<=length;i++){
			
			bin = Integer.toBinaryString(i);
			if(bin.length() < n){
				int diff = n - bin.length();
				for(int j=0;j<diff;j++){
					bin = "0" + bin;
				}
			}
			if(Integer.bitCount(i) == 1){
				printIt(bin);
			} else{
				for(int k=1;k<bin.length();k++){
					if(bin.charAt(k) == '1' && bin.charAt(k-1) == '1')
						continue jatin;
				}
				printIt(bin);
			}
		}
	}
	
	static void printIt(String bin){
		System.out.print((++count)+":  ");
		int length = bin.length();
		for(int i=0;i<length;i++){
			if(bin.charAt(i) == '1')
				System.out.print('X');
			else
				System.out.print('Y');
		}
		System.out.println();
	}
}
