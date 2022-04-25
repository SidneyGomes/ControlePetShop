package controller;

import util.OperacoesCadastrais;
import model.Produtos;
import model.PrestabilidadePetShop;
import model.Servicos;
import model.Pacotes;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Classe que ira cadastrar todos as prestabilidades do PetShop
 *
 * @author Sidney, Adrielly e Mariana
 */
public class CadastroPrestabilidade implements Serializable, OperacoesCadastrais {

    /**
     * ArrayList que ira guardar todos os objetos
     */
    private ArrayList<PrestabilidadePetShop> prestPetShop = new ArrayList();

    /**
     * Metodo que ira cadastrar no vetor
     *
     *
     * @param prest PrestabilidadePetShop - Objeto que ira ser adicionado ao
     * vetor
     */
    @Override
    public void cadastrar(Object prest) {
        this.prestPetShop.add((PrestabilidadePetShop) prest);

    }

    /**
     * Metodo para remover uma posicao do vetor
     *
     * @param index int - Indice que ira ser removido do vetor definido na
     * classe
     */
    public void remover(int index) {
        this.prestPetShop.remove(index);

    }

    /**
     * Metodo pra procura de um produto
     *
     * @param codigo int - Codigo para ser encontrado
     * @return int - Index da posicao encontrada ou -1 se nao for encontrado
     */
    public int procurarProdutos(int codigo) {
        for (int i = 0; i < prestPetShop.size(); i++) {
            if (prestPetShop.get(i) instanceof Produtos) {
                if (prestPetShop.get(i).getCodigo() == codigo) {
                    return i;
                }
            }
        }

        return -1;
    }
    
    /**Metodo que procura pacotes
     * 
     * @param codigo Codigo para pesquisa
     * @return int - Se diferente de -1 retorna a posicao encntrada do Pacote
     */
    
    public int procurarPacotes(int codigo) {
        for (int i = 0; i < prestPetShop.size(); i++) {
            if (prestPetShop.get(i) instanceof Pacotes) {
                if (prestPetShop.get(i).getCodigo() == codigo) {
                    return i;
                }
            }
        }

        return -1;
    }
    
    /**Metodo que procura servicos
     * 
     * @param codigo  Codigo para pesquisa
     * @return int - Se diferente de -1 retorna a posicao encontrada do servico
     */
    
    public int procurarServicos(int codigo) {
        for (int i = 0; i < prestPetShop.size(); i++) {
            if (prestPetShop.get(i) instanceof Servicos) {
                if (prestPetShop.get(i).getCodigo() == codigo) {
                    return i;
                }
            }
        }

        return -1;
    }

    /**
     * Metodo que retorna o ArrayList definido na Classe
     *
     * @return PrestabilidadePetShop - ArrayList
     */
    public ArrayList<PrestabilidadePetShop> getArrayPrestabilidade() {
        return prestPetShop;
    }
    
    /** Metodo para editar uma prestabilidade
     * 
     * @param index Indice do Array
     * @param descricao Nova descricao
     * @param codigo Novo codigo
     * @param valor Novo valor
     */
    
    public void editar(int index, String descricao, int codigo, double valor) {
        prestPetShop.get(index).setCodigo(codigo);
        prestPetShop.get(index).setPreco(valor);
        prestPetShop.get(index).setDescricao(descricao);

    }
}
