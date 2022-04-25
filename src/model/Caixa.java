package model;

import java.io.Serializable;

/**
 * Classe que contem o valores do caixa e sua situacao.
 * 
 * @author Sidney, Adrielly e Mariana
 */

public class Caixa implements Serializable{

    private double valorCaixa;
    private double balancoAtual;
    private double balancoTotal;
    private boolean aberto = false;

    public Caixa(double valorCaixa) {
        this.valorCaixa = valorCaixa;
    }


    /**
     * @return the aberto
     */
    public boolean isAberto() {
        return aberto;
    }

    /**
     * @param aberto the aberto to set
     */
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    /**
     * @return the balancoAtual
     */
    public double getBalancoAtual() {
        return balancoAtual;
    }

    /**
     * @param balancoAtual the balancoAtual to set
     */
    public void setBalancoAtual(double balancoAtual) {
        this.balancoAtual = balancoAtual;
    }

    /**
     * @return the balancoTotal
     */
    public double getBalancoTotal() {
        return balancoTotal;
    }

    /**
     * @param balancoTotal the balancoTotal to set
     */
    public void setBalancoTotal(double balancoTotal) {
        this.balancoTotal = balancoTotal;
    }

    /**
     * @return the valorCaixa
     */
    public double getValorCaixa() {
        return valorCaixa;
    }

    /**
     * @param valorCaixa the valorCaixa to set
     */
    public void setValorCaixa(double valorCaixa) {
        this.valorCaixa = valorCaixa;
    }

}
