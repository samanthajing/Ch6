public class gauss {

	public static double gauss (double x, int n) {
		double sum = 1;
		double term = 1;
		for (int i=1; i<=n; i++) {
			term = term*((-x*x)/i);
			sum += term;
		}
		return sum;
	}
}
