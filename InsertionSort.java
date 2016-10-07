import java.util.Scanner;
class InsertionSort{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the number of elements: ");
		int n = sc.nextInt();
		int[] numbers = new int[n];
		System.out.print("\nEnter the elements: ");
		for(int i=0;i<n;i++)
			numbers[i] = sc.nextInt();
		numbers = insertionSort(numbers);
		System.out.print("\nSorted array ");
		for(int i=0;i<n;i++)
			System.out.print(numbers[i]+" ");
		System.out.println();
	}
	
	static int[] insertionSort(int[] numbers){
		int n = numbers.length;
		int key,temp,j;
		for(int i=1;i<n;i++){
			key = numbers[i];
			for(j=i-1;j>=0;j--){
				if(key < numbers[j])
					numbers[j+1] = numbers[j];
			}
			numbers[++j] = key;
		}
		return numbers;
	}
}