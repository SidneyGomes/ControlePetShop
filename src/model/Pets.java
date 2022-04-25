package model;

import java.io.Serializable;

/**
 * Classe que cria um Pet, implementa Serializable afim de ser gravavel em
 * arquivo
 *
 * @see Serializable
 * @author Sidney, Adrielly e Mariana
 */
public class Pets implements Serializable {

    private int codigo;
    private String nome, raca, especie;

    /**
     * Construtor que passa as variaveis de classe os seus parametros
     *
     * @param codigo Codigo que indentifica o Pet
     * @param nome Codigo que indentifica o Pet
     * @param raca Raca que indentifica o Pet
     * @param especie Especie que indentifica o Pet
     */
    public Pets(int codigo, String nome, String raca, String especie) {
        this.codigo = codigo;
        this.nome = nome;
        this.raca = raca;
        this.especie = especie;
    }

    /**
     * Retorna o codigo do Pet definido na classe
     *
     *
     * @return int - Codigo do Pet
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Metodo que define valor ao codigo do Pet
     *
     * @param codigo Codigo do Pet
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Retorna o nome do Pet definido na classe
     *
     *
     * @return String - Nome do Pet
     */
    public String getNome() {
        return nome;
    }

    /**
     * Metodo que define valor ao nome do Pet
     *
     * @param nome Nome do Pet
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna a raca do Pet definido na classe
     *
     *
     * @return String - Raca do Pet
     */
    public String getRaca() {
        return raca;
    }

    /**
     * Metodo que define valor a raca do pet
     *
     * @param raca Raca do pet
     */
    public void setRaca(String raca) {
        this.raca = raca;
    }

    /**
     * Retorna a especie do Pet definido na classe
     *
     *
     * @return String - Especie do Pet
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * Metodo que define valor a especie do Pet
     *
     *
     * @param especie - Especie do Pet
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

}
