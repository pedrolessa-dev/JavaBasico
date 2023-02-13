import java.util.Scanner;

public class Gasolina {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double time, speed, distance, usedLiters;
		System.out.println("Digite a quantidade de horas percorridas:");
		time = keyboard.nextDouble();
		System.out.println("Digite a velocidade média em km/h:");
		speed = keyboard.nextDouble();
		System.out.println("Você percorreu " + time + " horas com uma velocidade média de " + speed + "km/h");
		distance = speed * time;
		usedLiters = distance / 12;
		System.out.printf("Você percorreu %.3f km\n", distance);
		System.out.printf("logo, você usou %.3f litros", usedLiters);
		keyboard.close();
		/*int tempo,velocidade;
		double distancia,litros;
		tempo=keyboard.nextInt();
		velocidade=keyboard.nextInt();
		distancia=tempo*velocidade;
		litros=distancia/12;
		System.out.printf("%.3f\n", litros);*/
	}
}