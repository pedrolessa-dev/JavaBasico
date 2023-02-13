import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		double salario, reajuste, novoSalario;
		salario = tec.nextDouble();
		if (salario <= 400) {
			reajuste = salario * 15 / 100;
			novoSalario = salario + (salario * 15 / 100);
			System.out.printf("Novo salario: %.2f%n", novoSalario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 15 %");
		} else if (salario <= 800) {
			reajuste = salario * 12 / 100;
			novoSalario = salario + (salario * 12 / 100);
			System.out.printf("Novo salario: %.2f%n", novoSalario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 12 %");
		} else if (salario <= 1200) {
			reajuste = salario * 10 / 100;
			novoSalario = salario + (salario * 10 / 100);
			System.out.printf("Novo salario: %.2f%n", novoSalario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 10 %");
		} else if (salario <= 2000) {
			reajuste = salario * 7 / 100;
			novoSalario = salario + (salario * 7 / 100);
			System.out.printf("Novo salario: %.2f%n", novoSalario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 7 %");
		} else {
			reajuste = salario * 4 / 100;
			novoSalario = salario + (salario * 4 / 100);
			System.out.printf("Novo salario: %.2f%n", novoSalario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 4 %");
		}
		tec.close();
	}
}