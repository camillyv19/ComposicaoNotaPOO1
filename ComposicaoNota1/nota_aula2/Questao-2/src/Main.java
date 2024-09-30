import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Uber u = new Uber();

        System.out.println("Quantos quilômetros foram percorrido? ");
        u.setDistancia(input.nextDouble());

        System.out.println("Qual foi o tempo de espera? ");
        u.setTempoEspera(input.nextInt());

        System.out.println("Qual o valor da tarifa? ");
        u.setTarifaBase(input.nextDouble());

        System.out.print("Digite o fator de demanda R$ (1,00 = normal, 1,50 = pico): ");
        u.setFatorDemanda(input.nextDouble());

        u.detalhesCorrida();
    }
}