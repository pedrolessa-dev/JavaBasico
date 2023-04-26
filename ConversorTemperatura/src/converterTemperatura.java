import java.util.Scanner;

public class converterTemperatura {

	public static void main(String[] args) {
		int option, loop = 0;
		float celsius, kelvin, fahrenheit;
		Scanner sc = new Scanner(System.in);
		System.out.println("=========================");
		System.out.println("Conversor de temperaturas");
		while (loop < 1) {
			System.out.println("=========================");
			System.out.println("Escolha uma das opções abaixo digitando o número correspondente:");
			System.out.println("1 - Kelvin --> Celsius");
			System.out.println("2 - Kelvin --> Fahrenheit");
			System.out.println("3 - Celsius --> Kelvin");
			System.out.println("4 - Celsius --> Fahrenheit");
			System.out.println("5 - Fahrenheit --> Celsius");
			System.out.println("6 - Fahrenheit --> Kelvin");
			option = sc.nextInt();
			switch (option) {
			case 1:
				System.out.println("Digite o valor de Kelvin");
				kelvin = sc.nextFloat();
				celsius = kelvin - 273;
				System.out.println(kelvin + "K = " + celsius + "°C");
				loop++;
				break;
			case 2:
				System.out.println("Digite o valor de Kelvin");
				kelvin = sc.nextFloat();
				fahrenheit = (kelvin - 273) * 1.8f + 32;
				System.out.println(kelvin + "K = " + fahrenheit + "°F");
				loop++;
				break;
			case 3:
				System.out.println("Digite o valor de Celsius");
				celsius = sc.nextFloat();
				kelvin = celsius + 273;
				System.out.println(celsius + "°C = " + kelvin + "K");
				loop++;
				break;
			case 4:
				System.out.println("Digite o valor de Celsius");
				celsius = sc.nextFloat();
				fahrenheit = celsius * 1.8f + 32;
				System.out.println(celsius + "°C = " + fahrenheit + "°F");
				loop++;
				break;
			case 5:
				System.out.println("Digite o valor de Fahrenheit");
				fahrenheit = sc.nextFloat();
				celsius = (fahrenheit - 32) / 1.8f;
				System.out.println(fahrenheit + "°F = " + celsius + "°C");
				loop++;
				break;
			case 6:
				System.out.println("Digite o valor de Fahrenheit");
				fahrenheit = sc.nextFloat();
				kelvin = (fahrenheit - 32) * 5 / 9 + 273;
				System.out.println(fahrenheit + "°F = " + kelvin + "K");
				loop++;
				break;
			default:
				System.out.println("Opção inválida");
				loop = 0;
				break;
			}
			sc.close();
		}
	}
}