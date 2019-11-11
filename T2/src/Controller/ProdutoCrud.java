
package Controller;

import Model.Estagiario;
import Model.Produto;
import Model.Usuario;
import java.awt.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Humeid Ussene
 */
public class ProdutoCrud {
  public static Connection com;
    public static ResultSet rs;
    public static PreparedStatement stmt;
    Date data=Date.valueOf(LocalDate.MIN);
        SimpleDateFormat f = new SimpleDateFormat("y-M-dd");
        String a= f.format(data.getDate());
        
     
    
 public  void gravarProduto( Estagiario po){
    
     com  = ConnectionFactory.getConnection();
        try {
            stmt = com.prepareStatement("INSERT INTO Estagiario (apelido,nomes,contacto, nacimento, estado,cod_formacao,cod_departamento) VALUES(?,?,?,?,?,?,?)");
            stmt.setString(1, po.getApelido());
            stmt.setString(2, po.getNomes());
            stmt.setString(3, po.getContacto());
            stmt.setString(4, po.getNacimento());
            stmt.setString(5, po.getEstado());
            stmt.setString(6, po.getFormacao());
            stmt.setString(7, po.getDepartamento());
            
            stmt.executeUpdate();
            System.out.println("Salvou Beleza!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao escrever na base de dados " + ex, "", JOptionPane.ERROR_MESSAGE);
        }finally {
            ConnectionFactory.closeConnection(com, stmt);
        }
     
    }
    
 
 public static void actualizarProduto(Produto po){
     
     com  = ConnectionFactory.getConnection();
        try {
            stmt = com.prepareStatement("UPDATE produtos SET descricao = ? ,quantidade = ?,preco = ? where id = ?");
            stmt.setInt(2, po.getCategoria());
            stmt.setString(3, po.getNome());
            stmt.setFloat(4, po.getPreco());
            stmt.setInt(5, po.getQuantidade());
            stmt.executeUpdate();
            System.out.println("Actualizou Beleza!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Actualizar na base de dados " + ex, "", JOptionPane.ERROR_MESSAGE);
        }finally {
            ConnectionFactory.closeConnection(com, stmt);
        }
     
    }
 
 
 
 public static void apagarProduto(Produto po){
     
     com  = ConnectionFactory.getConnection();
        try {
            stmt = com.prepareStatement("DELETE FROM produtos WHERE id = ?");
            stmt.setInt(1, po.getId());
            stmt.executeUpdate();
            System.out.println("Apagou Xuxu Beleza!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir na base de dados " + ex, " ", JOptionPane.ERROR_MESSAGE);
        }finally {
            ConnectionFactory.closeConnection(com, stmt);
        }
     
    }
 //===========================================================================================ler todos produtos====================================
  public ArrayList<Estagiario> lerProdutos(){
      
      com  = ConnectionFactory.getConnection();
         ArrayList<Estagiario> produto = new ArrayList<>();
        try {
            stmt = com.prepareStatement("SELECT e.nome, e.departamento, d.nome, f.nome    FROM estagiario e join  f  on e.formacao = f.id join defartamrnto d on e.departamento = departamento.id ");
            rs= stmt.executeQuery();
            
            while (rs.next()) {
                
                
                //1o construir um objecto do tipo que se pretende ler
                Estagiario prod = new Estagiario(); 
                
                prod.setId_estagiario(rs.getInt("id_estagiario"));
                prod.setNomes(rs.getString("nomes"));
                prod.setFormacao(rs.getString("f.nome"));
                prod.setDepartamento(rs.getString("d.nome"));
                
             
                
                produto.add(prod);
            
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ler a base de dados " + ex, "", JOptionPane.ERROR_MESSAGE);
        }finally {
            ConnectionFactory.closeConnection(com, stmt, rs);
        }
        return produto;
    }//================================================================================================================================================
      public ArrayList<Produto> lerProdutosPorCategoria(int m){
      
      com  = ConnectionFactory.getConnection();
         ArrayList<Produto> produto = new ArrayList<>();
        try {
            stmt = com.prepareStatement("SELECT p.id,p.categoria,p.nome,p.quantidade,p.prazo, f.nome_forn FROM estagiario p join categoria c on p.categoria = c.id join fornecedor f on c.fornecedor = f.id ");
            rs= stmt.executeQuery();
            
            while (rs.next()) {
                
                
                //1o construir um objecto do tipo que se pretende ler
                Produto prod = new Produto(); 
                
                prod.setId(rs.getInt("id"));
                prod.setCategoria(rs.getInt("categoria"));
                prod.setNome(rs.getString("nome"));
                prod.setPreco(rs.getFloat("preco"));
                prod.setQuantidade(rs.getInt("quantidade"));
                prod.setPrazo(rs.getString("prazo")); 
                prod.setFornecedor(rs.getString("nome_forn"));
             
                
                produto.add(prod);
            
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ler a base de dados " + ex, "", JOptionPane.ERROR_MESSAGE);
        }finally {
            ConnectionFactory.closeConnection(com, stmt, rs);
        }
        return produto;
    }
  
  //=============================================================ler produtos de uma categoria====================================================
  
  
  
  //====================================================================================================================================================
  
  //================================================recuperar categorias para a combobox========================================
   public ArrayList<String> lerCategoriasParaCombo(){
      
      com  = ConnectionFactory.getConnection();
         ArrayList<String> categorias = new ArrayList<>();
        try {
            stmt = com.prepareStatement("SELECT curso FROM formacao");
            rs= stmt.executeQuery();
            
            while (rs.next()) {
                
                categorias.add(rs.getString("curso"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ler a base de dados " + ex, "", JOptionPane.ERROR_MESSAGE);
        }finally {
            ConnectionFactory.closeConnection(com, stmt, rs);
        }
        return categorias;
    }
  //=============================================================================================================================
  
  
  public  ArrayList<Usuario> entrar(){
   com  = ConnectionFactory.getConnection();
         ArrayList<Usuario> u = new ArrayList<>();
        try {
            stmt = com.prepareStatement("SELECT * FROM usuario");
            rs= stmt.executeQuery();
            
            while (rs.next()) {
                
                
                //1o construir um objecto do tipo que se pretende ler
                Usuario u1 = new Usuario(); 
                
                u1.setId(rs.getInt("id"));
                u1.setNome(rs.getString("nome"));
                u1.setUsuario(rs.getString("usuario"));
                u1.setSenha(rs.getString("senha"));
                u.add(u1);
               
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ler a base de dados " + ex, "", JOptionPane.ERROR_MESSAGE);
        }finally {
            ConnectionFactory.closeConnection(com, stmt, rs);
        }
        
        
        return u;
  
  
  }
  
 

  
  
   
    public static void main(String[] args) {
       
  
//        System.out.println(produto.get(0).getDescricao());
//        System.out.println(produto.get(1).getDescricao());
//        System.out.println(produto.get(2).getDescricao());
//        System.out.println(produto.get(3).getDescricao());
//        System.out.println(produto.get(4).getDescricao());
    }
        
}
