public class Funcionario {
    protected String nome;
    protected int nasc;
    protected double salario;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setNasc(int nasc){
        this.nasc = nasc;
    }

    public int getNasc() {
        return nasc;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public double InformarSalario(){
        this.getSalario();
        return salario;
    }

    public int CalcularIdade(){
        int idade = 2024 - this.getNasc();
        return idade;
    }
}

