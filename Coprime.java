import java.util.Scanner;
public class Coprime{
	public static void main(String... args){
		Scanner s = new Scanner(System.in);
		System.out.println();
		System.out.println("Coprime numbers are the numbers whose GCD/HCF = 1.");
		System.out.println();
		System.out.println("Enter two integers-");
		System.out.println();
		System.out.print("First integer: ");
		int r1 = s.nextInt();
		System.out.print("Second integer: ");
		int r2 = s.nextInt();
		Coprime c = new Coprime();
		c.Coprime(r1,r2);	
	}
	
	public  void Coprime(int r1, int r2){
		if(r1<r2){
			r1 = r1+r2; // A simple way
			r2 = r1-r2; // to exchange
			r1 = r1-r2; // numbers without temp variable ;).
		}
		
		System.out.println();
		System.out.print("Numbers "+r1+" and "+r2+" are ");
		
		while((r1%r2)!= 0){
			int a = r1;
			r1 = r2;
			r2 = a%r2;
		}
		
		if(r2 == 1){
			System.out.print("Coprime!");
		} else{
			System.out.print("not Coprime.");
		}
		
		System.out.println();
	}
}
