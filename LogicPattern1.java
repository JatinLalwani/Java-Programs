/*           *
            * *
	   *   *
	  *     *
	   *   *
	    * *
	     *
*/
		 
class LogicPattern1{
	public static void main(String... args){
		int[][] a = new int[7][7];
		
		for(int i=0;i<7;i++){
			
			for (int j=0;j<7;j++){
				if(i<4){
					if(j<4){
						if((i+j)==3){
							System.out.print("*");
						} else{
							System.out.print(" ");
						}
					} else{
						if((j-i)==3){
							System.out.print("*");
						} else{
							System.out.print(" ");
						}
					}
				} else{
					if(j<4){
						if((i-j)==3){
							System.out.print("*");
						} else{
							System.out.print(" ");
						}
					} else{
						if((i+j)==9){
							System.out.print("*");
						} else{
							System.out.print(" ");
						}
					}
				}
				
			}
			
			System.out.println();
		}
	}
}
