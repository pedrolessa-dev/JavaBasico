import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		double x1, x2, y1, y2, d;
		x1 = t.nextDouble();
		y1 = t.nextDouble();
		x2 = t.nextDouble();
		y2 = t.nextDouble();
        d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
//		System.out.printf("%.4f", d);
      System.out.println(String.format("%.4f", d)); 
		t.close();
	}
}

//import java.util.Scanner;
//
//public class Main {
//	
//    public static void main(String[] args) {
//    	Scanner leitor = new Scanner(System.in);
//        double x1 = leitor.nextDouble();
//        double y1 = leitor.nextDouble();
//        double x2 = leitor.nextDouble();
//        double y2 = leitor.nextDouble();
//        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
//        System.out.println(String.format("%.4f", distancia)); 
//    }
//	
//}