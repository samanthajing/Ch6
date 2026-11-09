public class Abecedarian {

	public static boolean isAbecedarian(String str){
		int a = 0;
		for (int i=0; i<str.length()-2; i++) {
			if (str.charAt(i)!=str.charAt(i+1)) {
			a++;
			}
		}
		return a==0;
	}
}
