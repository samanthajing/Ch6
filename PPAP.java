public class PPAP {
	public static String ppap (String s) {
		String objectOne = s.substring(10, s.indexOf(","));
		String objectTwo = s.substring(20 + objectOne.length() + 1);
		return "Uh! " + objectTwo + " " + objectOne;
	}
}
