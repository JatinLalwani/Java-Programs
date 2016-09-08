// A number ‘n’ is called Bleak if it cannot be represented as sum of a positive number x(such that x<n) and 
// set bit count(Number of 1s in binary representation of x) in x.
import java.util.Scanner;
class Bleak{
	int supportingNumber;
	public static void main(String... args){
		int n = -1;
		Bleak b = new Bleak();
		Scanner s = new Scanner(System.in);
		System.out.print("\nA number n is called Bleak if it cannot be represented as sum of a positive number ");
		System.out.println("x(such that x<n) and set bit count(Number of 1s in binary representation of x) in x. \n");
		do{
			System.out.print("\nEnter the number(to check whether it is bleak or not): ");
		    n = s.nextInt();
			if(n<1)
				System.out.println("\n Please enter a number greater than 1.");
		}while(n<1);
		if(b.isBleak(n))
			System.out.println("\nThe number "+n+" is Bleak!");
		else
			System.out.println("\n"+n+" is supported by "+b.supportingNumber+". Therefore, it is not Bleak.");
		
	}
	
	boolean isBleak(int n){
		for(int i=n-1;i>=1;i--){
			if(i+Integer.bitCount(i) == n){// Integer.bitCount(int) is an inbuild java function. It returns the number of
                                           // ones in binary representation of the number passed as argument.			
				supportingNumber = i;
				return false;
			}
		}
		return true;
	}
}