// Takes the sequence of numbers and tells whether the sequence is in AP or GP or None.

import java.util.Scanner;
class APGP{
	public static void main(String... args){
		APGP s = new APGP();
		int[] numbers = s.getNumbers();
		if(s.arithematicProgression(numbers))
			System.out.print("\nThe given sequence is in Arithematic Progression.\n");
		else if(s.geometricProgression(numbers))
			System.out.print("\nThe given sequence is in Geometric Progression.\n");
		else
			System.out.print("\nThe given sequence is neither in Arithematic Progression nor in Geometric Progression.\n");
	}
	
	boolean arithematicProgression(int[] numbers){
		int diff = numbers[1] - numbers[0];
		int i;
	    for(i=2;i<numbers.length;i++){
			if(numbers[i] - numbers[i-1] != diff)
				break;
		}
		
		if(i<numbers.length)
			return false;
		else
			return true;
			
	}
	
	boolean geometricProgression(int[] numbers){
		int i;
		float div = (float)numbers[1]/numbers[0];
	    for(i=2;i<numbers.length;i++){
			if((float)numbers[i]/numbers[i-1] != div)
				break;
		}
		
		if(i<numbers.length)
			return false;
		else
			return true;
	}
	
	int[] getNumbers(){
		int length = 2;
		do{
			Scanner sc = new Scanner(System.in);
		    System.out.print("\nEnter a the sequence(Separated by spaces): ");
	        String strOfNumbers = sc.nextLine();
		    String[] strNumbers = strOfNumbers.split(" ");
			length = strNumbers.length;
			if(strNumbers.length<3)
				System.out.println("\nPlease enter atleast three numbers.");
			else{
				int[] numbers = new int[strNumbers.length];
		        for(int i=0;i<strNumbers.length;i++)
			        numbers[i] = Integer.parseInt(strNumbers[i]);
		        return numbers;
			}
		}while(length<3);
		
		return new int[] {1};  // using this anonymous array just to avoid getting complain from the compiler about
		                       // no return statement. Actually control of execution will never-ever reach here.
							   // But compiler don't understand this :D. I trying to find out a solution of this.
							   // will update as soon as will get the solution.
	}
	
}