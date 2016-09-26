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

class LogicPattern4{
	public static void main(String... args){
		for(int i=0;i<5;i++){
			for(int j=5-i;j>0;j--)
				System.out.print("*");
			for(int k=0;k<i;k++)
				System.out.print("  ");
			for(int j=5-i;j>0;j--)
				System.out.print("*");
			System.out.println();
		}
		
		for(int i=0;i<5;i++){
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