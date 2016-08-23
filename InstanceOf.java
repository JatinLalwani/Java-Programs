class Try{
	
}

class Try1 extends Try{
	
}

class InstanceOf{
	public static void main(String... args){
        System.out.println("-----'instanceof' is a feature in java which returns true if the reference variable is an instance of the given class else it returns false.----");
        System.out.println();
		Try a = new Try();
		Try b = new Try1();
		Try1 c = new Try1();
		System.out.println("Try is superclass and Try1 is a subclass");
	    System.out.println();

		System.out.println("for, Try a = new Try(), a instanceof Try?: "+(a instanceof Try));
		System.out.println("for, Try a = new Try(), a instanceof Try1?: "+(a instanceof Try1));
		System.out.println("for, Try a = new Try1(), a instanceof Try?: "+(b instanceof Try));
		System.out.println("for, Try a = new Try1(), a instanceof Try1?: "+(b instanceof Try1));
		System.out.println("for, Try1 a = new Try1(), a instanceof Try?: "+(c instanceof Try));
		System.out.println("for, Try1 a = new Try1(), a instanceof Try1?: "+(c instanceof Try1));
	}
}