package model;

public class CartaoCredito extends Pagamento {

    private long numeroCartao;
    private int parcelas;
    private int codTresDigitos;
    private String vencimento;

    /**
     *
     * @param valor
     * @param numeroCartao
     * @param parcelas
     * @param codTresDigitos
     * @param vencimento
     */
    public CartaoCredito(double valor, long numeroCartao, int parcelas, int codTresDigitos, String vencimento) {
        super(valor);
        this.numeroCartao = numeroCartao;
        this.parcelas = parcelas;
        this.codTresDigitos = codTresDigitos;
        this.vencimento = vencimento;
    }

    /**
     * @return the codTresDigitos
     */
    public int getCodTresDigitos() {
        return codTresDigitos;
    }

    /**
     * @param codTresDigitos the codTresDigitos to set
     */
    public void setCodTresDigitos(int codTresDigitos) {
        this.codTresDigitos = codTresDigitos;
    }

    /**
     * @return the vencimento
     */
    public String getVencimento() {
        return vencimento;
    }

    /**
     * @param vencimento the vencimento to set
     */
    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    /**
     * @return the numeroCartao
     */
    public long getNumeroCartao() {
        return numeroCartao;
    }

    /**
     * @param numeroCartao the numeroCartao to set
     */
    public void setNumeroCartao(int numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    /**
     * @return the parcelas
     */
    public int getParcelas() {
        return parcelas;
    }

    /**
     * @param parcelas the parcelas to set
     */
    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

}
