public class Produto {
    private int codigo, quant_estoq, parcela;
    private String nome, cor;
    private double tamanho_peso, valor, total, valor_pago, troco;


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTamanho_peso() {
        return tamanho_peso;
    }

    public void setTamanho_peso(double tamanho_peso) {
        this.tamanho_peso = tamanho_peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuant_estoq() {
        return quant_estoq;
    }

    public void setQuant_estoq(int quant_estoq) {
        this.quant_estoq = quant_estoq;
    }

    public double getTotal() {
        return total;
    }

    public double getValor_pago() {
        return valor_pago;
    }

    public void setValor_pago(double valor_pago) {
        this.valor_pago = valor_pago;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getParcela() {
        return parcela;
    }

    public void setParcela(int parcela) {
        this.parcela = parcela;
    }

    public double getTroco() {
        return troco;
    }

    public void setTroco(double troco) {
        this.troco = troco;
    }

    public double pagamento(){
        this.setTotal(getValor() - 0.05);
        return total;
    }

    public double pag_especie(){
        this.setTroco(this.getValor_pago() - (getValor() - 0.05));
        return troco;
    }

    public double pag_cred() {
        if (getParcela() == 1) {
            this.setTotal(getValor());
        } else if (getParcela() == 2) {
            this.setTotal(getValor() / 2);
        } else {
            this.setTotal(getValor() / 3);
        }
        return total;
    }
}
