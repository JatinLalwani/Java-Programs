// Multiplication cipher is one of the simple cipher techniques.
// This program takes in all the characters of keyboard.

import java.util.Scanner;
class MultiplicationCipher{
	int key,invKey;
	static String PT,CT;
	
	public static void main(String... args){
		System.out.println("\n\nMultiplication cipher is one of the simple cipher techniques.");
		System.out.println("This program takes in all the characters of keyboard.");
		Scanner s = new Scanner(System.in);
		MultiplicationCipher m = new MultiplicationCipher();
		m.changeKey(); // To get the key.
		System.out.println("\n-----MENU------");
		System.out.println("1. Encryption");
	    System.out.println("2. Decryption");
		System.out.println("3. Change the Key");
		System.out.println("4. Exit\n");
		int option;
		
		do{
			System.out.print("\nEnter your option(1/2/3/4): ");
		    option = s.nextInt();
			s.nextLine();
			switch(option){
				case 1:
				  System.out.print("\n\nEnter a text you want to encrypt: ");
				  PT = s.nextLine();
				  CT = m.multEncrypt(PT);
				  System.out.println("\nThe Encrypted text is: "+CT);
				  break;
				case 2:
				  System.out.print("\nEnter a text you want to decrypt: ");
				  CT = s.nextLine();
				  PT = m.multDecrypt(CT);
				  System.out.println("\nThe Decrypted text is: "+PT);
				  break;
				case 3:
				  m.changeKey();
				  break;
				case 4:
				  System.out.println("\nHave a nice day!");
				  break;
				default:
				  System.out.println("\nPlease enter a valid option(1/2/3/4).");
			}
		}while(option != 4);
		
	}
	
	String multEncrypt(String PT){
		char[] chars = PT.toCharArray();
		for(int i=0;i<chars.length;i++){
			chars[i] = (char)((((chars[i]-32)*key)%94)+32);// "-32" because we are dealing with numbers 0 to 94.
					                                       // and using keyboard we can only type chars from 32 to 126.
					                                       // "+32" because we actually need characters from
									                       // 32 to 126(ASCII)as output.
		}
		return new String(chars);
	}
	
	String multDecrypt(String CT){
		char[] chars = CT.toCharArray();
		for(int i=0;i<chars.length;i++){
			if((((chars[i]-32)*invKey)%94) < 0){
				chars[i] =  (char)((((chars[i]-32)*invKey)%94)+94+32);// "-32" for the same reason as above.
						                                             // "+94" because ['-ve'%94] should be +ve. But
																	 // my machine is returning -ve.
																	 // "+32" for same reason as above.
			} else{
				chars[i] =  (char)((((chars[i]-32)*invKey)%94)+32);
			 }
					  
	    }
		return new String(chars);
	}
	
	void changeKey(){
		Scanner s = new Scanner(System.in);
		do{
			System.out.print("\nEnter the key(Positive whole number and coprime to 94.): ");
		    key = s.nextInt();
			if(key<1 || !Coprime(key,94))
				System.out.println("\nPlease Enter a Positive whole number that is coprime to 94.");
		}while(key<1 || !Coprime(key,94));
		invKey = MultiplicativeInverse(key);
		
	}
	
	int MultiplicativeInverse(int k1){ // Returns multiplicative inverse of a number.
		int i;
			i = 1;
			while((i*94+1)%k1 != 0){
				i++;
			}
			
			return (i*94+1)/k1;
		
	}
	
	boolean Coprime(int r1, int r2){ // Returns true if the arguments are coprime.
		if(r1<r2){
			r1 = r1+r2; // A simple way
			r2 = r1-r2; // to exchange
			r1 = r1-r2; // numbers without temp variable ;).
		}
		
		
		while((r1%r2)!= 0){
			int a = r1;
			r1 = r2;
			r2 = a%r2;
		}
		
		if(r2 == 1){
			return true;
		} else{
			return false;
		}
		
		
	}
	
}