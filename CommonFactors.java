import java.util.Scanner;
class CommonFactors{
	public static void main(String... args){
		System.out.println("TO FIND OUT THE COMMON FACTORS\n");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the numbers (Separated by commas):");
		String line = sc.next();
		String[] numbers = line.split("\\s*,\\s*");
		int[] a = new int[numbers.length];
		int i;
		for( i=0;i<numbers.length;i++){
			a[i] = Integer.parseInt(numbers[i]);
		}
		
		int max = a[0];
		for(i=0; i<numbers.length; i++){
			if(max<a[i]){
				max = a[i];
			}
		}
		
		int count;
		
		System.out.print("The common factor(s) of ");
		for(i=0; i<numbers.length; i++){
			if(i != (numbers.length-1)){
				System.out.print(a[i]+", ");
			} else{
				System.out.print(a[i]+" ");
			}
			
		}
		
		System.out.print("is/are: ");
		
		for(int j=1;j<=max;j++){
			count = 0;
			for(i=0; i<numbers.length; i++){
				if(a[i]%j == 0){
					count++;
				} else{
					break;
				}
				
			}
			
			if(count == numbers.length){
				System.out.print(j+" ");
			}
		}
			
	}
}