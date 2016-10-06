/*
	Given a string, remove spaces from it

Input: First line of the input is the number of test cases T. And first line of test case contains a string whose spaces are to be removed.

Output:  Modified string without any space

Constraints:  Input String Length <= 1000

Example:
Input:
1
    g f g

Output:
gfg
*/

import java.util.Scanner;
class PracticeProblem6{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		PracticeProblem6 p = new PracticeProblem6();
		System.out.println("\nInput:");
		int n = sc.nextInt();
		sc.nextLine();
		String[] str = new String[n];
		for(int i=0;i<n;i++){
			str[i] = sc.nextLine();
			if(str[i].length() > 1000){
				System.out.print("\nConstraints:  Input String Length <= 1000");
				System.exit(0);
			}
			str[i] = str[i].replaceAll("\\s","");
		}
		
		System.out.println("\nOutput: ");
		for(int i=0;i<n;i++)
			System.out.println(str[i]);
	}
}