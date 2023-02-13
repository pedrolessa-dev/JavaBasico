import java.util.Scanner;

public class SalarioKw {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double salarioMinimo, quantidadeKw, valorKw, valorPago, desconto;
		System.out.println("Digite o valor do salário mínimo:");
		salarioMinimo = keyboard.nextDouble();
		System.out.println("Digite a quantidade de kw gasta pela residência:");
		quantidadeKw = keyboard.nextDouble();
		valorKw = salarioMinimo / 700;
		System.out.printf("O valor de cada kw é: R$%.2f\n", valorKw);
		valorPago = valorKw * quantidadeKw;
		System.out.printf("O valor a ser pago é: R$%.2f\n", valorPago);
		desconto = valorPago - valorPago * 0.1;
		System.out.printf("Com o desconto de 10%%, você pagará: R$%.2f\n", desconto);
		keyboard.close();
	}
}