package controller;

import util.OperacoesCadastrais;
import java.io.Serializable;
import java.util.ArrayList;
import model.Relatorio;

/** Classe que cadastra relatorios produzidos implementa OperacoesCadastrais.
 *
 * @see Relatorio
 * @see OperacoesCadastrais
 * @author Sidney, Adrielly, Mariana
 */
public class CadastroRelatorios implements Serializable, OperacoesCadastrais{
    
    /**
     * Array que ira salvar os relatorios
     */
    ArrayList<Relatorio> relatorios = new ArrayList();
    
    
    
    /**
     * Metodo que cadastra um Objeto do tipo Relatorio
     * 
     * @see Relatorio
     * @param object 
     */
    @Override
    public void cadastrar(Object object){
        relatorios.add((Relatorio)object);
    }
    
    /**
     * Retorna o array que foi salvo os relatorios.
     * 
     * @see ArrayList
     * @return relatorios - Array Definido na classe
     */
    public ArrayList<Relatorio> getRelatorios(){
        return relatorios;
    }
    
    /**
     * Retorna o valor de todos os relatorios cadastrados
     * 
     * @return double - Valo dos relatorios
     */
    public double valorTotalDosRelatorios(){
        double valor = 0.0;
        for(int i  = 0; i < relatorios.size(); i++){
            for(int j = 0; j < relatorios.get(i).getPrestabilidades().size(); j++){
                valor += relatorios.get(i).getPrestabilidades().get(j).getPreco();
            }
        }
        
        return valor;
    }
}
