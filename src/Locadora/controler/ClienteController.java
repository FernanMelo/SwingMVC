
package Locadora.controler;

import Locadora.Dao.ExceptionDAO;
import Locadora.Model.Cliente;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class ClienteController {
    
    
    public boolean cadastrarCliente(String CPF, String nome, String endereco, String dtNascimento, String email) throws Exception{
       
          if(ValidarCPF(CPF) && nome != null && nome.length()>0 && endereco != null && endereco.length()>0
            && ValidarData(dtNascimento) && email != null && email.length()>0){
          SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
          Date data = formato.parse(dtNascimento);
          Cliente cliente = new Cliente(CPF, nome, endereco, data, email);
          cliente.CadastrarCliente(cliente);
          return true;
          
          }
          return false;  
 }
    public boolean apagarCliente(int codCliente)throws ExceptionDAO{
    
     if(codCliente == 0)
         return false;
     else
     {
         Cliente cliente = new Cliente();
         cliente.setCodCliente(codCliente);
         cliente.apagarCliente(cliente);
         return true;
     }
    
    
    }
    public boolean alterarCliente(int codCliente, String CPF, String nome, String endereco, String dtNascimento, String email) throws Exception{
       
          if(ValidarCPF(CPF) && nome != null && nome.length()>0 && endereco != null && endereco.length()>0
            && ValidarData(dtNascimento) && email != null && email.length()>0){
          SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
          Date data = formato.parse(dtNascimento);
          Cliente cliente = new Cliente(CPF, nome, endereco, data, email);
          cliente.setCodCliente(codCliente);
          cliente.alterarCliente(cliente);
          return true;
          
          }
          return false;  
 }
    public ArrayList<Cliente> listarCliente(String nome)throws ExceptionDAO{
    
     return new Cliente().listarCliente(nome);
    
    }
    public boolean ValidarCPF(String CPF){
    
        for (int i = 0; i < CPF.length(); i++){
               if(!Character.isDigit(CPF.charAt(i))){
                    if(!(i == 3 || i == 7 || i == 11)){
                     return false;  
                     }
                }       
        }
       return true; 
    }

    public boolean ValidarData(String data){
    
        for (int i = 0; i < data.length(); i++){
               if(!Character.isDigit(data.charAt(i))){
                    if(!(i == 2 || i == 5)){
                     return false;  
                     }
                }       
        }
       return true; 
    }
    
    


}