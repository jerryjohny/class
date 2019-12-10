/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

//import Model.Cliente;
import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author jerry johny
 */
public class Dao {
    
     public static Connection com;
    public static ResultSet rs;
    public static PreparedStatement stmt;
    
    
    
    
    public ArrayList<Usuario> entrar(){
      
      com  = ConnectionFactory.getConnection();
         ArrayList<Usuario> usuario = new ArrayList<>();
        try {
            stmt = com.prepareStatement("SELECT * FROM usuario");
            rs= stmt.executeQuery();
            
            while (rs.next()) {
                
                
                //1o construir um objecto do tipo que se pretende ler
                Usuario u = new Usuario(); 
                
                
                u.setNome(rs.getString("nome"));
                u.setId(rs.getInt("codigo"));
                u.setUsuario(rs.getString("usuario"));
                u.setSenha(rs.getString("senha"));
                usuario.add(u);
               
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ler a base de dados " + ex, "", JOptionPane.ERROR_MESSAGE);
        }finally {
            ConnectionFactory.closeConnection(com, stmt, rs);
        }
        return usuario;
    }
    
    
   /*  public static void gravarCloiente(Cliente cli){
     
      com  = ConnectionFactory.getConnection();
        try {
            stmt = com.prepareStatement("INSERT INTO cliente (nome,iade,classe) VALUES(?,?,?)");
            stmt.setString(1, cli.getNome());
            stmt.setInt(2, cli.getIdade());
            stmt.setInt(3, cli.getClasse());
            stmt.executeUpdate();
            System.out.println("Salvou Beleza!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao escrever na base de dados " + ex, "", JOptionPane.ERROR_MESSAGE);
        }finally {
            ConnectionFactory.closeConnection(com, stmt);
        }
     
    }*/
     
     
     
     /* public ArrayList<Cliente> lerClientes(){
      
      com  = ConnectionFactory.getConnection();
         ArrayList<Cliente> produto = new ArrayList<>();
        try {
            stmt = com.prepareStatement("SELECT * FROM cliente");
            rs= stmt.executeQuery();
            
            while (rs.next()) {
                
                
                //1o construir um objecto do tipo que se pretende ler
                Cliente prod = new Cliente(); 
                
                
                prod.setNome(rs.getString("nome"));
                prod.setCodido(rs.getInt("codigo"));
                prod.setIdade(rs.getInt("iade"));
                prod.setClasse(rs.getInt("classe"));  
                produto.add(prod);
               
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ler a base de dados " + ex, "", JOptionPane.ERROR_MESSAGE);
        }finally {
            ConnectionFactory.closeConnection(com, stmt, rs);
        }
        return produto;
    }
    */
    
}
