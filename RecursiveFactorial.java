// How to write a Factorial Program.
// step 1: Find the base condition(Simplest) which will not involve recursive call. write it within if statement.
// step 2: Make a recursive call to the method for the next simpler argument.
// step 3: Understand how will it(Step 2) be usefull.
// step 4: Return the needful.

import java.util.Scanner;
class RecursiveFactorial{
	public static void main(String... args){
		RecursiveFactorial r = new RecursiveFactorial();
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter a number: ");
		long n = sc.nextInt();
		System.out.println("\nFactorial of "+n+" is: "+r.fact(n));
	}
	
	// precondition: n>=0
	long fact(long n){
		if(n==0) // step 1: n==0 is the base condition.
			return 1;
		return n*fact(n-1); // step 2,3&4: 
		                    // 2: next simpler argumnent is n-1.
							// 3: how is it useful?: 10! = 10*9!. Therefore, n*fact(n-1).
							// 4: Return.
	}
}