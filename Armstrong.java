import java.util.Scanner;
class Armstrong{
	
	public static void main(String[] a){
		System.out.println("----Armstrong number is a number that is equal to the sum of cubes of its digits for example 0, 1, 153, 370, 371, 407 etc.----");
		System.out.println(");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		
		int temp = n;
		int r,sum=0;
		
		while(n != 0){
			r = n%10;
			n = n/10;
			sum += r*r*r;
		}
		
		if(sum == temp){
	        System.out.println("Armstrong number!");
		} else{
			System.out.println("Not an armstrong number");
		}
	}
}

