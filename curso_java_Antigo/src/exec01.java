import java.util.Locale;
import java.util.Scanner;
public class exec01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		Double largura = sc.nextDouble();
		Double comprimento = sc.nextDouble();
		Double metroQuadrado = sc.nextDouble();
	    Double area = (largura*comprimento);
	    Double preco = (area*metroQuadrado);
	    
		System.out.println("O valor da área: "+area);
		System.out.println("O Preço vai ser de: "+preco);
		
	 sc.close();
	}

}
