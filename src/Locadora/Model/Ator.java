
package Locadora.Model;

import java.util.ArrayList;
import Locadora.Dao.ExceptionDAO;
import Locadora.Dao.AtorDAO;

public class Ator {
    private int codAtor;
    private String nacionalidade;
    private String nome;

  
    private ArrayList<Filme> filmes = new ArrayList<Filme>();

    
    
    public Ator(){
    
    }
    
    public Ator(String nome, String nacionalidade) {
        this.nacionalidade = nacionalidade;
        this.nome = nome;
    }
    
    public int getCodAtor() {
        return codAtor;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Filme> getFilmes() {
        return filmes;
    }

    public void setCodAtor(int codAtor) {
        this.codAtor = codAtor;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFilmes(ArrayList<Filme> filmes) {
        this.filmes = filmes;
    }

    public void cadastrarAtor(Ator ator) throws ExceptionDAO{
        
        new AtorDAO().cadastrarAtor(ator);
    }
    public void apagarAtor(Ator ator) throws ExceptionDAO{
    
        new AtorDAO().apagarAtor(ator);
    
    }
    public void alterarAtor(Ator ator) throws ExceptionDAO{
       
        new AtorDAO().alterarAtor(ator);
    }
     public ArrayList<Ator> listarAtores(String nome)throws ExceptionDAO{
            
         return new AtorDAO().listarAtores(nome);
                    
     }
    
    
   
}
