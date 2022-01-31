
package Locadora.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Locadora.Model.Filme;
import Locadora.controler.FilmeController;
import java.sql.ResultSet;
import java.util.ArrayList;


public class FilmeDAO {

       public void cadastrarFilme(Filme filme) throws ExceptionDAO{
            String sql = "insert into filme (titulo, genero, sinopse, duracao) value(?,?,?,?)";
            PreparedStatement pStatement = null;
            Connection connection = null;
            
            try {
               connection = new ConnectionMVC().getConnection();
               pStatement = connection.prepareCall(sql);
               pStatement.setString(1, filme.getTitulo());
               pStatement.setString(2, filme.getGenero());
               pStatement.setString(3, filme.getSinopse());
               pStatement.setInt(4, filme.getDuracao());
               pStatement.execute();
            
            } catch (SQLException e) {
               throw new ExceptionDAO("Erro no Cadastro do Filme: " + e);
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
       public void apagarFilme(Filme filme) throws ExceptionDAO{
            String sql = "delete from filme WHERE codFilme = ?";
            PreparedStatement pStatement = null;
            Connection connection = null;
            
            try {
               connection = new ConnectionMVC().getConnection();
               pStatement = connection.prepareCall(sql);
               pStatement.setInt(1, filme.getCodFilme());
               pStatement.execute();
            
            } catch (SQLException e) {
               throw new ExceptionDAO("Erro no Cadastro do Filme: " + e);
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
       
       public ArrayList<Filme> listarFilmes(String nome) throws ExceptionDAO{
            String sql = "select * from filme where titulo like '%"+ nome + "%' order by titulo";
            
            Connection connection = null;
            PreparedStatement pStatement = null;
            ArrayList<Filme> filmes = null;
            
            
            try {
                 connection = new ConnectionMVC().getConnection();
                 pStatement = connection.prepareStatement(sql);
                 ResultSet rs = pStatement.executeQuery(sql);
                 
                 
                 if(rs != null){
                     filmes = new ArrayList<Filme>();
                 
                     while(rs.next()){
                        Filme filme = new Filme();
                        filme.setCodFilme(rs.getInt("codFilme"));
                        filme.setTitulo(rs.getString("titulo"));
                        filme.setGenero(rs.getString("genero"));
                        filme.setSinopse(rs.getString("sinopse"));
                        filme.setDuracao(rs.getInt("duracao"));
                        filmes.add(filme);
                        
                        }
                    }
          } catch (SQLException e) {
                throw new ExceptionDAO("Erro no Consultar Filmes: " + e);
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
         return filmes;
     }


       public void alterarFilme(Filme filme) throws ExceptionDAO{
         String sql = "Update filme set titulo = ?, genero = ?, sinopse = ?, duracao = ? where codFilme = ?";
         PreparedStatement psStatement = null;
         Connection connection = null;
         
           try {
               connection = new ConnectionMVC().getConnection();
               psStatement = connection.prepareStatement(sql);
               psStatement.setString(1, filme.getTitulo());
               psStatement.setString(2, filme.getGenero());
               psStatement.setString(3, filme.getSinopse());
               psStatement.setInt(4, filme.getDuracao());
               psStatement.setInt(5, filme.getCodFilme());
               psStatement.execute();
               
           
           } catch (SQLException e) {
                throw new ExceptionDAO("Erro no Alterar Filmes: " + e);
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
