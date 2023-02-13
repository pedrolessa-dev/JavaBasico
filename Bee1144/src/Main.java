import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int num,a,b = 0;
		num = t.nextInt();
		for (int c = 1; c <= num * 2; c++) {
			System.out.print(c + " ");
			System.out.print(c++ + "");
			System.out.println(c);
			b+=c;
			System.out.print(c + " ");
			System.out.print(c++ + "");
			System.out.println(c);
			
		}
		t.close();
	}
}