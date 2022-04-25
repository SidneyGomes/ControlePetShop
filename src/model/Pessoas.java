package model;

import java.io.Serializable;

/**
 * Classe abstrata que cria uma pessoa generica
 *
 * @author Sidney, Adrielly e Mariana
 */
public abstract class Pessoas implements Serializable {

    private String nome;
    private int codigo;

    /**
     * Metodo construtor que recebe as variaveis a serem preenchidas na classe
     *
     * @param nome Nome da pessoa
     * @param codigo Codigo da pessoa
     */
    public Pessoas(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    /**
     * Metodo que retorna o nome definido na classe
     *
     * @return String - Nome da pessoa
     */
    public String getNome() {
        return nome;
    }

    /**
     * Metodo que recebe um nome a ser definido na classe
     *
     *
     * @param nome Nome pra ser definido
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Metodo que retorna o codigo definido na classe
     *
     * @return int Codigo da pessoa
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Classe que recebe um codigo a ser definido na classe
     *
     * @param codigo Codigo a ser definido
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
