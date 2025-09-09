import java.util.Locale;
import java.util.Scanner;
public class uri1078 {

	public static void main(String[] args) {
		// Tabuada
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		sc.close();
		
		for(int i = 0; i<=10; i++){
			int produto = (i*numero);		
			System.out.println(i + " X " + numero + " = " + produto);
		}
	}

}
