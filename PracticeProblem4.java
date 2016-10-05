/*
	Write a program to find second largest number in an array
*/

import java.util.Scanner;
class PracticeProblem4{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		PracticeProblem4 p = new PracticeProblem4();
		System.out.print("\nEnter the numbers(separated by single spaces): ");
		String str = sc.nextLine();
		String[] strArray = str.split(" ");
		int[] numbers = new int[strArray.length];
		int i=0;
		for(String strNumber : strArray)
			numbers[i++] = Integer.parseInt(strNumber);
		System.out.print("\nThe second largest number in the array is: "+p.secondLargest(numbers)+"\n");
	}
	
	int secondLargest(int[] numbers){
		if(numbers.length == 1) // only 1 element in the array.
			return numbers[0];
		int max1,max2;
		max1 = numbers[0]; max2 = numbers[1];
		for(int i=1;i<numbers.length;i++)
			if(numbers[i] > max1){
				max2 = max1;
				max1 = numbers[i];
			} else if(numbers[i] > max2 && numbers[i] != max1)
				max2 = numbers[i];
		return max2;	
	}
}