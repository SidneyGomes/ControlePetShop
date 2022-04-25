package controller;

import util.OperacoesCadastrais;
import model.Clientes;
import model.Pessoas;
import model.Funcionarios;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Classe que contem um ArrayList que implementa operacoes cadastrais com
 * classes que herdam de Pessoas.
 *
 * @see Pessoas
 * @author Sidney, Adrielly e Mariana
 */
public class CadastroPessoas implements Serializable, OperacoesCadastrais{

    private final ArrayList<Pessoas> pessoas = new ArrayList<>();

    /**
     * Metodo que retorna um ArrayList de Pessoas definido na classe
     *
     * @return ArrayList - ArrayList de Pessoas
     */
    public ArrayList<Pessoas> getArrayList() {
        return this.pessoas;
    }

    /**
     * Metodo que cadastra uma pessoa, passando seu objeto.
     *
     * @param pessoa Objeto do tipo Pessoa
     */
    @Override
    public void cadastrar(Object pessoa) {
        this.pessoas.add((Pessoas)pessoa);
    }

    /**
     * Metodo que remove um cliente pelo seu codigo
     *
     *
     * @param codigo Codigo do cliente a ser removido
     */
    public void removerCliente(int codigo) {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i) instanceof Clientes) {
                if (pessoas.get(i).getCodigo() == codigo) {
                    pessoas.remove(i);
                }
            }
        }
    }

    /**
     * Metodo que remove um cliente pelo seu codigo
     *
     *
     * @param codigo Codigo do funcionario a ser removido
     */
    public void removerFuncionario(int codigo) {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i) instanceof Funcionarios) {
                if (pessoas.get(i).getCodigo() == codigo) {
                    pessoas.remove(i);
                }
            }
        }
    }

    /**
     * Metodo que procura um funcionario pelo seu codigo
     *
     *
     * @param codigo Codigo do funcionario a ser pesquisado
     * @return int - Se for diferente de -1 retorna a posicao onde foi
     * encontrado o funcionario
     */
    public int procurarFuncionario(int codigo) {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i) instanceof Funcionarios) {
                if (pessoas.get(i).getCodigo() == codigo) {
                    return i;
                }
            }
        }

        return -1;
    }

    /**
     * Metodo que procura um cliente pelo seu codigo;
     *
     *
     * @param codigo Codigo do funcionario a ser removido
     * @return int - Se for diferente de -1 retorna a posicao onde foi
     * encontrado o cliente
     */
    public int procurarCliente(int codigo) {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i) instanceof Clientes) {
                if (pessoas.get(i).getCodigo() == codigo) {
                    return i;
                }
            }
        }

        return -1;
    }

    /**
     * Edita um cliente, pelo seu indice encontrado
     *
     * @param index Indice do vetor onde sera editado
     * @param nome Nome do cliente
     * @param codigo Codigo do cliente
     */
    public void editarCliente(int index, String nome, int codigo) {
        this.pessoas.get(index).setCodigo(codigo);
        this.pessoas.get(index).setNome(nome);

    }

    /**
     * Edita um funcionario, pelo seu indice encontrado
     *
     * @param index Indice do vetor onde sera editado
     * @param nome Nome do funcionario
     * @param codigo Codigo do funcionario
     */
    public void editarFuncionario(int index, String nome, int codigo) {
        this.pessoas.get(index).setCodigo(codigo);
        this.pessoas.get(index).setNome(nome);

    }

}
