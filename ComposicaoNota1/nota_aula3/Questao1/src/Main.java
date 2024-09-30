import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente();
        Programador programador = new Programador();

        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        String repetir;

        do {
            System.out.println("Informe o  funcionario que deseja cadastrar: \n digite 1 para Gerente ou 2 para Programador");
            int fun = input.nextInt();
            switch (fun){
                case 1:
                    System.out.println("Informe o nome: ");
                    gerente.setNome(sc.nextLine());

                    System.out.println("Informe o ano de nascimento: ");
                    gerente.setNasc(input.nextInt());

                    System.out.println("Informe o salário do funcionario: ");
                    gerente.setSalario(input.nextDouble());

                    System.out.println("Projeto atual: ");
                    gerente.setProjeto(sc.nextLine());

                    System.out.println("Nome: " + gerente.getNome());
                    System.out.println("Idade: " + gerente.CalcularIdade());
                    System.out.println("Salário: R$" + gerente.InformarSalario());
                    System.out.println("Projeto: " + gerente.InformarProjeto());
                    break;

                case 2:
                    System.out.println("Informe o nome: ");
                    programador.setNome(sc.nextLine());

                    System.out.println("Informe o ano de nascimento: ");
                    programador.setNasc(input.nextInt());

                    System.out.println("Informe o salário do funcionario: ");
                    programador.setSalario(input.nextDouble());

                    System.out.println("Linguagem: ");
                    programador.setLinguagem(sc.nextLine());

                    System.out.println("Nome: " + programador.getNome());
                    System.out.println("Idade: " + programador.CalcularIdade());
                    System.out.println("Salário: R$" + programador.InformarSalario());
                    System.out.println("Projeto: " + programador.InformarLiguagem());
                    break;
            }
            System.out.println("Deseja cadastrar um novo funcionário? ('sim' ou 'nao')");
            repetir = sc.nextLine();
        }while (repetir.equalsIgnoreCase("sim"));



    }
}