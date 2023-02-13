import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int inicio, fim, resultado;
		inicio = tec.nextInt();
		fim = tec.nextInt();
		if (inicio < fim) {
			resultado = fim - inicio;
		} else {
			resultado = (fim - inicio) + 24;
		}
		System.out.println("O JOGO DUROU " + resultado + " HORA(S)");
		tec.close();
	}
}