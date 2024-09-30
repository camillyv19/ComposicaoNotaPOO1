public class Conta {
    private String nomeTitular, tipoConta;
    private double saldo, deposito, saque;

    public Conta(String n){
        this.nomeTitular = n;
        this.saldo = 0;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double Depositar(){
        this.setSaldo(this.getSaldo() + this.getDeposito());
        return saldo;
    }
    public double Sacar(){
        if (this.getSaque() < this.getSaldo()) {
            this.setSaldo(this.getSaldo() - this.getSaque());
            System.out.println("Saque concluido!");
        }else {
            System.out.println("Saldo insuficiente para saque");
        }
        return saldo;
    }
}
