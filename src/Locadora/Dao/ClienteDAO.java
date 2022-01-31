package Locadora.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Locadora.Model.Cliente;
import java.sql.ResultSet;
import java.util.ArrayList;



public class ClienteDAO {

       public void cadastrarCliente(Cliente cliente) throws ExceptionDAO{
            String sql = "insert into cliente (nome, CPF, endereco, email, dtNascimento) value(?,?,?,?,?)";
            PreparedStatement pStatement = null;
            Connection connection = null;
            
            try {
               connection = new ConnectionMVC().getConnection();
               pStatement = connection.prepareCall(sql);
               pStatement.setString(1, cliente.getNome());
               pStatement.setString(2, cliente.getCPF());
               pStatement.setString(3, cliente.getEndereco());
               pStatement.setString(4, cliente.getEmail());
               pStatement.setDate(5, new Date(cliente.getdtNascimento().getTime()));
               pStatement.execute();
               
            } catch (SQLException e) {
               throw new ExceptionDAO("Erro no Cadastro do Cliente: " + e);
           } finally {
               
                try {
                     if(pStatement != null){pStatement.close();}
                } catch (SQLException e) {
                    throw new ExceptionDAO("Erro ao fecha bancada: " + e);
                }
                try {
                     if(connection != null){connection.close();}
                } catch (SQLException e) {
                    throw new ExceptionDAO("Erro a conexão perdida" + e);
                }
                
           }
       }
       public void apagarCliente(Cliente cliente) throws ExceptionDAO{
            String sql = "delete from cliente WHERE codCliente = ?";
            PreparedStatement pStatement = null;
            Connection connection = null;
            
            try {
               connection = new ConnectionMVC().getConnection();
               pStatement = connection.prepareCall(sql);
               pStatement.setInt(1, cliente.getCodCliente());
               pStatement.execute();
            
            } catch (SQLException e) {
               throw new ExceptionDAO("Erro no Cadastro do Cliente: " + e);
           } finally {
               
                try {
                     if(pStatement != null){pStatement.close();}
                } catch (SQLException e) {
                    throw new ExceptionDAO("Erro ao fecha bancada: " + e);
                }
                try {
                     if(connection != null){connection.close();}
                } catch (SQLException e) {
                    throw new ExceptionDAO("Erro a conexão perdida" + e);
                }
                
           }
       }
       public ArrayList<Cliente> listarClientes(String nome) throws ExceptionDAO{
       
          String sql = "select * from cliente where nome like '%"+ nome +"%' order by nome";
          Connection connection = null;
          PreparedStatement psStatement = null;
          ArrayList<Cliente> clientes = null;
          
           try {
            connection = new ConnectionMVC().getConnection();
            PreparedStatement pStatement = connection.prepareStatement(sql);
            ResultSet rs = pStatement.executeQuery(sql);
                  if(rs!=null){
                   clientes = new ArrayList<Cliente>();
                    while(rs.next()){
                    Cliente cliente = new Cliente();
                    cliente.setCodCliente(rs.getInt("codCliente"));
                    cliente.setNome(rs.getString("nome"));
                    cliente.setCPF(rs.getString("CPF"));
                    cliente.setEmail(rs.getString("email"));
                    cliente.setEndereco(rs.getString("endereco"));
                    cliente.setdtNascimento(rs.getDate("dtNascimento"));
                    clientes.add(cliente);
                    }  
            }
                  
           } catch (SQLException e) {
                throw new ExceptionDAO("Erro no Consultar Cliente: " + e);
           } finally {
               
                try {
                     if(psStatement != null){psStatement.close();}
                } catch (SQLException e) {
                    throw new ExceptionDAO("Erro ao fecha bancada: " + e);
                }
                try {
                     if(connection != null){connection.close();}
                } catch (SQLException e) {
                    throw new ExceptionDAO("Erro a conexão perdida" + e);
                }
            }
   
   return clientes;
  }
       
       public void alterarCliente(Cliente cliente) throws ExceptionDAO{
       String sql = "Update cliente set nome = ?, CPF = ?, email = ?, endereco = ?, dtNascimento = ? where codCliente = ?";
       PreparedStatement psStatement = null;
       Connection connection = null;
               
               try {
                   connection = new ConnectionMVC().getConnection();
                   psStatement.setString(1, cliente.getNome());
                   psStatement.setString(2, cliente.getCPF());
                   psStatement.setString(3, cliente.getEmail());
                   psStatement.setString(4, cliente.getEndereco());
                   psStatement.setDate(5, new Date(cliente.getdtNascimento().getTime()));
                   psStatement.setInt(6, cliente.getCodCliente());
                   psStatement.execute();
                   
           } catch (SQLException e) {
                
               throw new ExceptionDAO("Erro no Alterar Cliente: " + e);
           } finally {
               
                try {
                     if(psStatement != null){psStatement.close();}
                } catch (SQLException e) {
                    throw new ExceptionDAO("Erro ao fecha bancada: " + e);
                }
                try {
                     if(connection != null){connection.close();}
                } catch (SQLException e) {
                    throw new ExceptionDAO("Erro a conexão perdida" + e);
                }
       }
}
}