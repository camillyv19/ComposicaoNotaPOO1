import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o nome e a raça do cachorro: ");
        Cachorro cachorro = new Cachorro(input.nextLine(), input.nextLine() );
        cachorro.late();

        System.out.println("Informe o nome e a raça do gato: ");
        Gato gato = new Gato(input.nextLine(), input.nextLine());
        gato.mia();
    }
}