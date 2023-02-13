import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int horaI, minI, horaF, minF, resultadoH, resultadoM;
		horaI = t.nextInt();
		minI = t.nextInt();
		horaF = t.nextInt();
		minF = t.nextInt();
		//Passo 1 - estou passando tudo para minutos
		int tempoI = horaI * 60 + minI;
		int tempoF = horaF * 60 + minF;
		//Passo 2 - minha duração é o tempo final - tempo inicial
		int duracao = tempoF-tempoI;
		if(duracao<=0) {
			duracao = duracao + 24* 60; // ou 1440 minutos
		}
		//Passo 3 - Voltar para hora e minuto
		int durH = duracao / 60;
		int durM = duracao % 60;
		System.out.println("O JOGO DUROU " + durH + " HORA(S) E " + durM + " MINUTO(S)");
		t.close();
	}
}