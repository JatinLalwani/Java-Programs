/* Given a array as input lets say A={1,2,-4,-1,0,5,-7,0,3,0} find the subarray with sum of all numbers is max.
ans: sub array is {1,2,5,3,-7,-4} */

import java.util.Arrays;
class MaxProduct{
	public static void main(String... args){
		int[] array = {1,2,-4,-1,0,5,-7,0,3,0};
		Arrays.sort(array); // sort the array first.
		int currentValue,maxValueTillNow,length = array.length;
		// because it is sorted in descending order we initialize the 2 variables with last element.
		currentValue = maxValueTillNow = array[length-1];
		// last element will definitely be there in the array because it is highest.
		if(!(array[length-1] == 0 && array[0] < 0)){
			System.out.print("\nThe sub array is:{ "+array[length-1]+" ");
		} else{ // if array contains only 0s and negatives.
			System.out.print("\nThe sub array is:{ ");
		}
		
		for(int i=length-2;i>=0 && array[i]>0;i--){ // first loop through only +ve elements.
			maxValueTillNow *= array[i];
			System.out.print(array[i]+" ");
		}
		
		currentValue = maxValueTillNow = array[0];
		for(int j=1;j>=0 && array[j]<0;j++){ // then loop through only -ve elements
			currentValue *= array[j];
			if(maxValueTillNow < currentValue){
				maxValueTillNow = currentValue;
				System.out.print(array[--j]+" "+array[++j]+" ");
			}
		}
	    System.out.println("}");
		
	}
}