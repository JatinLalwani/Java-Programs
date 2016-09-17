// Printing a 2D array Spirally
// example:
// Input: abc
//        def
//        ijk
// Output: abcfkjide

import java.util.Scanner;
class Spiral{
	public static void main(String... args){
		Spiral s = new Spiral();
		char[][] TwoDArray = s.getArray();
	    s.spiral(TwoDArray);
	}
	
	char[][] getArray(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the dimension of the array(E.g if 3x3 then 3): ");
		int n = sc.nextInt();
		char[][] TwoDArray = new char[n][n];
		System.out.println("\nEnter the numbers in the 2D Array: ");
		for(int i = 0;i<n;i++)
			for(int j = 0;j<n;j++){
				System.out.print("Character at ("+i+","+j+"): ");
				TwoDArray[i][j] = sc.next().charAt(0); // will take in only the first character in the line.
			}
        return TwoDArray;			
	}
	
	void spiral(char[][] TwoDArray){
		int k=0, // Beggining of rows;
		    m=TwoDArray.length-1, //Ending of Rows.
		    l=0, // Beggining of Columns;
			n=TwoDArray.length-1; // Ending of columns
			System.out.println("So the 2D array you provided is-\n");
			for(int i = 0;i<TwoDArray.length;i++){
				for(int j = 0;j<TwoDArray.length;j++)
					System.out.print(TwoDArray[i][j]+" ");
				System.out.println();
			}
				
			System.out.print("\nThe Elements selected Spirally are: ");
		while(k<=m){
			for(int i=k;i<=n;i++) // from Top left, left to right
				System.out.print(TwoDArray[k][i]);
			k++;
			
			for(int i=k;i<=m;i++) // from top right, top to bottom
				System.out.print(TwoDArray[i][n]);
			n--;
			
			for(int i=n;i>=l;i--) // from right bottom, right to left
				System.out.print(TwoDArray[m][i]);
			m--;
			
			for(int i=m;i>=k;i--) // from left bottom, bottom to top.
				System.out.print(TwoDArray[i][l]);
			l++;
		}
		System.out.println();
		
	}
}