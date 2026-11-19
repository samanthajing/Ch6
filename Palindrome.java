public class Palindrome {
    public static boolean isPalindrome(String s) {
        String nonLetters = ",.:;()[]{}!@#$%^&* ";
        String t = s;
        for (int i = 0; i < s.length(); i++) {
			if (nonLetters.contains(s.substring(i, i+1))) {
                i++;
			} else {
                t.substring(i, i + 1) = s.substring(i, i + 1);
			}
        }
        int n = 0;
        for (int j = 0; j < t.length(); j++) {
            if (t.substring(j, j + 1).equals(t.substring(t.length() - 1 - j))) {
                n++;
            }
        }
        return n == t.length();
    }
}
