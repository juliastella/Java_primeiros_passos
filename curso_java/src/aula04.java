
public class aula04 {

	public static void main(String[] args) {
		
		/*Funções matemática
		 * A = Math.sqrt(x): Variável a recebe a raiz quadrada de x.
		 * A = Math.pow(x,y): Variável a receber o resultado de x elevado a y.
		 * A = Math.abs(x): Variável a recebe o valor absoluto de x.*/
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double a, b, c;
		
		a = Math.sqrt(x);
		b = Math.sqrt(y);
		c = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de "+x+"="+a);
		System.out.println("Raiz quadrada de "+y+"="+b);
		System.out.println("Raiz quadrada de 25 = "+c);
		
		a = Math.pow(x, y);
		b = Math.pow(x, 2.0);
		c = Math.pow(5.0, 2.0);
		System.out.println(x+" elevado a "+y+" = "+a);
		System.out.println(x+"elevado ao quadrado = "+b);
		System.out.println("5 elevado ao quadrado = "+c);
		
		a = Math.abs(x);
		b = Math.abs(z);
		System.out.println("Valor absoluto de "+y+" = "+a);
		System.out.println("Valor absoluto de "+z+" = "+b);
		
		

	}

}
