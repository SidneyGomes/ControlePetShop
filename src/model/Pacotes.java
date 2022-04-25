package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Classe que extende PrestabilidadePetShop e cria um pacote de prestabilidades
 *
 * @see PrestabilidadePetShop
 * @author Sidney, Adrielly e Mariana
 */
public class Pacotes extends PrestabilidadePetShop implements Serializable {

    private final ArrayList<PrestabilidadePetShop> prestPetShop = new ArrayList();

    /**
     * Metodo construtor que recebe os valores a serem definidos na superclasse
     *
     * @param codigo Codigo do Pacote
     * @param descricao Descricao do Pacote
     */
    public Pacotes(int codigo, String descricao) {
        super(codigo, descricao, 0);
    }

    /**
     * Metodo que adiciona uma prestabilidade ao Array definido na classe
     *
     *
     * @param prest Objeto do tipo PrestabilidadePetShop
     */
    public void addPrestabilidadePacote(PrestabilidadePetShop prest) {
        this.prestPetShop.add(prest);
        this.setPreco(this.getPreco() + prest.getPreco() - 2.0);
    }

    public ArrayList<PrestabilidadePetShop> getArray() {
        return prestPetShop;
    }

}
