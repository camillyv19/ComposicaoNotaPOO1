public class ContaPoupanca extends Conta{
    private double taxaSelic, rendimento;

    public ContaPoupanca(String n) {
        super(n);
    }

    public double getTaxaSelic() {
        return taxaSelic;
    }

    public void setTaxaSelic(double taxaSelic) {
        this.taxaSelic = taxaSelic;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public double CalcularRendimento(){
        if (this.getTaxaSelic() > 8.5){
            this.setRendimento(0.005 * this.getSaldo());
            System.out.println("Rendimento: R$" + this.getRendimento());
        }else{
            this.setRendimento(0.007 * this.getSaldo());
            System.out.println("Rendimento: R$" + this.getRendimento());
        }
        return getRendimento();
    }
    public void DadosConta(){
        System.out.println("Nome títular: " + this.getNomeTitular());
        System.out.println("Tipo: " + this.getTipoConta());
        System.out.println("Saldo: R$" + this.getSaldo());
        System.out.println("Rendimento: R$" + this.getRendimento());
    }
}
