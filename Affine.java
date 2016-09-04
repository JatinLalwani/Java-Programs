// The following program takes all the characters available on the keyboard and Encrypt and Decrypt them using Affine Cipher.
// The size of the characters is 94(All charracters from the keyboard).

import java.util.Scanner;
class Affine{
	static int k1,k2;
	static String PT,CT;
	public static void main(String... args){
		
		Scanner s = new Scanner(System.in);
		Affine a = new Affine();
	    a.getKeys();
		int option;
		
			System.out.println("\n----MENU-----");
			System.out.println("1. Encryption");
			System.out.println("2. Decryption");
			System.out.println("3. Change Keys");
			System.out.println("4. Exit\n");
			
		do{
			System.out.print("\nChoose an option(1/2/3/4): ");
			option = s.nextInt();
			s.nextLine();
			
			switch (option){
				case 1:
				  System.out.print("\nEnter a String you want to Encrypt: ");
				  PT = s.nextLine();
				  char[] chars = PT.toCharArray();
				  for(int i=0;i<chars.length;i++){
					  chars[i] = (char)((((chars[i]-32)*k1 + k2)%94)+32);// "-32" because we are dealing with numbers 0 to 94.
					                                                     // using keyboard we can only type chars from 32 to 126.
					                                                     // "+32" because we actually need characters from
																		 // 32 to 126(ASCII)as output.
				  }
				  CT = new String(chars);
				  System.out.println("\nEncrypted text: "+CT+"\n");
				  break;
				
				case 2:
				  System.out.print("\nEnter the String you want to Decrypt: ");
				  CT = s.nextLine();
				  chars = CT.toCharArray();
				  int k3 = MultiplicativeInverse(k1);
				  for(int i=0;i<chars.length;i++){
					  if((((chars[i]-32-k2)*k3)%94) < 0){
						  chars[i] =  (char)((((chars[i]-32-k2)*k3)%94)+94+32);// "-32" for the same reason as above.
						                                                       // "+94" because ['-ve'%94] should be +ve. But
																			   // my machine is returning -ve.
																			   // "+32" for same reason as above.
					  } else{
						  chars[i] =  (char)((((chars[i]-32-k2)*k3)%94)+32);
					  }
					  
				  }
				  PT = new String(chars);
				  System.out.print("\nDecrpted Text: "+PT+"\n");
				  break;
				
				case 3:
				  a.getKeys();
				  break;
				case 4:
				  System.out.println("\nHave a nice day!\n");
				  break;
				  
				default:
				  System.out.println("\nPlease select one of the four options(1/2/3/4).\n");
			}
			
		} while(option != 4);
		
	}
	
	void getKeys(){ // Gets the input(Keys) from the user.
		Scanner s = new Scanner(System.in);
		int k3 = -1;
		while(k3 == -1){
			System.out.print("\nEnter the First key(Coprime to 94): ");
			k1 = s.nextInt();
		    k3 = MultiplicativeInverse(k1);
		    if(k3 == -1){
			   System.out.println("\n"+k1+" is not Coprime to 94.\n");
		    }
		}
		
		k2 = 128;
		while(!(k2>=0 && k2<=93)){
			System.out.print("\nEnter the Second key(Betweem 0 and 93): ");
			k2 = s.nextInt();
			if(!(k2>=0 && k2<=93)){
				System.out.println("\nNumber should be between 0 and 93.\n");
			}
		}
	}
	
	static int MultiplicativeInverse(int k1){ // Returns multiplicative inverse of a number.
		int i;
		if(!Coprime(k1,94))
			return -1;
		else{
			i = 1;
			while((i*94+1)%k1 != 0){
				i++;
			}
			
			return (i*94+1)/k1;
		}
	}
	
	static boolean Coprime(int r1, int r2){ // Returns true if the arguments are coprime.
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