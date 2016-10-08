/* Print the ranks of the array elements according to thier ascending order 
eg: Input: {7,-4,0,4,-44,8,7,2}
    Output: 5  1 2 4  0  6 5 3 */
	
import java.util.Arrays;
class RankOfNumbers{
	public static void main(String... args){
		int[] numbers = {7,-4,0,4,-44,8,7,2};
		int n = numbers.length;
		int[] temp = new int[n]; //  1st temp array
		int count=0,k=0;
		jatin: // label
		for(int i=0;i<n;i++){ // This block puts the elements of numbers[] into temp[] without repeatation.
			for(int j=i-1;j>=0;j--)
				if(numbers[i] == numbers[j])
					continue jatin;
			temp[k++] = numbers[i];
			count++;
		}
		
		int[] temp1 = new int[count]; // temp1[] because we need to sort temp[] but temp[] has unwanted values
                                      // in it why?	because the length of the temp[] is n but we put values in it
                                      // without repeatation, therefore, there are empty spaces in it which will
                                      // be zero by default. And so we cannot sort such an array with unwanted
                                      // elments(zeroes) in it.									  
		for(int j=0;j<count;j++){
			temp1[j] = temp[j];
		}
		
			
		Arrays.sort(temp1);
		
		System.out.print("\nRanks are: ");
		for(int i=0;i<n;i++){
			for(int j=0;j<count;j++){
				if(numbers[i] == temp1[j]){ // numbers[i] is compared with sorted temp1[] and if a match is found
				                            // it's index is printed.
					System.out.print(j+" ");
				    break;
				}
					
			}
		}
	}
}