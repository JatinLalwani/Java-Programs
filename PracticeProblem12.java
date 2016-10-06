/* Given  {"hello","aaa","hi"} dispaly 1 if reverse of a string exists in the input else 0.
ans: here reverse("hello")="olleh" which is not in input , so display 0
similarly for "aaa" , u should display 1. */

class PracticeProblem12{
	public static void main(String... args){
		String[] str = {"hello","aaa","hi"};
		String strRev;
		jatin:
		for(int i=0;i<str.length;i++){
			strRev = reverse(str[i]);
			
			for(int j=0;j<str.length;j++){
				if(strRev.equals(str[j])){
					// REMEMBER: DO NOT USE '==' instead of '.equals'.
					// == just compares the address bits in variables(which is different) but equals() compares the content.
					System.out.println(1);
					continue jatin;
				}
			}
			System.out.println(0);
		}
	}
	
	static String reverse(String str){
		char[] c = str.toCharArray();
		char temp;
		int length = str.length();
		for(int i=0;i<length/2;i++){
			temp = c[i];
			c[i] = c[length-1-i];
			c[length-1-i] = temp;
		}
		return new String(c);
	}
}