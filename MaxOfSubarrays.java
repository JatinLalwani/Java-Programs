/* Given an array and an integer k, find the maximum for each and every contiguous subarray of size k.

Examples:

Input :
arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6}
k = 3
Output :
3 3 4 5 5 5 6

Input :
arr[] = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13}
k = 4
Output :
10 10 10 15 15 90 90 */
	
class MaxOfSubarrays{
	public static void main(String... args){
		int[] numbers = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
		int k = 3,max=0;
		int length = numbers.length;
		System.out.print("\nOutput: ");
        for(int i=0;i<=length-k;i++){
			max = numbers[i];
			for(int j=i;j<k+i;j++){
				if(numbers[j] > max)
					max = numbers[j];
			}
			System.out.print(max+" ");		
		}
        System.out.println();		
	}
}