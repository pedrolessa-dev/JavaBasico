import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		double x, y;
		x = tec.nextDouble();
		y = tec.nextDouble();
		if (x > 0 && y > 0) {
			System.out.println("Q1");
		} else if (x > 0 && y < 0) {
			System.out.println("Q4");
		} else if (x < 0 && y > 0) {
			System.out.println("Q2");
		} else if (x < 0 && y < 0) {
			System.out.println("Q3");
		} else if (x == 0 && y != 0) {
			System.out.println("Eixo Y");
		} else if (x != 0 && y == 0) {
			System.out.println("Eixo X");
		} else {
			System.out.println("Origem");
		}
		tec.close();
	}
}