public class Uber {
    private double distancia, tarifaBase, fatorDemanda, valorFinal;
    private int tempoEspera;


    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public double getFatorDemanda() {
        return fatorDemanda;
    }

    public void setFatorDemanda(double fatorDemanda) {
        this.fatorDemanda = fatorDemanda;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }

    public void setTempoEspera(int tempoEspera) {
        this.tempoEspera = tempoEspera;
    }

    public double calcularValorCorrida(){
        this.setValorFinal((this.getDistancia() * 2) + (this.getTempoEspera() * 0.5) + this.getTarifaBase() * this.getFatorDemanda());
        return valorFinal;
    }

    public void detalhesCorrida(){
        System.out.println("Diatância: " + this.getDistancia());
        System.out.println("Tempo de espera: " + this.getTempoEspera());
        System.out.println("Tarifa base: " + this.getTarifaBase());
        System.out.println("Fator de demanda: " + this.getFatorDemanda());
        System.out.println("Valor total da corrida: " +calcularValorCorrida());
    }


}
