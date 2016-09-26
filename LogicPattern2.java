/*    +
     + +
    + + +
     - -
      +
    + + +
*/
	
class LogicPattern2{
	public static void main(String... args){
		for(int i=0;i<3;i++){ // first 3 rows.
			for(int j=2-i;j>=0;j--)  // for spaces
				System.out.print(" ");
			
		    for(int k=0;k<i+1;k++) // for first three + rows
			    System.out.print("+ ");
		    System.out.println();
		}
		System.out.print("  - - \n");
		for(int i=0;i<3;i+=2){ // for last 2 lines
			for(int j=2-i;j>=0;j--)
				System.out.print(" ");
			for(int k=0;k<=i;k++)
				System.out.print("+ ");
			System.out.println();
		}			
	}
}
