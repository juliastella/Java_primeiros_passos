import java.util.Locale;
import java.util.Scanner;

public class Aula11 {

	public static void main(String[] args) {
		// Vetores

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
     
		int N = sc.nextInt();
		double[] vet = new double[N]; // para a criação, N porque vai ser qualquer valor.
		
		for(int i=0; i<N; i++){ // vai aproveitar o proprio valor da variavel i.
			vet[i] = sc.nextDouble();
		} 
		
		for(int i=0; i<N; i++) {
			System.out.printf("%.2f%n", vet[i]);// Acessar a posição do vertor.
		}
		sc.close();
	}

}
