
package Locadora.controler;

import Locadora.Dao.ExceptionDAO;
import Locadora.Model.Ator;
import java.util.ArrayList;

public class AtorController {
    
  public boolean CadastrarAtor(String nome, String nacionalidade) throws ExceptionDAO{  
   
          if (nacionalidade != null && nacionalidade.length() > 0 && nome != null && nome.length() > 0) {
              
              Ator ator = new Ator(nacionalidade, nome);
              ator.cadastrarAtor(ator);
              return true;
      } else 
    return false;
  }
  
  public boolean AlterarAtor(int codAtor, String nome, String nacionalidade) throws ExceptionDAO{  
   
          if (nacionalidade != null && nacionalidade.length() > 0 && nome != null && nome.length() > 0) {
              
              Ator ator = new Ator(nacionalidade, nome);
              ator.setCodAtor(codAtor);
              ator.alterarAtor(ator);
              return true;
      } else 
    return false;
  }
       
  public ArrayList<Ator> listarAtores(String nome) throws ExceptionDAO{
  
      return new Ator().listarAtores(nome);
      
  
  }
  
  public boolean apagarAtor(int codAtor)throws ExceptionDAO{
    
     if(codAtor == 0)
         return false;
     else
     {
         Ator ator = new Ator();
         ator.setCodAtor(codAtor);
         ator.apagarAtor(ator);
         return true;
     }
    
    
    }     




}