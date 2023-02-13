public class Main {
	public static void main(String[] args) {
		double a, c, S = 0;
		for (a = 1; a <= 100; a++) {
			c = 1 / a;
			S += c;
		}
		System.out.printf("%.2f%n", S);
	}
}