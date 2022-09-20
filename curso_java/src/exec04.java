import java.util.Scanner;
import java.util.Locale;
public class exec04 {

	public static void main(String[] args) {
		
		// Media de alunos
	  Locale.setDefault(Locale.US);	
	  Scanner sc = new Scanner(System.in);
		//---Fazer----
	  
	  double nota01 = sc.nextDouble();
	  double nota02 = sc.nextDouble();
	  
	  double notaFinal = (nota01 + nota02);
	  
	  System.out.printf("O aluno foi: ", notaFinal);
	  
	  if(notaFinal > 60.00){
		  System.out.println("Aluno aprova");
	  }
	  else if(notaFinal < 60.00) {
		  System.out.println("Aluno reprovado");
	  }
	  else {
		  System.out.println("Por favor digite número válido");
	  }
      sc.close();
	}

}
