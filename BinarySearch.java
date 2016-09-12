// Binary search. Accepts a sorted array and a number to be searched and returns if the number present or not.

import java.util.Scanner;
class BinarySearch{
	static int count=0; // will count the number of elemets accessed.
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		BinarySearch b = new BinarySearch();
		int[] numbers = b.getNumbers(); // The function gets and returns the sorted array from the user.
		System.out.print("\nEnter the number to be searched: ");
		int n = sc.nextInt();
		sc.nextLine(); // This is added purposely. otherwise the jvm wont be able to find next string.
		if(b.binSearch(numbers,n) != -1){
			System.out.println("\nThe number "+n+" is at position "+b.binSearch(numbers,n)+".");
		    System.out.println("\n"+count+" number of elements were accessed to search the number.");
		}else{
			System.out.println("\n Sorry, "+n+" was not found!");
		}
		
	}
	
	int[] getNumbers(){
		Scanner sc = new Scanner(System.in);
		do{
			System.out.print("\nEnter the sorted list(numbers separated by a single space otherwise an exception will be thrown): ");
			String str = sc.nextLine();
			String[] strNumbers = str.split(" ");
			int[] numbers = new int[strNumbers.length+1]; // +1 because i am also sending value of diff with the array.
			for(int i=0;i<strNumbers.length;i++)
				numbers[i] = Integer.parseInt(strNumbers[i]); // converts the numbers in the form of string to int.
			
			    
				int i=1,diff=0;
				if(strNumbers.length==1){// if array is of length 1/2 the no need to check for asec/desc
					numbers[strNumbers.length] = diff;
					return numbers;
				}
				if(strNumbers.length==2){ // if array is of length 1/2 the no need to check for asec/desc
					diff = numbers[1] - numbers[0];
					numbers[strNumbers.length] = diff;
					return numbers;
				}else{
					diff = numbers[1] - numbers[0];
				if(diff<=0) // if the complete array gives <0 then it is in descending order
					for(i=strNumbers.length-1;diff<=0 && i>0;i--)
					    diff = numbers[i] - numbers[i-1];
				else if(diff>=0) // if the complete array gives >0 then it is in ascending order.
					for(i=strNumbers.length-1;diff>=0 && i>0;i--)
					    diff = numbers[i] - numbers[i-1];
				}
				
				 if(i==0){
					 numbers[strNumbers.length] = diff;
					 return numbers;	 
				 }	
			     System.out.print("\nPlease enter a sorted list(of size > 0).\n");
		}while(true);
		
	}
	
	int binSearch(int[] numbers, int n){
		int first = 0;
		int last = numbers.length-2;
		int middle = last/2;
		int diff = numbers[numbers.length-1]; // I returned the value of diff as the last element of the array.why?watch below.
		int c=0;
		if(diff>0){ // if diff>0 then ascending and the code is bit different.
		   while(first <= last){
				c++;
			if(n < numbers[middle]){
				last = middle-1;
				middle = (first+last)/2;
			}else if(n == numbers[middle]){
				count=c; // I was not able to figure out why not count was working properly. i was using it the way I am using
				         // 'c' here. But it wasn't showing proper result. will find out the problem and update this.
				return middle+1;
			}	
			else{
				first = middle+1;
				middle = (first+last)/2;
			}
		  }
		}
		
		else{// if diff<0 then descending and the code is bit different.
		  while(first <= last){
				c++;
			if(n > numbers[middle]){
				last = middle-1;
				middle = (first+last)/2;
			}else if(n == numbers[middle]){
				count=c;
				return middle+1;
			}	
			else{
				first = middle+1;
				middle = (first+last)/2;
			}
		  }
			
		}
		return -1; // if element not found.
		
	}
}