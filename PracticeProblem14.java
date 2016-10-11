/* We are given a string consisting of digits, we may group these digits into sub-groups (but maintaining their original order). The task is to count number of groupings such that for every sub-group except the last one, sum of digits in a sub-group is less than or equal to sum of the digits in the sub-group immediately on its right.

For example, a valid grouping of digits of number 1119 is (1-11-9). Sum of digits in first subgroup is 1, next subgroup is 2, and last subgroup is 9. Sum of every subgroup is less than or equal to its immediate right.

Input : "1119"
Output: 7
Sub-groups: [1-119], [1-1-19], [1-11-9], [1-1-1-9],
            [11-19] and [111-9].
Note : Here we have included [1119] in the group and
       sum of digits is 12 and this group has no 
       immediate right.

Input : "1234"
Output: 6
Sub-groups : [1234], [1-234], [12-34], [1-2-3-4],
             [12-3-4] and [1-2-34] */
			 
// LOGIC:
/* use binary numbers to get all the combinations
   for example if it is a four digit number we will use 4 digit binary numbers to get all the combinations
   example : 412   
   all three digit binary numbers are: 000,001,010,011,100,101,110,111.
   how does these numbers give us the combinations?
   000 -> 412
   001 -> 41-2
   010 -> 4-1-2
   011 -> 4-12
   100 -> 4-12
   101 -> 4-1-2
   110 -> 41-2
   111 -> 412
   three digit binary numbers will give you each combination twice.
   
   */
	
import java.lang.Math;
import java.util.Scanner;
class PracticeProblem14{
	public static void main(String... args){
		PracticeProblem14 p = new PracticeProblem14();
	    Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the string of digits: ");
		String str = sc.next();
		int length = str.length();
		int[] numbers = new int[length];
		for(int i=0;i<length;i++)
			numbers[i] = Integer.parseInt(str.substring(i,i+1));
		int count=0;
		int length1 = (int)(Math.pow(2,length) - 1);
		//System.out.print("\nlength1 is: "+length1);
		String bin;
		int[] result = new int[length];
		for(int i=1;i<=length1/2;i++){ // length1 is max no. in binary representation.
			bin = Integer.toBinaryString(i);
			
			if(bin.length() < length){ // because we need all four didgit binary numbers. but Integer.toBinaryString(2)
				                       // will return 10 not 0010. this block is used to fix this.
				int diff = length-bin.length();
				for(int l=0;l<diff;l++){
					bin = "0" + bin;
				}
			}
			
			System.out.print("\nfor this: "+bin+" Array is: ");
			int k=1,j=1,index=length;
			result[0] = numbers[0]; // first put first digit from numbers to result.
			
			while(j<length){
				if(bin.charAt(j) == bin.charAt(j-1)){ // if two binary digits(current and previous) are equal (00/11) then
				                                      // add it with the current value of result.
					k--;
					result[k] = result[k] + numbers[j];
					j++;
					k++;
					index--;
				}else{
					result[k] = numbers[j];
					j++;
					k++;
				}
			}
			if(p.isValid(result,index)){
				count++;
				//System.out.println(count);
			}
		}
		System.out.println("\nThe number valid combinations is: "+(count+1));
	}
	
	boolean isValid(int[] result, int length){
		//System.out.print("Array is: ");
		for(int i=0;i<length;i++){
			System.out.print(result[i]+" ");
		}
		for(int i=1;i<length;i++){
			if(!(result[i] >= result[i-1])){
				System.out.print("  Returned false");
				return false;
			}
		}
				
	    System.out.print("  Returned true");		
		return true;	
	}
}