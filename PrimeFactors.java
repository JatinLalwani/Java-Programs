import java.util.*;
class PrimeFactors{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		System.out.println("-------PRIME FACTORS---------");
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		System.out.print("Prime factors of "+n+" are: ");
		Factors(n);
			
		}
		
		static void Factors(int n){
			for(int i=2;i<=n;i++){
				if(Prime(i)){
					if(n%i == 0){
						n=n/i;
						System.out.print(i+" ");
						i=2;
					}
				}
			}
		}
		
		static Boolean Prime(int i){
			int j;
			for(j=2;j<i;j++){
				if(i%j == 0)
					break;
			}
			
			if(j<i){
				return false;
			} else{
				return true;
			}
		}
	}
