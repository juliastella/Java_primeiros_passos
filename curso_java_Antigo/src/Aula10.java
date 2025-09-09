import java.util.Locale;
import java.util.Scanner;

public class Aula10 {

	public static void main(String[] args) {
		/*
		 * Estrutura de repetição faça-enquanto. do { comando 1 comando 2
		 * }while(condição);
		 * se for vedaderia faz, se não para.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char resp;

		do {
			System.out.print("Digite a temperatura em celsius: ");
			Double c = sc.nextDouble();
			Double f = 9.0 * c / 5.0 + 33.0;
			System.out.printf("Equivalente em fahrenheit: %.1f%n", f);
			System.out.print("Dejesa repetir (s/n)? ");
			resp = sc.next().charAt(0);
		} while (resp != 'n'); 

		sc.close();
	}

}
