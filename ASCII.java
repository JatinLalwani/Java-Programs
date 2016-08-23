import java.util.Scanner;
class ASCII{
	public static void main(String[] a){
		System.out.println("----Conversion from Character to its ASCII Value----");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------MENU------------------------");
		System.out.println("1. Conversion from Character to its ASCII value.");
		System.out.println("2. Conversion from ASCII value to its Character.");
		System.out.println("3. Exit.");
		System.out.println();
		int option;
		do{
	    System.out.print("Choose your option(1/2/3): ");
		option = sc.nextInt();
        
		switch(option){
			case 1:
			System.out.print("Enter a Character(Note: If you will enter a string it will output the ASCII value of first character.): ");
			char c = sc.next().charAt(0);
		    System.out.println("ASCII value of "+c+" is: "+(int)c);
			System.out.println();
			System.out.println();
			break;
			
			case 2:
			System.out.print("Enter a number between -1 and 256: ");
		    int n = sc.nextInt();
			if(n > 255){
				System.out.println("ASCII values are from 0 to 255.");
				System.out.println();
				System.out.println();
				break;
			}
			System.out.println("Character at ASCII value "+n+" is: "+(char)n);
			System.out.println();
			System.out.println();
            break;	
			
			case 3:
			System.out.println("Good-Bye have a nice day!");
			break;
			
			default:
			System.out.println("Please choose 1/2/3 as your option.");
			System.out.println();
			System.out.println();
		}	    
		
		}while(option != 3);
			
	}
}