/* Given a array as input lets say A={1,2,-4,-1,0,5,-7,0,3,0} find the subarray with sum of all numbers is max.
ans: sub array is {1,2,5,3} */

import java.util.Arrays;
class MaxSum{
	public static void main(String... args){
		int[] array = {1,2,-4,-1,0,5,-7,0,3,0};
		Arrays.sort(array); // sort the array first.
		int currentValue,maxValueTillNow,length = array.length;
		// because it is sorted in descending order we initialize the 2 variables with last element.
		currentValue = maxValueTillNow = array[length-1];
		// last elements will definitely be there in the array because it is highest.
		System.out.print("\nThe sub array is:{ "+array[length-1]+" ");
		for(int i=length-2;i>=0;i--){ // loop from second last to first element.
			currentValue += array[i];
            if(currentValue > maxValueTillNow){
				maxValueTillNow = currentValue;
				System.out.print(array[i]+" ");
			}else
				currentValue -= array[i];    				
		}
		System.out.println("}");
	}
}