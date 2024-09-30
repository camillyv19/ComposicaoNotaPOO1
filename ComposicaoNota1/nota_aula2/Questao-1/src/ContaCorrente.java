public class ContaCorrente extends Conta  {
    private double chequeEspecial = 1000;

    public ContaCorrente(String n) {
        super(n);
    }

    public double ChequeEspecial(){
        this.setSaldo(this.getSaldo() + chequeEspecial);
        return this.getSaldo();
    }
    public void DadosConta(){
        System.out.println("Nome títular: " + this.getNomeTitular());
        System.out.println("Tipo: " + this.getTipoConta());
        System.out.println("Saldo: R$" + this.getSaldo());
    }
}
