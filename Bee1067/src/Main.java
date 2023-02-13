import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner tec =new Scanner(System.in);
		int num;
		num=tec.nextInt();
		for(int contador=1;contador<=num;contador+=2) {
			System.out.println(contador);
		}
		tec.close();
	}
}
