import java.time.LocalDate;
import java.util.Scanner;

public class Relatorio {

	public static void main(String[] args) {

		String nome, genero = null;
		int anoNasc, anoAtual, idadeResultado;
		boolean fim = false;
		float altura, peso, imc, pesoIdealM, pesoIdealF;
		Scanner sc = new Scanner(System.in);
		anoAtual = LocalDate.now().getYear();
		System.out.println("Digite o nome do seu paciente:");
		nome = sc.nextLine();
		while (!fim) {
			System.out.println("Qual o gênero do seu paciente? Digite (M) para masculino ou (F) para feminino:");
			genero = sc.nextLine();
			switch (genero) {
			case "m":
			case "M":
				genero = "M";
				break;
			case "f":
			case "F":
				genero = "F";
				break;
			default:
				System.out.println("Opção inválida");
				fim = true;
				continue;
			}
		}
		System.out.println("Em que ano seu paciente nasceu?");
		anoNasc = sc.nextInt();
		while (anoNasc > anoAtual) {
			System.out.println("Opção inválida. Digite um ano já existente");
			anoNasc = sc.nextInt();
			continue;
		}
		System.out.println("Digite a altura do seu paciente:");
		altura = sc.nextFloat();
		System.out.println("Digite o peso do seu paciente:");
		peso = sc.nextFloat();
		imc = peso / (altura * altura);
		idadeResultado = anoAtual - anoNasc;
		pesoIdealM = 72.7f * altura - 58;
		pesoIdealF = 62.1f * altura - 44.7f;
		System.out.println("\nNome do paciente: " + nome);
		if (genero == "M") {
			System.out.println("Gênero: Masculino");
		} else
			System.out.println("Gênero: Feminino");
		System.out.println("Ano de nascimento: " + anoNasc);
		System.out.println("Idade: " + idadeResultado);
		System.out.println("Altura: " + altura + "m");
		System.out.println("Peso: " + peso + "kg");
		if (imc < 17) {
			System.out.println("IMC: " + imc + " - Muito abaixo do peso");
		} else if (imc <= 18.49) {
			System.out.println("IMC: " + imc + " - Abaixo do peso");
		} else if (imc <= 24.99) {
			System.out.println("IMC: " + imc + " - Peso normal");
		} else if (imc <= 29.99) {
			System.out.println("IMC: " + imc + " - Acima do peso");
		} else if (imc <= 34.99) {
			System.out.println("IMC: " + imc + " - Obesidade I");
		} else if (imc <= 39.99) {
			System.out.println("IMC: " + imc + " - Obesidade II (severa)");
		} else
			System.out.println("IMC: " + imc + " - Obesidade III (mórbida)");
		if (genero == "M") {
			System.out.println("Peso ideal: " + pesoIdealM + "kg");
		} else
			System.out.println("Peso ideal: " + pesoIdealF + "kg");
		sc.close();
	}
}