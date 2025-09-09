import java.util.Scanner;
public class Aula13 {

	public static void main(String[] args) {
		// Introdução a matrizes
		
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int[][] mat = new int [M][N]; //matriz
		
		for (int i=0; i<M; i++) { // não é possivel usar a variavel i novamente abaixo
			for (int j=0; j<M; j++) { // J por padrão nos livros de matemática, os dois for vão ler a matriz
				mat[i][j] = sc.nextInt();
			}
		}
		
		for (int i=0; i<M; i++) { 
			for (int j=0; j<M; j++) { //Repete para imprimir na tela.
				System.out.print(mat[i][j] + " ");
			}
			System.out.println(); //quebra de linha
		}
		
		sc.close();
	}
}
