import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		double media, num = 1, idade = 0, soma = 0;
		while (num > 0) {
			num = t.nextDouble();
			idade++;
			soma += num;
			if (num < 0) {
				soma -= num;
				idade--;
			}
		}
		media = soma / idade;
		System.out.printf("%.2f%n", media);
		t.close();
	}
}