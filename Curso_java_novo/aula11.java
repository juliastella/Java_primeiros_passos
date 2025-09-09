import java.util.Scanner;

public class Aula11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");

        // ler uma linha inteira
        String nome = scan.nextLine();

        System.out.println("Seu nome: " + nome);

        // ler um tipo especifico do teclado
        // String primeiroNome = scan.next(); // o next vai ler o que foi colocado e retorna a uma string
        // int idade = scan.nextInt(); // retorna int
        // double altura = scan.nextDouble(); // retorna double
    }
}