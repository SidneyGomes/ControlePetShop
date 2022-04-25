package model;

import java.io.Serializable;

/**
 * Classe abstrata que cria uma prestabilidade generica
 *
 * @author Sidney, Adrielly e Mariana
 */
public abstract class PrestabilidadePetShop implements Serializable {

    private int codigo;
    private String descricao;
    private double preco;

    /**
     * Metodo construtor que reebe os valores a serem definidos nas variaves da
     * classe
     *
     * @param codigo Codigo da prestabilidade
     * @param descricao Descricao da prestabilidade
     * @param preco Preco da prestabilidade
     */
    public PrestabilidadePetShop(int codigo, String descricao, double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    /**
     * Metodo que retorna o preco da prestabilidade
     *
     * @return double - Preco da prestabilidade
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Metodo que recebe um preco a ser definido na classe
     *
     * @param preco - Preco da prestabilidade
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * Metodo que retorna o codigo da prestabilidade
     *
     * @return int - Codigo da prestabilidade
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Metodo que recebe um codigo a ser definido na classe
     *
     * @param codigo Codigo da prestabilidade
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Metodo que retorna a descricao da prestabilidade
     *
     * @return String - Descricao da prestabilidade
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Metodo que recebe uma descricao a ser definida na classe
     *
     * @param descricao Descricao da prestabilidade
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
