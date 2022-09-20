/*Houve a importação da biblioteca especifica*/
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		int y = 32;
		double x = 20.234;
		
		/*Chamando variaveis*/
		System.out.println(y+x);
		
		/*Print com quebra de linha*/
		System.out.println("Bom dia!");
		
		/*Delimitar casa decimais*/
		System.out.printf("%.2f%n", x);
		
		/*Contudo, a linha 18 esta no sistema decimal do Brasileiro. Caso queira mudar, Usa-se a
		 * a seguinte linha de comando:*/
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
		
		/*Concatenação como funciona*/
		System.out.println("Resultado = "+x+" METROS");
		/*Outra forma*/
		System.out.printf("RESULTADO = %.2f metros%n", x);
		
		}

}
