// step 0: 4621
// step 1: 421|6
// step 2: 21|46
// step 3: 1246

import java.util.Scanner;
class BubbleSort{
	public static void main(String... args){
		BubbleSort b = new BubbleSort();
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter an array of integers(separated by single spaces): ");
		String str =  sc.nextLine(); // Taking the input as a string
		String[] strArray = str.split(" "); // splitting the string into number of strings(each containing a number in string type).
		int[] Numbers = new int[strArray.length]; // creatin an int array
		int i=0;
		for(String string : strArray)
			Numbers[i++] = Integer.parseInt(string); // transfering string integers as integers in Numbers array
		Numbers = b.bubbleSort(Numbers);
		System.out.print("\nSorted Array: ");
		for(int j : Numbers)
			System.out.print(j+" ");
		System.out.println();
	}
	
	int[] bubbleSort(int[] Numbers){
		for(int i=Numbers.length-1;i>=0;i--)
			for(int j=0;j<i;j++){
				if(Numbers[j] > Numbers[j+1]){
					Numbers[j] = Numbers[j] + Numbers[j+1];
					Numbers[j+1] = Numbers[j] - Numbers[j+1];
					Numbers[j] = Numbers[j] - Numbers[j+1];
				}
	        }
		return Numbers;	
    }
	
}