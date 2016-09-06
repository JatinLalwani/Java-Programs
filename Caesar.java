// Caesar cipher is the simplest encrypting method.
// This program takes in all the characters available on the keyboard.

import java.util.Scanner;
class Caesar{
	
	static int k;
	public static void main(String... args){
		System.out.println("\nCaesar cipher is the simplest encrypting method.");
		System.out.println("This program takes in all the characters available on the keyboard.");
		Scanner s = new Scanner(System.in);
		System.out.print("\nEnter a key: ");
		k = s.nextInt();
		Caesar c = new Caesar();
		System.out.println("\n-----MENU------");
		System.out.println("1. Encryption");
	    System.out.println("2. Decryption");
		System.out.println("3. Change the Key");
		System.out.println("4. Exit\n");
		int option;
		String CT,PT;
		
		do{
			System.out.print("Enter your option(1/2/3/4): ");
		    option = s.nextInt();
			s.nextLine();
			switch(option){
				case 1:
				  System.out.print("Enter a text you want to encrypt: ");
				  PT = s.nextLine();
				  CT = c.caesarEncrypt(PT,k);
				  System.out.print("The Encrypted text is: "+CT+"\n");
				  break;
				case 2:
				  System.out.print("Enter a text you want to decrypt: ");
				  CT = s.nextLine();
				  PT = c.caesarDecrypt(CT,k);
				  System.out.print("The Encrypted text is: "+PT+"\n");
				  break;
				case 3:
				  c.changeKey();
				  break;
				case 4:
				  System.out.print("\nHave a nice day!\n");
				  break;
				default:
				  System.out.print("\nPlease choose a valid option.");
				  break;
			}
		}while(option != 4);
		
	}
	
	String caesarEncrypt(String PT, int k){
		Scanner s = new Scanner(System.in);
		char[] chars = PT.toCharArray();
		for(int i=0;i<chars.length;i++){
			chars[i] = (char)(((chars[i] - 32 + k)%94)+32);// "-32" because we are dealing with numbers 0 to 94.
					                                       // using keyboard we can only type chars from 32 to 126.
					                                       // "+32" because we actually need characters from
									                       // 32 to 126(ASCII)as output.
		}
		return new String(chars);
		
	}
	
	String caesarDecrypt(String CT, int k){
		Scanner s = new Scanner(System.in);
		char[] chars = CT.toCharArray();
		for(int i=0;i<chars.length;i++){
			if((chars[i] - 32 - k)%94 < 0){
				chars[i] =  (char)(((chars[i] - 32 - k)%94)+94+32);// "-32" for the same reason as above.
						                                           // "+94" because ['-ve'%94] should be +ve. But
														           // my machine is returning -ve.
																   // "+32" for same reason as above.
		    } else{
				chars[i] =  (char)(((chars[i] - 32 - k)%94)+32);
			}
		}
		return new String(chars);
	}
	
	void changeKey(){
		Scanner s = new Scanner(System.in);
		System.out.print("\nEnter a Key: ");
		k = s.nextInt();
	}
    
    	
}