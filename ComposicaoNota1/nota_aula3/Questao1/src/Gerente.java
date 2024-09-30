public class Gerente extends Funcionario{
    private String projeto;
    public void setProjeto(String projeto){
        this.projeto = projeto;
    }

    public String getProjeto(){
        return projeto;
    }

    public String InformarProjeto(){
        this.getProjeto();
        return projeto;
    }
}
