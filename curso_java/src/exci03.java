import java.util.Locale;
import java.util.Scanner;

public class exci03 {

	public static void main(String[] args) {
		// Nome e idade media

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String n1 = sc.next();
		int id1 = sc.nextInt();
		String n2 = sc.next();
		int id2 = sc.nextInt();

		double media = (id1 + id2) / 2;

		System.out.printf("A idade média de %s e %s é de %.1f anos", n1, n2, media);

		sc.close();
	}

}
