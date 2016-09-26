/*

**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********

*/

// Logic is, for a row Print required number of Stars then print space(if needed) and then again print stars.

class LogicPattern4{
	public static void main(String... args){
		for(int i=0;i<5;i++){ // first five rows.
			for(int j=5-i;j>0;j--)
				System.out.print("*"); 
			for(int k=0;k<i;k++)
				System.out.print("  "); // Double space.
			for(int j=5-i;j>0;j--)
				System.out.print("*");
			System.out.println();
		}
		
		for(int i=0;i<5;i++){ // Next five rows.
			for(int j=i;j>=0;j--)
				System.out.print("*");
			for(int k=4-i;k>0;k--)
				System.out.print("  ");
			for(int j=i;j>=0;j--)
				System.out.print("*");
			System.out.println();
		}
	}
}
