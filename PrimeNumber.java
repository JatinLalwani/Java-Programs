import java.util.Scanner;
class PrimeNumber{
	
	public static void main(String[] a){
		System.out.println("---A prime number (or a prime) is a natural number 'greater' than 1.---");
		System.out.println();
		Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
		int n = s.nextInt();
		int count = 0;
		
		
		if(n<=1){
			System.out.println("A prime number (or a prime) is a natural number 'greater' than 1.");
		}
		
		for(int i = 1;i<n;i++){
			if((n%i) == 0){
				count++;
			}
		}
		
		if((count > 1)){
			System.out.println("Not a Prime number");
		} else{
			System.out.println("Prime number");
		}
		
	}
}

