package controller;

import model.Caixa;
import java.io.*;

/**
 * Classe que salva as todas as informacoes em arquivo
 *
 * @author Sidney, Adrielly e Mariana
 */
public class SalvarInformacoes {

    /**
     * Metodo que salva no arquivo objetos do tipo CadastroPessoas
     *
     *
     * @see CadastroPessoas
     * @param pessoas Objeto do tipo CadastroPessoas
     */
    public void salvarArquivo(CadastroPessoas pessoas) {
        try {
            FileOutputStream arq = new FileOutputStream("pessoas.arq");
            ObjectOutputStream obj = new ObjectOutputStream(arq);
            obj.writeObject(pessoas);
            obj.flush();

        }catch (IOException erro) {

        }
    }

    /**
     * Metodo que ler o arquivo de CadastroPessoas e retorna um objeto do mesmo
     *
     * @return CadastroPessoas - Objeto do tipo CadastroPessoas
     */
    public CadastroPessoas lerArquivoPessoas() {
        try {
            FileInputStream arq = new FileInputStream("pessoas.arq");
            ObjectInputStream obj = new ObjectInputStream(arq);
            CadastroPessoas pessoas = (CadastroPessoas) obj.readObject();

            return pessoas;
        }catch (IOException | ClassNotFoundException erro) {

            return new CadastroPessoas();
        }

    }

    /**
     * Metodo que salva no arquivo objetos do tipo CadastroPrestabilidade
     *
     *
     * @see CadastroPrestabilidade
     * @param prest Objeto do tipo CadastroPrestabilidade
     */
    public void salvarArquivo(CadastroPrestabilidade prest) {
        try {
            FileOutputStream arq = new FileOutputStream("prestabilidade.arq");
            ObjectOutputStream obj = new ObjectOutputStream(arq);
            obj.writeObject(prest);
            obj.flush();

        }catch (IOException erro) {

        }
    }

    /**
     * Metodo que ler o arquivo de CadastroPrestabilidade e retorna um objeto do
     * mesmo
     *
     * @return CadastroPrestabilidade - Objeto do tipo CadastroPrestabilidade
     */
    public CadastroPrestabilidade lerArquivoPrest() {
        try {
            FileInputStream arq = new FileInputStream("prestabilidade.arq");
            ObjectInputStream obj = new ObjectInputStream(arq);
            CadastroPrestabilidade prest = (CadastroPrestabilidade) obj.readObject();

            return prest;
        }catch (IOException | ClassNotFoundException erro) {

            return new CadastroPrestabilidade();
        }

    }

    /**
     * Metodo que salva no arquivo objetos do tipo CadastroRelatorios
     *
     *
     * @see CadastroRelatorios
     * @param rel Objeto do tipo CadastroRelatorios
     */
    public void salvarArquivo(CadastroRelatorios rel) {
        try {
            FileOutputStream arq = new FileOutputStream("relatorio.arq");
            ObjectOutputStream obj = new ObjectOutputStream(arq);
            obj.writeObject(rel);
            obj.flush();

        }catch (IOException erro) {

        }
    }

    /**
     * Metodo que ler o arquivo objetos do tipo CadastroRelatorios
     *
     *
     * @see CadastroRelatorios
     * @return - Objeto do tipo CadastroRelatorios
     */
    public CadastroRelatorios lerArquivoRelatorios() {
        try {
            FileInputStream arq = new FileInputStream("relatorio.arq");
            ObjectInputStream obj = new ObjectInputStream(arq);
            CadastroRelatorios rel = (CadastroRelatorios) obj.readObject();

            return rel;
        }catch (IOException | ClassNotFoundException erro) {

            return new CadastroRelatorios();
        }

    }

    /**
     * Metodo que salva no arquivo objetos do tipo Caixa
     *
     *
     * @see Caixa
     * @param caixa Objeto do tipo Caixa
     */
    public void salvarArquivo(Caixa caixa) {
        try {
            FileOutputStream arq = new FileOutputStream("caixa.arq");
            ObjectOutputStream obj = new ObjectOutputStream(arq);
            obj.writeObject(caixa);
            obj.flush();

        } catch (IOException erro) {

        }
    }

    /**
     * Metodo que ler o arquivo objetos do tipo Caixa
     *
     *
     * @see Caixa
     * @return - Objeto do tipo Caixa
     */
    public Caixa lerArquivoCaixa() {
        try {
            FileInputStream arq = new FileInputStream("caixa.arq");
            ObjectInputStream obj = new ObjectInputStream(arq);
            Caixa caixa = (Caixa) obj.readObject();

            return caixa;
        }catch (IOException | ClassNotFoundException erro) {

            return new Caixa(0.0);
        }
    }

}
