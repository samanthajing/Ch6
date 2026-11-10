public class Scrabble {
    public static boolean canSpell(String tile, String s) {
        for (int i = 0; i < tile.length(); i++) {
            if (lc(tile, tile.charAt(i)) < lc(tile, s.charAt(i))) {
                return false;
            } 
        }
        return true;
    }
    public static int lc(String t, char l) {
        int sum = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == l)
                sum++;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(canSpell("quijio", "jib"));
    }
}
