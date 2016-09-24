import java.util.Scanner;
class TowerOfHanoi{
	int count=0;
	public static void main(String... args){
		TowerOfHanoi t = new TowerOfHanoi();
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the number of Disks(>0): ");
		int n = sc.nextInt();
		String Source = "Source",Auxillary = "Auxillary", Destination = "Destination";
		t.towerOfHanoi(n,Source,Auxillary,Destination);
	}
	
	void towerOfHanoi(int n,String Source,String Auxillary,String Destination){
		if(n>0){
			towerOfHanoi(n-1,Source,Destination,Auxillary);
			System.out.println("\nStep: "+(++count));
		    System.out.println("Move disk "+n+" from "+Source+" to "+Destination);
		    towerOfHanoi(n-1,Auxillary,Source,Destination);
		}	
	}
}