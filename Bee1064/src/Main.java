import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double num=0, media=0;
		int positivos=0;
		for(int numero=0;numero<=5;numero++) {
			num=teclado.nextDouble();
			if(num >= 0) {
				positivos++;
				media += num;
			}
		}
		System.out.println(positivos+" valores positivos");
		System.out.printf("%.1f\n", media/positivos);
		teclado.close();
	}
}
