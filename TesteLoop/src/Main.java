import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		double preco,total=0,itens=0;
		do {
			System.out.println("Digite o preço:");
			preco = tec.nextDouble();
			if(preco>0) {
				total += preco;
				itens++;
			}
		} while (preco > 0);
		System.out.println("Total: R$ "+total);
		System.out.println("Itens comprados: "+itens);
		System.out.println("Preço médio dos produtos: "+(total/itens));
		tec.close();
	}
}
