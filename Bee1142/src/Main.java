import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int n, r = 1;
		n = tec.nextInt();
		for (int contador = 1; contador <= n; contador++) {
			System.out.print(r++ + " ");
			System.out.print(r++ + " ");
			System.out.println(r++ + " PUM");
			r++;
		}
		tec.close();
	}
}