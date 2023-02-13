import java.util.Scanner;

public class INSS {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double valorHora, salarioBruto, salarioLiquido, INSS;
		int quantidade;
		System.out.println("Digite o valor da sua hora:");
		valorHora = keyboard.nextDouble();
		System.out.println("Digite a quantidade de horas trabalhadas:");
		quantidade = keyboard.nextInt();
		salarioBruto = valorHora * quantidade;
		INSS = salarioBruto * 10 / 100;
		salarioLiquido = salarioBruto - INSS;
		System.out.println("Você trabalhou " + quantidade + " horas e sua hora vale " + valorHora);
		System.out.println("O valor do salário bruto é " + salarioBruto);
		System.out.println("Com o desconto do INSS (10%), seu salário líquido é: " + salarioLiquido);
		keyboard.close();
	}
}