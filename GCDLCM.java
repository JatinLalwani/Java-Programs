import java.util.Scanner;
class Try{
	public static void main(String... args){
		System.out.println("----To find out the Greatest common divisor(GCD)/ Highest common factor(HCF) and Least common multiple(LCM).----");
		System.out.println();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number");
		int n1 = sc.nextInt();
		System.out.println("Enter the second number");
		int n2 = sc.nextInt();
		int Dividend,Divisor,Quotient,Remainder,GCD;
		
		if(n1 > n2){
				Dividend = n1;
				Divisor = n2;
			} else{
				Dividend = n2;
				Divisor = n1;
			}
			
		
		do{
			
			Quotient = Dividend/Divisor;
			Remainder = Dividend%Divisor;
			
			GCD = Divisor;
			Dividend = Divisor;
			Divisor = Remainder;
		} while(Divisor != 0);
		
		int n = n1*n2;
		int LCM = n/GCD;
		
		System.out.println("The GCD and LCM of the two numbers are: "+GCD+" and "+LCM+" respectively.");
		
		
	}
}