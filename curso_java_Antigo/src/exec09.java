import java.util.Locale;
import java.util.Scanner;
public class exec09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();
		String [] nome = new String[N];
		int [] idade = new int[N];
		double [] altura = new double[N];
		
		for (int i = 0; i<N; i++) {
			nome[i] = sc.next();
			idade[i] = sc.nextInt();
			altura[i] = sc.nextDouble();
			System.out.println("Nome: "+ nome[i] + ", idade: " + idade[i] + ", altura: " + altura[i]);
		}
		
		double soma = 0.0;
		
		for (int i = 0; i<N; i++) {
			soma= soma + altura[i];
			}
		
		double media = soma / N;
		System.out.println("A altura média é = "+ media);
		
        int cont = 0;
		
		for (int i = 0; i<N; i++) {
			if(idade[i] < 16) {
				cont = cont + 1;
			  }
			} 
		double x = cont * 100.0 / N;
		System.out.println("Pessoas com menos de 16 anos: " + x);

		sc.close();
	}

}
