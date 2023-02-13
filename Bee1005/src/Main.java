import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		/*double nota1, nota2, nota3, media;
		nota1 = teclado.nextDouble();
		nota2 = teclado.nextDouble();
		nota3 = teclado.nextDouble();
		media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
		System.out.printf("MEDIA = %.1f\n", media);
		teclado.close();*/
		int a,b,c,d,diferenca;
		a=teclado.nextInt();
		b=teclado.nextInt();
		c=teclado.nextInt();
		d=teclado.nextInt();
		diferenca=(a*b-c*d);
		teclado.close();
		System.out.println("DIFERENCA = "+diferenca);
	}
}