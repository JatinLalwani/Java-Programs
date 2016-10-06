/* char[] str = {‘s’,’t’,’ ‘,’r’,’i’,’ ‘,’g’}; WAP to print this without spaces. */

class PracticeProblem10{
	public static void main(String... args){
		char[] str = {'s',' ','t','r','i',' ','n','g'};
		String string = new String(str);
		System.out.print("\n"+string.replaceAll("\\s","")+"\n");
		                    // str_variable.replaceAll("\\s","") removes all empty spaces.
	}
}