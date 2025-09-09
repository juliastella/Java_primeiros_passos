import java.util.Scanner;

public class Aula12 {

	public static void main(String[] args) {
		// Opicional estrutura para cada.

		/*Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt(); //recebe o número escolhido como a quantidades de vezes para rodar o programa.
		String[] nomes = new String[numero]; // Faz o vetor.

		for (int i = 0; i < numero; i++) {
			nomes[i] = sc.next();
		}
		System.out.println("Nomes lidos: ");

		for (int i = 0; i < numero; i++) {
			System.out.println(nomes[i]);
		}
		sc.close();*/
		
		// Formar opcional
		
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt(); //recebe o número escolhido como a quantidades de vezes para rodar o programa.
		String[] nomes = new String[numero]; // Faz o vetor.

		for (int i = 0; i < numero; i++) {
			nomes[i] = sc.next();
		}
		System.out.println("Nomes lidos: ");

		for (String s : nomes) { // você vai colocar um apelido para elemento do vetor.
			System.out.println(s);
		}
		sc.close();
		
	}

}
