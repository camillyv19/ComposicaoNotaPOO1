import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();

        String repetir;
        do {
            System.out.println("Cadastro de pedidos");
            System.out.println("Informe o código do produto: ");
            produto.setCodigo(input.nextInt());

            System.out.println("Informe o nome do produto: ");
            produto.setNome(sc.nextLine());

            System.out.println("Informe o tamanho/peso do produto: ");
            produto.setTamanho_peso(input.nextDouble());

            System.out.println("Informe a cor do produto: ");
            produto.setCor(sc.nextLine());

            System.out.println("Informe o valor do produto R$ ");
            produto.setValor(input.nextDouble());

            System.out.println("Informe a quantidade de estoque: ");
            produto.setQuant_estoq(input.nextInt());

            System.out.println("Informe a forma de pagamento:");
            System.out.println("1 para Pix,  Transferêmcia ou Débito \n2 para Espécie \n3 para Crédito");
            int pag = input.nextInt();

            switch (pag){
                case 1:
                    System.out.println("Você ganhou 5% de desconto, Pague R$" + produto.pagamento());
                    break;
                case 2:
                    System.out.println("Você ganhou 5% de desconto, Pague R$" + produto.pagamento());
                    System.out.println("Valor pago R$");
                    produto.setValor_pago(input.nextDouble());
                    System.out.println("Troco R$" + produto.pag_especie());
                    break;
                case 3:
                    System.out.println("Parcelamos até 3x, quantas vezes deseja parcelar? ");
                    produto.setParcela(input.nextInt());
                    System.out.println("Pague R$" + produto.pag_cred() + "por parcela.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

            System.out.println("Deseja comprar novamente? ");
            repetir = sc.next();
        }while (repetir.equalsIgnoreCase("sim"));

    }
}