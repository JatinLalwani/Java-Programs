/*
﻿You are given an array of n integers, each of which may be positive, negative or zero. Give an algorithm to identify the start and end index, i and j, 
of the interval whose elements form the maximal sum of all possible intervals. Assume j >=i 



e.g. {1,3,-8,2,-1,10,-2,1} -> i=3 , j=5 – sum = 11 



Example non-maximal sum intervals: 

i=0, j=5 – sum = 7 

i=2, j=4 – sum = -7*/

// LOGIC:
/* Start from left and for every element start traversing from right
for eg(suppose there are 5 elements): for element 0 -
                                      Elementat(0)+ Elementfrom(4) to Elementat(1)
									  Elementat(0)+ Elementfrom(3) to Elementat(1)
									  Elementat(0)+ Elementfrom(2) to Elementat(1)
									  Elementat(0)+ Elementfrom(1) to Elementat(1)
									  
	                                  for element 1 -
                                       Elementat(1)+ Elementfrom(4) to Elementat(2)
									   Elementat(1)+ Elementfrom(3) to Elementat(2)
									   Elementat(1)+ Elementfrom(2) to Elementat(2)
									   
	Do this for all the elements and store the result in an array(in this I have stored it in max array)
	Along with this put every single element of given array in max array
	Along with this maintain the values of the indices' array(here valueI and valueJ). */

import java.util.Arrays;
class PracticeProblem13{
	public static void main(String... args){
		int[] numbers = {1,2,3,-8,4,5,6,-9};
		int n = numbers.length; // length of given array.
		// length of max array should be equal to 'length' value.
		int length = (n*(n+1))/2;
		int[] temp = new int[length];
		int[] max = new int[length];
		int[] ValueI = new int[length];
		int[] ValueJ = new int[length];
		
		for(int i=0;i<n;i++)
			max[i] = numbers[i];
		// l,m,o are used as indices of max, valueI ,valueJ respectively.
		int sum,l,m,o;
		l=o=m=(n-1); // because first n elements of max are already initialized.
		
		for(int i=0;i<n-1;i++){
			for(int j=n-1;j>=i+1;j--){
				sum = 0;
				for(int k=j;k>=i+1;k--){
					sum += numbers[k]; 
				}
				sum += numbers[i];
				max[l++] = sum;
			    ValueI[m++] = i;
				ValueJ[o++] = j;
			}
			
		}
		for(int i=0;i<length;i++){
			temp[i] = max[i];
		}
		
		Arrays.sort(temp);
		int index=0;
		// to know at what index is the highest element stored.
		for(int y=0;y<length;y++){
			if(temp[length-1] == max[y])
				index=y;
		}
		
		System.out.print("\nThe max sum is: "+temp[length-1]+"\nAnd the range is from "+ValueI[index]+" to "+ValueJ[index]);
	}
}