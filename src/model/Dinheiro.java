package model;

/**
 * Classe que extende Pagamento e realiza o pagamento em dinheiro
 *
 * @see Pagamento
 * @author Sidney, Adrielly e Mariana
 */
public class Dinheiro extends Pagamento {

    private double troco;

    /**
     * Metodo Construtor para a passagem dos valores.
     *
     * @param valor Valor a ser pago
     * @param troco Troco a ser devolvido
     */
    public Dinheiro(double valor, double troco) {
        super(valor);
        this.troco = troco;
    }

    /**
     * @return the troco
     */
    public double getTroco() {
        return troco;
    }

}
