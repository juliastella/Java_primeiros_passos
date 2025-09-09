import java.util.Locale;
import java.util.Scanner;
public class exec02 {

	public static void main(String[] args) {
		//area, perimetor e diagonal
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double base = sc.nextDouble();
		Double altura  = sc.nextDouble();
		
		Double area, perimetro, diagonal;
		
		area = (base*altura);
		perimetro = ((2.0*base)+(2.0*altura));
		diagonal = Math.sqrt(Math.pow(base, 2.0)+Math.pow(altura, 2.0));
		
		System.out.printf("A area = %.4f%n", area);
		System.out.printf("A perimetro = %.4f%n", perimetro);
		System.out.printf("A diagonal = %.4f%n", diagonal);
		
     sc.close();
	}

}
