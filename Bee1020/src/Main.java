import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		/*int idade, dias, meses, anos, restoMeses, restoAnos;
		idade = teclado.nextInt();
		anos = idade / 365;
		restoAnos = idade % 365;
		meses = restoAnos / 30;
		restoMeses = restoAnos % 30;
		dias = restoMeses;
		System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");
		teclado.close();*/
		double raio,resultado;
		raio = teclado.nextDouble();
		resultado = 3.14159*raio*raio;
		System.out.printf("A=%.4f\n", resultado);
		teclado.close();
	}
}