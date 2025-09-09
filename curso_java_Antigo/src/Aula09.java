import java.util.Locale;
import java.util.Scanner;
public class Aula09 {

	public static void main(String[] args) {
		// Estrutura de repetição para
		// for (inico; condição; incremento){}
        
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int j = sc.nextInt();

		int soma = 0;

		for (int i = 0; i < j; i++) {
			int p = sc.nextInt();
			soma += p;
		}

		System.out.println(soma);

		sc.close();
		
		for (int i = 0; i<5; i++) { // contagem regressiva com o i--
			System.out.println("Valor de i: "+i);
			
		}

	}
}