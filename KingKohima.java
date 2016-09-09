// see description
import java.util.Scanner;
class KingKohima{
	private static int m;
	static KingKohima k = new KingKohima();
	public static void main(String... args){
		k.getNumberOfSections();
		System.out.print("\nThe number of possible assignments are: "+k.possibleAssignments(m)+".\n");
	}
	
	void getNumberOfSections(){
		Scanner sc = new Scanner(System.in);
		do{
			System.out.print("\nEnter the number of sections(greater than 0): ");
			m = sc.nextInt();
			if(m<1)
				System.out.print("\nPlease enter valid number of sections.");
		}while(m<1);
	}
    
	int possibleAssignments(int n){
		return (n*n-2*(n-1))*(n*n-2*(n-1));
	}
}