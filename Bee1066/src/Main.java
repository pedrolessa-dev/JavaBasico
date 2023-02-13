import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, pares = 0, impares = 0, positivos = 0, negativos = 0;
		for (int numero = 0; numero <= 4; numero++) {
			num = teclado.nextInt();
			if (num > 0) {
				positivos++;
			}
			if (num < 0) {
				negativos++;
			}
			if (num % 2 == 0) {
				pares++;
			}
			if (num % 2 != 0) {
				impares++;
			}
		}
		System.out.println(pares + " valor(es) par(es)");
		System.out.println(impares + " valor(es) impar(es)");
		System.out.println(positivos + " valor(es) positivo(s)");
		System.out.println(negativos + " valor(es) negativo(s)");
		teclado.close();
	}
}