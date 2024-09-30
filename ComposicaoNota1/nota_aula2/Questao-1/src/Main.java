import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        String repetir, cadatrarNovo;

        System.out.println("Para começar o cadastro digite seu nome: ");
        String nome = input.nextLine();

        ContaCorrente cc = new ContaCorrente(nome);
        ContaPoupanca cp = new ContaPoupanca(nome);

        do {
            System.out.println("Selecione o tipo de conta bancária a ser criada: " +
                    "(Digite 1 Conta Corrente ou Digite 2 para Conta Poupança");
            int tipo = sc.nextInt();
            switch (tipo) {
                case 1:
                    cc.setTipoConta("conta corrente");
                    do {
                        System.out.println("MENU o que deseja fazer?\n 1 Depositar\n 2 Sacar\n 3 Usar cheque especial\n 4 Exibir dados da conta");
                        int menu = sc.nextInt();
                        switch (menu) {
                            case 1:
                                System.out.println("Realizar deposito\n Quanto deseja depositar? R$");
                                cc.setDeposito(sc.nextDouble());
                                cc.Depositar();
                                System.out.println("Deposito concluido!");
                                break;

                            case 2:
                                System.out.println("Realizar saque\n Quanto deseja sacar? ");
                                cc.setSaque(sc.nextDouble());
                                cc.Sacar();
                                break;

                            case 3:
                                cc.ChequeEspecial();
                                System.out.println("Cheque especial depositado com sucesso!");
                                break;

                            case 4:
                                cc.DadosConta();
                                break;

                            default:
                                System.out.println("Opção inválida.");
                        }
                        System.out.println("Deseja voltar ao MENU? ('sim' ou 'nao')");
                        repetir = sc.next();
                    } while (repetir.equalsIgnoreCase("sim"));
                    break;

                case 2:
                    cp.setTipoConta("conta poupanca");

                    do {
                        System.out.println("MENU o que deseja fazer?\n 1 Depositar\n 2 Sacar\n 3 Calcular rendimento\n 4 Exibir dados da conta");
                        int menu2 = sc.nextInt();
                        switch (menu2) {
                            case 1:
                                System.out.println("Realizar deposito\n Quanto deseja depositar? R$");
                                cp.setDeposito(sc.nextDouble());
                                cp.Depositar();
                                System.out.println("Deposito concluido!");
                                break;

                            case 2:
                                System.out.println("Realizar saque\n Quanto deseja sacar? ");
                                cp.setSaque(sc.nextDouble());
                                cp.Sacar();
                                break;

                            case 3:
                                System.out.println("Vamos calcular o rendimento\n Qual o valor da atual (em porcentagem) da taxa de Selic? ");
                                cp.setTaxaSelic(sc.nextDouble());
                                cp.CalcularRendimento();
                                break;

                            case 4:
                                cp.DadosConta();
                                break;

                            default:
                                System.out.println("Opção inválida.");
                        }
                        System.out.println("Deseja voltar ao MENU? ('sim' ou 'nao')");
                        repetir = sc.next();
                    } while (repetir.equalsIgnoreCase("sim"));
                    break;

                default:
                    System.out.println("Opção invalálida");
            }
            System.out.println("Deseja criar uma nova conta? ('sim' ou 'nao')");
            cadatrarNovo = sc.next();
        } while (cadatrarNovo.equalsIgnoreCase("sim"));

    }

}