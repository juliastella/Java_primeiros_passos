import java.util.Scanner;
public class aula08 {

	public static void main(String[] args) {
		// Estrutura de repetição while ou enquanto
		
		/*exemplo 01
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		while (x != 0) {
		  x = sc.nextInt();
		

		sc.close();
		
    */
		/*exemplo 02*/
		
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		int soma = 0;
		while (x != 0) {
			soma += x;
			 x = sc.nextInt();
		}
		
		System.out.println(soma);

		sc.close();
		
	}

}
