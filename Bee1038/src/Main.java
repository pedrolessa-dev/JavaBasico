import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int codigo, quantidade;
		double total = 0;
		codigo = teclado.nextInt();
		quantidade = teclado.nextInt();
		if (codigo == 1) {
			total = 4 * quantidade;
		} else if (codigo == 2) {
			total = 4.5 * quantidade;
		} else if (codigo == 3) {
			total = 5 * quantidade;
		} else if (codigo == 4) {
			total = 2 * quantidade;
		} else if (codigo == 5) {
			total = 1.5 * quantidade;
		}
		System.out.printf("Total: R$ %.2f\n", total);
		teclado.close();
	}
}