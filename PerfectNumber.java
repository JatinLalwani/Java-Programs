import java.util.Scanner;
class PerfectNumber{
	
	public static void main(String[] a){
		
		// sum of the factors of perfect number is the number itself.
           System.out.println("----Sum of the factors of perfect number is the number itself----");
           System.out.println();		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		boolean b = isperfect(n);
		if(b){
		 	System.out.println("perfect number");
		} else{
			System.out.println("Not a perfect number");
		}
		
	        
	}
	static boolean isperfect(int n){
		int sum = 0;
			for(int i = 1;i<n;i++){
				if(n%i == 0){
					sum += i;
				}
			}
			
			if (sum == n)
				return true;
			else
				return false;
		}
}

