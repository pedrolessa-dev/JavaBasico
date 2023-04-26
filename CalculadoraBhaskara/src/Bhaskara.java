import java.util.Scanner;

public class Bhaskara {

	public static void main(String[] args) {
		int a, b, c, delta;
		float x1, x2, x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de a:");
		a = sc.nextInt();
		System.out.println("Digite o valor de b:");
		b = sc.nextInt();
		System.out.println("Digite o valor de c:");
		c = sc.nextInt();
		System.out.println("A equação de segundo grau é:");
		System.out.println(a + "x² + " + b + "x + " + c + " = 0");
		delta = (int) (Math.pow(b, 2) - 4 * a * c);
		System.out.println("O valor de delta é " + delta);
		if (delta > 0) {
			x1 = (float) (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (float) (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("O valor de x1 é " + x1);
			System.out.println("O valor de x2 é " + x2);
		} else if (delta == 0) {
			x = (float) (-b + Math.sqrt(delta)) / (2 * a);
			System.out.println(
					"Como o valor de delta é igual a 0, essa equação possui apenas uma raiz real, que é igual a " + x);
		} else
			System.out.println("Como o valor de delta é menor que 0, essa equação não possui raízes reais");
		sc.close();
	}
}