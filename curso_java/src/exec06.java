import java.util.Locale;
import java.util.Scanner;
public class exec06 {

	public static void main(String[] args) {
		// Calcular média de idade não tendo números negativos
	 
		Locale.setDefault(Locale.US);
		Scanner naoNegativo = new Scanner(System.in);
		
        int idade = naoNegativo.nextInt();  
		int soma = 0;
		int cont = 0; // cont é contar a idade.
		
        while (idade >= 0) {
            soma = soma + idade; // Soma vai receber o que estava nela + a idade.
            cont = cont + 1;
            idade = naoNegativo.nextInt();
        }
        if(cont > 0) { // foi criado para protejer o double media. 
          double media = (double) soma / cont; // O (double) esta assim pois o resultado da operação daria um número inteiro.
          
         System.out.printf("%.2f%n", media);
        }
        else {
        	System.out.println("Impossivel calcular");
        }
        
        naoNegativo.close();
	}

}
