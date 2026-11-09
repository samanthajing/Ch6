public class Doubloon {
    public static boolean isDoubloon(String str) {
        str = str.toLowerCase(); 
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);
           
            for (i = 0; i < str.length(); i++) {
                char r = str.charAt(i);
                if (r == s)
                    sum++;
            }
        }
        return sum == 2;
    }
}
