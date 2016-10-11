/* Find subarray with given sum | Set 1 (Nonnegative Numbers)
Given an unsorted array of nonnegative integers, find a continous subarray which adds to a given number.

Examples:

Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
Ouptut: Sum found between indexes 2 and 4

Input: arr[] = {1, 4, 0, 0, 3, 10, 5}, sum = 7
Ouptut: Sum found between indexes 1 and 4

Input: arr[] = {1, 4}, sum = 0
Output: No subarray found
There may be more than one subarrays with sum as the given sum. The following solutions print first such subarray.
   */
	
import java.util.Scanner;
class PracticeProblem15{
	public static void main(String... args){
	    Scanner sc = new Scanner(System.in);
		int[] numbers = {1, 4, 20, 3, 10, 5};
		int n = 33;
        int length = numbers.length;
        int valuei=0,valuej=0,sum=0,i;
		jatin:
        for(i=0;i<length;i++){
			valuei = i;
			sum=0;
			for(int j=i;j<length;j++){
				if(sum+numbers[j] < n){
					sum += numbers[j];
					valuej = j;
				}else if(sum+numbers[j] == n){
					valuej = j;
					break jatin;
				}else{
					continue jatin;
				}
			}
		}
        if(i == length)
           System.out.println("\nNo such subarray found");
        else
           System.out.println("\nThe sub array is from "+valuei+" to "+valuej);			
	}
}