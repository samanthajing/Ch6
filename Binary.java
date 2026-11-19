public class Binary {
    public static String convertToBinary(int n) {
        String ans = "";
        while (n != 0) {
            int r = n % 2;
            n = n / 2;
            ans += r;
        }
        return ans;
    } 
}
