public class Aluno {
    double nota1, nota2, nota3, media;

    void CalcularMedia(){
        media = (nota1 + nota2 + nota3) / 3;
        System.out.println(media);
    }
    void VerificarAprovacao(){
        if (media >= 7 ){
            System.out.println("Parabens, APROVADO!");
        }else if (media < 4) {
            System.out.println("Você foi REPROVADO :(");
        }else {
            System.out.println("Você está na final.");
        }
    }
}
