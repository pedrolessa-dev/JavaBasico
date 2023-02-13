import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int num;
		num = tec.nextInt();
		int inicio = (num % 2 != 0) ? num : num + 1;
		for (int contador = 1; contador <= 6; contador++) {
			System.out.println(inicio);
			inicio += 2;
		}
		tec.close();
	}
}