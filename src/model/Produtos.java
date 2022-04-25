package model;

import java.io.Serializable;

/**
 * Classe que cria a prestabilidade Produto que extende PrestabilidadePetShop
 *
 * @see PrestabilidadePetShop
 * @author Sidney, Adrielly e Mariana
 */
public class Produtos extends PrestabilidadePetShop implements Serializable {

    /**
     * Metodo construtor que passa para a superclasse os atributos recebidos
     *
     * @param codigoProduto Codigo do produto
     * @param descricaoProduto Descricao do produto
     * @param preco Preco do produto
     */
    public Produtos(int codigoProduto, String descricaoProduto, double preco) {
        super(codigoProduto, descricaoProduto, preco);
    }

}
