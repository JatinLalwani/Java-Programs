/*
        1
       212
      32123
     4321234
    543212345
   65432123456
  7654321234567
 876543212345678
98765432123456789
 876543212345678
  7654321234567
   65432123456
    543212345
     4321234
      32123
       212
        1
		
*/

class LogicPattern3{
	public static void main(String... args){
		for(int i=0;i<9;i++){  // first 9 rows
			for(int k=0;k<8-i;k++) // spaces
				System.out.print(" ");
			for(int j=i+1;j>0;j--) // print from i+1 to 1
				System.out.print(j);
			for(int l=2;l<=i+1;l++) // print from 2 to i+1
				System.out.print(l);
			System.out.println();
		}
		
		for(int i=8;i>=1;i--){ // next 8 rows
			for(int k=0;k<9-i;k++)
				System.out.print(" "); // spaces
			for(int j=i;j>=1;j--)
				System.out.print(j); // print from i+1 to 1
			for(int l=2;l<=i;l++)
				System.out.print(l); // print from 2 to i+1
			System.out.println();
		}
	}
}