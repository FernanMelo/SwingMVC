
package Locadora.controler;

import Locadora.Dao.ExceptionDAO;
import Locadora.Dao.FilmeDAO;
import Locadora.Model.Filme;
import java.util.ArrayList;


public class FilmeController {
    
    
    public boolean cadastrarFilme(String titulo, String genero, String sinopse, Integer duracao) throws ExceptionDAO{
    
    if (titulo != null && titulo.length() > 0 && genero != null && genero.length() > 0 && sinopse != null && sinopse.length() > 0 && duracao > 0 ){
    
          Filme filme = new Filme(titulo, genero, sinopse, duracao);
          filme.cadastrarFilme(filme);
          return true;
    }
    else        
   return false;
  }
    public boolean apagarFilme(int codFilme)throws ExceptionDAO{
    
     if(codFilme == 0)
         return false;
     else
     {
         Filme filme = new Filme();
         filme.setCodFilme(codFilme);
         filme.apagarFilme(filme);
         return true;
     }
    
    
    }
    public ArrayList<Filme> ListarFilmes(String nome) throws ExceptionDAO{
    
          return new FilmeDAO().listarFilmes(nome);
    }
    public boolean alterarFilme(int codFilme, String titulo, String genero, String sinopse, Integer duracao) throws ExceptionDAO{
    
    if (titulo != null && titulo.length() > 0 && genero != null && genero.length() > 0 && sinopse != null && sinopse.length() > 0 && duracao > 0 ){
    
          Filme filme = new Filme(titulo, genero, sinopse, duracao);
          filme.setCodFilme(codFilme);
          filme.alterarFilme(filme);
          return true;
    }
    else        
   return false;
  }
    
}
