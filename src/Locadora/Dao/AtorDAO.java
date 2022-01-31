package Locadora.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Locadora.Model.Ator;
import java.sql.ResultSet;
import java.util.ArrayList;


public class AtorDAO {

       public void cadastrarAtor(Ator ator) throws ExceptionDAO{
            String sql = "insert into ator (nome, nacionalidade) value(?,?)";
            PreparedStatement pStatement = null;
            Connection connection = null;
            
            try {
               connection = new ConnectionMVC().getConnection();
               pStatement = connection.prepareCall(sql);
               pStatement.setString(1, ator.getNome());
               pStatement.setString(2, ator.getNacionalidade());
               pStatement.execute();
            } catch (SQLException e) {
               throw new ExceptionDAO("Erro no Cadastro do ATOR: " + e);
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
       public ArrayList<Ator> listarAtores(String nome) throws ExceptionDAO{
        String sql = "select * from ator where nome like '%"+ nome +"%' order by nome";  
        Connection connection = null;
        PreparedStatement psStatement = null;
        ArrayList<Ator> atores = null;
        
        try {
            connection = new ConnectionMVC().getConnection();
            PreparedStatement pStatement = connection.prepareStatement(sql);
            ResultSet rs = pStatement.executeQuery(sql);
                  if(rs != null){
                   atores = new ArrayList<Ator>();
                   while(rs.next()){
                         Ator ator = new Ator();
                         ator.setCodAtor(rs.getInt("codAtor"));
                         ator.setNome(rs.getString("nome"));
                         ator.setNacionalidade(rs.getString("nacionalidade"));
                         atores.add(ator);
                   }
                }
        } catch (SQLException e) {
                throw new ExceptionDAO("Erro no Consultar Atores: " + e);
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
        return atores;
    }
       public void apagarAtor(Ator ator) throws ExceptionDAO{
            String sql = "delete from ator WHERE codAtor = ?";
            PreparedStatement pStatement = null;
            Connection connection = null;
            
            try {
               connection = new ConnectionMVC().getConnection();
               pStatement = connection.prepareCall(sql);
               pStatement.setInt(1, ator.getCodAtor());
               pStatement.execute();
            
            } catch (SQLException e) {
               throw new ExceptionDAO("Erro no Cadastro do Ator: " + e);
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
       public void alterarAtor(Ator ator) throws ExceptionDAO{
       String sql = "Update ator set nome = ?, nacionalidade = ? where codAtor = ?";
       PreparedStatement psStatement = null;
       Connection connection = null;
       
           try {
               connection = new ConnectionMVC().getConnection();
               psStatement = connection.prepareStatement(sql);
               psStatement.setString(1, ator.getNome());
               psStatement.setString(2, ator.getNacionalidade());
               psStatement.setInt(3, ator.getCodAtor());
               psStatement.execute();
               
           } catch (SQLException e) {
                
               throw new ExceptionDAO("Erro no Alterar Ator: " + e);
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