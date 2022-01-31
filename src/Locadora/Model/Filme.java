
package Locadora.Model;

import Locadora.Dao.ExceptionDAO;
import java.util.ArrayList;
import java.util.Date;
import Locadora.Dao.FilmeDAO;

public class Filme {
    private int codFilme;
    private String titulo;
    private String genero;
    private String sinopse;
    private int duracao;
    private ArrayList<ITEM> item = new ArrayList<ITEM>();
    private ArrayList<Cliente> cliente = new ArrayList<Cliente>();
 
    public Filme(){
    
    }
    
    
    public Filme( String titulo, String genero, String sinopse, int duracao) {
        
        this.titulo = titulo;
        this.genero = genero;
        this.sinopse = sinopse;
        this.duracao = duracao;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
    public void setCodFilme(int codFilme) {
        this.codFilme = codFilme;
    }


    public void setItem(ArrayList<ITEM> item) {
        this.item = item;
    }

    public void setCliente(ArrayList<Cliente> cliente) {
        this.cliente = cliente;
    }

    
    public int getCodFilme() {
        return codFilme;
    }


    public ArrayList<ITEM> getItem() {
        return item;
    }

    public ArrayList<Cliente> getCliente() {
        return cliente;
    }

    public String getGenero() {
        return genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getTitulo() {
        return titulo;
    }
 
    public void cadastrarFilme(Filme filme) throws ExceptionDAO{
       
        new FilmeDAO().cadastrarFilme(filme);
          
    }
    public void apagarFilme(Filme filme) throws ExceptionDAO{
    
        new FilmeDAO().apagarFilme(filme);
    
    }
    public void alterarFilme(Filme filme) throws ExceptionDAO{
    
        new FilmeDAO().alterarFilme(filme);
    
    }
    public ArrayList<Filme> ListarFilmes(String nome) throws ExceptionDAO{
    
          return new FilmeDAO().listarFilmes(nome);
    }

  

}
