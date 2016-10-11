/* Sums of all possible subarrays of an array. */

import java.lang.Math;	
class SumOfSubarrays{
	public static void main(String... args){
		int[] numbers = {2,4,1,7,4,9,10,4,6};
		int length = numbers.length;
		int length1 = (int)Math.pow(2,length) - 1;
		String bin;
		int sum = 0,diff=0;
        for(int i=1;i<=length1;i++){
			sum = 0;
			bin = Integer.toBinaryString(i);
			if(bin.length() < length){
			    diff = length-bin.length();
				for(int k=0;k<diff;k++)
					bin = '0'+bin;
			}
			for(int j=0;j<length;j++){
				if(bin.charAt(j) == '1'){
					System.out.print(numbers[j]+" ");
					sum += numbers[j];
				}
			}
			System.out.println(" gives "+sum);
		}
        System.out.print("\nThe total number of subarrays is: "+length1+"\n");		
	}
}