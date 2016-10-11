/* Print all possible combinations of r elements in a given array of size n
Given an array of size n, generate and print all possible combinations of r elements in array. 
For example, if input array is {1, 2, 3, 4} and r is 2, then output should be,
{1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 4} and {3, 4}. */

import java.lang.Math;	
class SubarraysOfLengthR{
	public static void main(String... args){
		int[] numbers = {8, 5, 1,3,51,4,2};
		int r = 6;
        int length = numbers.length;
        int length1 = (int)Math.pow(2,length)-1;
		String bin;
		System.out.println("\nAll possible subarrays of length "+r+" are:");
        for(int i=0;i<=length1;i++){
			if(Integer.bitCount(i) == r){
				bin = Integer.toBinaryString(i);
				if(bin.length() < length){
					int diff = length - bin.length();
					for(int k=0;k<diff;k++)
						bin = '0' + bin;
				}
				System.out.print("{ ");
				for(int j=0;j<length;j++){
					if(bin.charAt(j) == '1')
						System.out.print(numbers[j]+" ");
				}
				System.out.println("}");
			}
		}		
	}
}