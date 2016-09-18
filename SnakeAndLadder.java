import java.util.Scanner;
import java.util.Random;
class SnakeAndLadder{
	public static void main(String... args){
		SnakeAndLadder s = new SnakeAndLadder();
		int [][] board = new int [5][6];
		System.out.println("\nThe board- \n");
		int k=24;
		for(int i=0;i<5;i++){
			if(i%2==0){
				for(int j=0;j<6;j++){
					k++;
					//System.out.print(board[i][j] = ""+(k)+"\t");
					board[i][j] = k;
				}
				k=k-5;
			}else{
			    for(int j=0;j<6;j++){
					k--;
					// System.out.print(board[i][j] = ""+(k)+"\t");
					board[i][j] = k;
				}
			    k=k-7;
			}
		}
		
		System.out.println("025  026  0S1  028  029  030");
		System.out.println("024  023  022  0S9  L29  0s7");
		System.out.println("013  014  015  016  0S4  018");
		System.out.println("012  L26  010  009  008  007");
		System.out.println("001  002  L22  004  0L8  006");
		System.out.println();
		
		System.out.print("The above board even consists of some Ls and Ss which represent Ladders and Snakes Respectively.");
		System.out.print(" The numbers following them are the numbers you will jump to if you are on that position.\n");
		
		s.snakeLadders(board);
	}
	
	void snakeLadders(int[][] board){
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int sum=1,dice,noOfLeaps=0;
		Game: while(true){
			System.out.print("\nThrow the Dice!(Press Enter)");
		    sc.nextLine();
			System.out.print("\nYou got..."+(dice = r.nextInt(6)+1)+"!");
			sum+=dice;
			switch(sum){
				case 17:
				   System.out.print(" OOps Snake!! ");
				   sum = 4;
				   break;
				case 19:
				  System.out.print(" OOps Snake!! ");
				   sum = 7;
				   break;
				case 21:
				  System.out.print(" OOps Snake!! ");
				   sum = 9;
				   break;
				case 27:
				  System.out.print(" OOps Snake!! ");
				   sum = 1;
				   break;
				
				case 3:
				  System.out.print(" Woah Ladder!! ");
				   sum = 22;
				   break;
				case 5:
				  System.out.print(" Woah Ladder!! ");
				   sum = 8;
				   break;
				case 11:
				  System.out.print(" Woah Ladder!! ");
				   sum = 26;
				   break;
				case 20:
				  System.out.print(" Woah Ladder!! ");
				   sum = 29;
				   break;
				
				default:
				   if(sum<30){
					   System.out.print(" Nothing special. ");
				   } else if(sum==30){
					   noOfLeaps++;
					   System.out.println("\n\nYou win!!\n");
					   System.out.println("It took you "+noOfLeaps+" moves to reach 30\n");
					   System.out.print("Have a nice day!\n");
					   break Game;
				   }else{
					   sum-=dice;
					   System.out.print("You need a little smaller value on dice.\n");
				   }
				   
			}
			noOfLeaps++;
			System.out.println("You are now on "+sum+".");
		}
		
		
	}
	
}