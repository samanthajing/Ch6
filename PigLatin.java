public class PigLatin {
    public static String pigLatin(String s) {
        if (s.contains(" ")) {
            convert(s.substring(0, s.indexOf(" ")));
        }
    }
    public static String covert(String word) {
        word = word.toLowerCase();
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.length() > 2) {
                word.substring(i, i + 1) = word.substring(i + 1, i + 2);
                word.substring(word.length() - 1) = word.substring(0, 1);
            } else {
                return word;
            }
            word += "ay";
        }
        return word;
    }
}
