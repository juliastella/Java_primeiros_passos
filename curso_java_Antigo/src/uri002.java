import java.util.Scanner;
public class uri002 {

	public static void main(String[] args) {
		// Conversor de tempo.
		
		Scanner sc = new Scanner(System.in);

		int N, resto, horas, minutos, segundos;

		N = sc.nextInt();

		horas = N / 3600;
		resto = N % 3600;

		minutos = resto / 60;
		segundos = resto % 60;

		System.out.println(horas + ":" + minutos + ":" + segundos);

		sc.close();
	}

}
