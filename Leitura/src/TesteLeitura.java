import java.util.Scanner;

public class TesteLeitura {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int valor1;
		double valor2;
		System.out.println("Digite um valor:");
		valor1 = keyboard.nextInt();
		System.out.println("Você digitou o valor: " + valor1);
		System.out.println("Digite outro valor:");
		valor2 = keyboard.nextDouble();
		keyboard.close();
		System.out.println("Você digitou o valor: " + valor2);
	}
}