import java.util.Locale;
import java.util.Scanner;
public class exec05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);	
		 Scanner menor = new Scanner(System.in);
		 
		 int a = menor.nextInt();
		 int b = menor.nextInt();
		 int c = menor.nextInt();
	
		 
		 if (a < b && a < c) {
			 System.out.println("O menor = " + a);
		 }
		 else {
			 if(b < a && b < c) {
				 System.out.println("O menor = ," + b);
				 }
			 if(c < a && c < b) {
				 System.out.println("O menor = " + c);
			     }
			 }
		 
		  menor.close();

	}

}
