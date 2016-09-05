// The Fibonacci sequence is a series of numbers where a number is found by adding up the two numbers before it. 
// Starting with 0 and 1, the sequence goes 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, and so forth.
import java.util.Scanner;
class Fibonacci{
	public static void main(String... args){
		Scanner s = new Scanner(System.in);
		Fibonacci f = new Fibonacci();
		int n = -1;
		while(n<0){
			System.out.print("\nEnter a number(of elements): ");
		    n = s.nextInt();
			if(n<=0){
				System.out.print("\nAbsurd Number.");
			}
		}
		
		f.fibonacci(n);
	}
	
	void fibonacci(int n){
		System.out.print("\nFibonacci Sequence of "+n+" element(s): ");
		if(n == 1){
			System.out.print("0.");
		}else if(n == 2){
			System.out.print("0 1.");
		}else{
			long temp;
			long a=0l,b=1l;
			System.out.print("0 1 ");
			for(int i=2;i<n;i++){
				System.out.print((a+b)+" ");
				temp = a;
				a = b;
				b = b+temp;
			}
			System.out.println();
		}
	}
	
}