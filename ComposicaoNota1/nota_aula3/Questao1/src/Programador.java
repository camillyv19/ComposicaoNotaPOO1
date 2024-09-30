public class Programador extends Funcionario{
    private String linguagem;
    public void setLinguagem(String linguagem){
        this.linguagem = linguagem;
    }

    public String getLinguagem(){
        return linguagem;
    }

    public String InformarLiguagem(){
        this.linguagem = getLinguagem();
        return linguagem;
    }
}
