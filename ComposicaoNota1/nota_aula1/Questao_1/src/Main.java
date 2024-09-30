import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        String nome;

        System.out.println("Informe seu nome: ");
        nome = sc.next();

        System.out.println("Vamos calcular sua media.");
        System.out.println("Digite a primeira nota: ");
        aluno.nota1 = input.nextDouble();

        System.out.println("Digite a segunda nota: ");
        aluno.nota2 = input.nextDouble();

        System.out.println("Digite a terceita nota: ");
        aluno.nota3 = input.nextDouble();

        aluno.CalcularMedia();
        System.out.println("totalizando média " + aluno.media);
        aluno.VerificarAprovacao();

    }
}