package model;

import java.io.Serializable;

/**
 * Classe que cria a prestabilidade Servicos que extende PrestabilidadePetShop
 *
 * @see PrestabilidadePetShop
 * @author Sidney, Adrielly e Mariana
 */
public class Servicos extends PrestabilidadePetShop implements Serializable {

    /**
     * Metodo construtor que passa para a superclasse os atributos recebidos
     *
     * @param codigo Codigo do servico
     * @param descricao Descricao do servico
     * @param preco Preco do servico
     */
    public Servicos(int codigo, String descricao, double preco) {
        super(codigo, descricao, preco);
    }

}
