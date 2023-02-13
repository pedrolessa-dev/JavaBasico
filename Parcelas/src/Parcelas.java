import java.util.Scanner;

public class Parcelas {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float valor;
		byte parcela;
		System.out.print("Digite o valor do produto: ");
		valor = teclado.nextFloat();
		System.out.print("Digite o valor máximo de parcelas: ");
		parcela = teclado.nextByte();
		teclado.close();
		System.out.println();
		for (byte contador = 1; contador <= parcela; contador++) {
			System.out.printf("%dx R$ %.2f%n", contador, valor / contador);
		}
	}
}