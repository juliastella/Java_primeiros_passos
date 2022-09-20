
import java.util.Locale;
import java.util.Scanner;
public class Aula03 {

	public static void main(String[] args) {
		/*Entrada de dados*/
		/*Scaner: para fazer entrada de dados, nós vamos criar 
		 * um objeto do tipo "Scanner" da seguinte forma:*/
		
		/*Scanner sc = new Scanner(System.in); /*associando objeto scanner ao o teclado no modo console
		
		String x;
		x = sc.next(); //Permite que seja digitado uma palavra, e seja armazenada//
		System.out.println("Você digitou: "+ x);
		
      sc.close();*/
      
      /*Números inteiros//
      Scanner sc = new Scanner(System.in);
      
      int c;
		c = sc.nextInt(); //vai mudar para suportar inteiro//
		System.out.println("Você digitou: "+ c);
		
    sc.close();*/
      
      /*Números flutuantes
		
	  Locale.setDefault(Locale.US); //de vírgula para ponto// 
      Scanner sc = new Scanner(System.in);
      
      double j;
		j = sc.nextDouble(); //vai mudar para suportar flutuantes//
		System.out.println("Você digitou: "+ j);
		
    sc.close();*/
		
		  /*Char
		
	      Scanner sc = new Scanner(System.in);
	      
	      char h;
			h = sc.next().charAt(0); //o .charAt(0) pega o primeiro caracter do string//
			System.out.println("Você digitou: "+ h);
			
	    sc.close();*/
		
		 /*Vários dados na mesma linha
		
		  Locale.setDefault(Locale.US); 
	      Scanner sc = new Scanner(System.in);
	      
	      String o;
	      int p;
	      double q;
	      o = sc.next();
	      p = sc.nextInt();
	      q = sc.nextDouble();
			System.out.println("Dados digitados:");
			System.out.println(o);
			System.out.println(p);
			System.out.println(q);
			
	    sc.close();*/
		
		/*--------Parte 02--------
		 * Para ler um texto até a quebra de linha.
		
		 Scanner sc = new Scanner(System.in);
	      
	      String s1, s2, s3;
	      s1 = sc.nextLine(); //A quebra de linha.//
	      s2 = sc.nextLine();
	      s3 = sc.nextLine();
			System.out.println("Dados digitados:");
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			
	    sc.close();*/
	    
	    /*A quebra de linha pendente.*/
		
		 Scanner sc = new Scanner(System.in);
	      
		  int w;
	      String s1, s2, s3;
	      
	      w = sc.nextInt(); /*Quando se usar um comando difernte do nextLine, essa quebra de linha fica pendente*
	       A solução é fazer um nextLine extra antes de fazer o nextLine de seu interesse*/
	      sc.nextLine();
	      s1 = sc.nextLine(); 
	      s2 = sc.nextLine();
	      s3 = sc.nextLine();
			System.out.println("Dados digitados:");
			System.out.println(w);
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			
	    sc.close();
	}

}
