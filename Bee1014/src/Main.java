import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int distancia;
		double combustivel, resultado;
		distancia = teclado.nextInt();
		combustivel = teclado.nextDouble();
		resultado = distancia / combustivel;
		System.out.printf("%.3f", resultado);
		System.out.println(" km/l");
		teclado.close();
	}
}