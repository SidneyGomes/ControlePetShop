package model;

import model.Pets;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * Classe que extende Pessoas para o cadastro de clientes e operacoes cadastrais
 * de Pets
 *
 * @see Pessoas
 * @see Pets
 * @author Sidney, Adrielly e Mariana
 */
public class Clientes extends Pessoas implements Serializable {

    private final ArrayList<Pets> animaiszinho;

    /**
     * Metodo construtor que ira criar o Cliente e passar para a classe pai
     * Pessoas
     *
     * @param nome Nome que sera passado para a classe pai Pessoas
     * @param codigo Codigo que sera passado para classe pai Pessoas
     */
    public Clientes(String nome, int codigo) {
        super(nome, codigo);
        this.animaiszinho = new ArrayList();

    }

    /**
     * Metodo que adiciona animais ao Array de Pets
     *
     * @param pet Objeto do tipo Pet
     */
    public void adicionarAnimais(Pets pet) {
        this.animaiszinho.add(pet);
    }

    /**
     * Metodo pra retornar o ArrayList de Pets
     *
     * @return Pets - Retorna ArrayList de Pets
     */
    public ArrayList<Pets> getAnimaiszinho() {
        return this.animaiszinho;
    }

    /**
     * Metodo que ira procurar um animal por seu codigo
     *
     *
     * @param codigo Codigo que sera usado pra pesquisa
     * @return int - Se for diferente de -1 é um indice do Array que foi
     * encontrado o Pet
     */
    public int procurarAnimal(int codigo) {
        for (int i = 0; i < animaiszinho.size(); i++) {
            if (this.animaiszinho.get(i).getCodigo() == codigo) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Metodo para remover o Pet
     *
     *
     * @param index Indice que ira ser usado pra remover do Array
     */
    public void removerAnimal(int index) {
        animaiszinho.remove(index);
    }

    /**
     * Metodo para editar o Pet
     *
     *
     * @param index Indice que ira ser usado pra editar no Array
     * @param nome Nome que ira ser usado pra editar
     * @param codigo Codigo que ira ser usado pra editar
     * @param raca Raca que ira ser usado pra editar
     * @param especie Especie que ira ser usado pra editar
     */
    public void editarAnimal(int index, String nome, int codigo, String raca, String especie) {
        animaiszinho.get(index).setCodigo(codigo);
        animaiszinho.get(index).setNome(nome);
        animaiszinho.get(index).setRaca(raca);
        animaiszinho.get(index).setEspecie(especie);
    }

}
