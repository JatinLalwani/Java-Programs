/* jatin is a cHAMpion  -->  Nitaj Si A Noipmahc*/

class PracticeProblem11{
	public static void main(String... args){
		String str =  "jatin is a Champion";
		String[] strArray = str.split(" ");// splits the complete string and put the spacekess string into the array
		for(int i=0;i<strArray.length;i++){
			strArray[i] = reverse(strArray[i]); // this function is implemented below that reverses the string
			strArray[i] = strArray[i].substring(0,1).toUpperCase()+strArray[i].substring(1,strArray[i].length());
			// make first character uppercase(using substring and not charAt because charAt return a char) + rest.
			System.out.print(strArray[i]+" ");
		}
	}
	
	static String reverse(String str){
		char[] temp = new char[str.length()];
		int length = str.length();
		for(int i=0;i<length;i++){
			temp[i] = str.charAt(length-1-i);
		}
		return new String(temp);
	}
}