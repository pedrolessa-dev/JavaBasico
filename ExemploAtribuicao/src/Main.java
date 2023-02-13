
public class Main {
	public static void main(String[] args) {
		int a = 10;
//		a = a + 1;
		a += 1; // a++
		a -= 1; // a--
		a *= 3; // --> a = a * 3
		a /= 3; // --> a = a / 3
		a %= 3; // --> a = a % 3;
		
		a = 10;
		System.out.println("Valor original do a = "+a);// 10
		System.out.println("Valor do pos incremento = "+ a++);// 10
		// equivale a: print; a = a + 1
		System.out.println("Valor final do a = " + a);// 11
		
		System.out.println(" ----------- tentativa 2 ");
		a = 10;
		System.out.println("Valor original do a = "+a);// 10
		System.out.println("Valor do pre incremento = "+ ++a);// 11
		// equivale a: a = a + 1; print
		System.out.println("Valor final do a = "+a);// 11
		
		
		int x,  y, z;
		
		x= 10;
		y = 11;
		z = (x > y)? 100: 0;
		// equivale a:
		
		// if (x > y)
		//    z = 100;
		// else 
		//    z = 0;
	}
}