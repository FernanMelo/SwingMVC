
package Locadora.Model;

import Locadora.Dao.ClienteDAO;
import Locadora.Dao.ExceptionDAO;
import java.util.ArrayList;
import java.util.Date;


public class Cliente {
    private Integer codCliente;
    private String CPF;
    private String nome;
    private String endereco;
    private String email;
    private Date dtNascimento;
    
    private ArrayList<ITEM> item = new ArrayList<ITEM>();
    
   public Cliente(){   
    
   
   }

    public Cliente(String CPF, String nome, String endereco, Date dtNascimento, String email) {
        this.CPF = CPF;
        this.nome = nome;
        this.endereco = endereco;
        this.dtNascimento = dtNascimento;
        this.email = email;
    }

    public void setCodCliente(Integer codCliente) {
        this.codCliente = codCliente;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setdtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setItem(ArrayList<ITEM> item) {
        this.item = item;
    }

    public Integer getCodCliente() {
        return codCliente;
    }

    public String getCPF() {
        return CPF;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public Date getdtNascimento() {
        return dtNascimento;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<ITEM> getItem() {
        return item;
    }
  
    public void CadastrarCliente(Cliente cliente) throws ExceptionDAO{
       
        new ClienteDAO().cadastrarCliente(cliente);
    }
    public void apagarCliente(Cliente cliente) throws ExceptionDAO{
    
        new ClienteDAO().apagarCliente(cliente);
    
    }
    public void alterarCliente(Cliente cliente) throws ExceptionDAO{
        
        new ClienteDAO().alterarCliente(cliente);
    }
    public ArrayList<Cliente> listarCliente(String nome) throws ExceptionDAO{
    
        return new ClienteDAO().listarClientes(nome);
    
    }
}