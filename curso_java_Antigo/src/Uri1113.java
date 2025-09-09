import java.util.Scanner;
public class Uri1113 {

	public static void main(String[] args) {
		// Ordem cresente e decresente.
		
		Scanner ordem = new Scanner(System.in);
		
		int a = ordem.nextInt();
		int b = ordem.nextInt();
		
		while (a != b) {
			if (a < b) {
				System.out.println("Cresente");
			}
			else {
				System.out.println("Decresente");
			}
			a = ordem.nextInt();
			b = ordem.nextInt();
		}
       ordem.close();
	}

}
