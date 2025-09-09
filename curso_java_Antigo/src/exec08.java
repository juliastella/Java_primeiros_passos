import java.util.Locale;
import java.util.Scanner;
public class exec08 {

	public static void main(String[] args) {
		// soma e média.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double [] vet = new double[N];
		
		for (int i = 0; i<N; i++) {
			vet[i] = sc.nextInt();
			System.out.println(vet[i]);
		}
		
		double soma= 0.0;
		
		for (int i = 0; i<N; i++) {
		soma = soma + vet[i];
		}
		
		System.out.println("A soma é = "+soma);
		
		double media = 0.0;
		
		for (int i = 0; i<N; i++) {
			media= soma / N;
			}
			
			System.out.println("A media é = "+ media);
		
        sc.close();
	}

}
