
public class aula02 {

	public static void main(String[] args) {
		/*Exemplo 01: duoble*/
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b+B)/2.0*h;
		
		System.out.println(area);
		
		/*Exemplo 02: número duoble*/
		
		int a, c;
		double resultado;
		
		a = 5;
		c = 2;
		
		resultado = (double) a/c;
		
		System.out.println(resultado);
		
		/*Exemplo 03: */
		
		double d;
		int f;
		
		d = 5.0;
		f = (int) d; /*Trocar o valor da atribuição de d que é double para inteiro, isso flar que não importar as casa decimais. */
		
		System.out.println(f);
	}

}
