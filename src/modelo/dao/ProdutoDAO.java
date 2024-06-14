/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;
import java.util.*;
import java.sql.SQLException;
/**
 *
 * @author victor
 */
public class ProdutoDAO {
    private static final String LISTAR = "SELECT * FROM dbloja.produto";
    private static final String INSERIR = "INSERT INTO dbloja.produto (nome, categoria, validade, qtd_estoque, fabricacao, tipo, fornecedor, qtd_entrada, preco) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String EXCLUIR = "DELETE FROM PRODUTO WHERE id = ?";
    private static final String CONSULTAR = "SELECT * FROM dbloja.produto where id = ?";
    private static final String UPDATE = "UPDATE produto set nome = ?, categoria = ?, validade = ?, qtd_estoque = ?, fabricacao = ?, tipo = ?, fornecedor = ?, qtd_entrada = ?, preco = ? where id = ?";
    
    public static java.util.List<modelo.Produto> listarTodos(){
        java.sql.Connection con = null;
        java.sql.PreparedStatement pstmt = null;
        java.sql.ResultSet rs = null;
        java.util.List<modelo.Produto> retorno = new java.util.ArrayList<>();
                
        try{
            con = util.FabricaConexao.getConexao();
            pstmt = con.prepareStatement(LISTAR);
            rs = pstmt.executeQuery();
            while (rs.next()){
                modelo.Produto prod = new modelo.Produto();
                prod.setId(rs.getInt("id"));
                prod.setNome(rs.getString("nome"));
                prod.setCategoria(rs.getInt("categoria"));
                prod.setValidade(rs.getString("validade"));
                prod.setQtd_estoque(rs.getInt("qtd_estoque"));
                prod.setFabricacao(rs.getString("fabricacao"));
                prod.setTipo(rs.getString("tipo"));
                prod.setFornecedor(rs.getString("fornecedor"));
                prod.setQtd_entrada(rs.getInt("qtd_entrada"));
                prod.setPreco(rs.getDouble("preco"));
                retorno.add(prod);
            }
        }catch (ClassNotFoundException | SQLException err){
            throw new RuntimeException(err);
        }
        return retorno;
    }
    
    
    public static boolean inserirProduto(modelo.Produto prod) throws ClassNotFoundException{
        java.sql.Connection con = null;
        java.sql.PreparedStatement pstmt = null;
        boolean retorno = false;
        try{
            con = util.FabricaConexao.getConexao();
            pstmt = con.prepareStatement(INSERIR);
            pstmt.setString(1, prod.getNome());
            pstmt.setInt(2, prod.getCategoria());
            pstmt.setString(3, prod.getValidade());
            pstmt.setInt(4, prod.getQtd_estoque());
            pstmt.setString(5, prod.getFabricacao());
            pstmt.setString(6, prod.getTipo());
            pstmt.setString(7, prod.getFornecedor());
            pstmt.setInt(8, prod.getQtd_entrada());
            pstmt.setDouble(9, prod.getPreco());
            pstmt.execute();
            util.FabricaConexao.fechaConexao(con, pstmt);
        }catch(java.sql.SQLException err){
            throw new RuntimeException(err);
        }
        return retorno;
    }
    
    public static boolean excluir(modelo.Produto prod) throws ClassNotFoundException, SQLException{
        java.sql.Connection con = null;
        java.sql.PreparedStatement pstmt = null;
        boolean retorno = false;
        try{
            con = util.FabricaConexao.getConexao();
            pstmt = con.prepareStatement(EXCLUIR);
            pstmt.setInt(1, prod.getId());
            pstmt.execute();
            util.FabricaConexao.fechaConexao(con, pstmt);
        }catch(java.sql.SQLException err){
            throw new RuntimeException(err);
        }
        return retorno;
    }
    
    public static modelo.Produto consultarId(modelo.Produto prod) throws ClassNotFoundException{
        java.sql.Connection con = null;
        java.sql.PreparedStatement pstmt = null;
        java.sql.ResultSet rs = null;        
        modelo.Produto p = null;
        try{            
            con = util.FabricaConexao.getConexao();
            pstmt = con.prepareStatement(CONSULTAR);
            pstmt.setInt(1, prod.getId());
            rs = pstmt.executeQuery();
            if(rs.next()){
                p = new modelo.Produto();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setCategoria(rs.getInt("categoria"));
                p.setValidade(rs.getString("validade"));
                p.setQtd_estoque(rs.getInt("qtd_estoque"));
                p.setFabricacao(rs.getString("fabricacao"));
                p.setTipo(rs.getString("tipo"));
                p.setFornecedor(rs.getString("fornecedor"));
                p.setQtd_entrada(rs.getInt("qtd_entrada"));
                p.setPreco(rs.getDouble("preco"));
            }
            con.close();
        }catch(java.sql.SQLException err){
            throw new RuntimeException(err);
        }        
        return p;
    }
    
    public void update(modelo.Produto prod) throws ClassNotFoundException, SQLException{
        java.sql.Connection con = null;
        java.sql.PreparedStatement pstmt = null;
        try{
            con = util.FabricaConexao.getConexao();
            pstmt = con.prepareStatement(UPDATE);
            pstmt.setString(1, prod.getNome());
            pstmt.setInt(2, prod.getCategoria());
            pstmt.setString(3, prod.getValidade());
            pstmt.setInt(4, prod.getQtd_estoque());
            pstmt.setString(5, prod.getFabricacao());
            pstmt.setString(6, prod.getTipo());
            pstmt.setString(7, prod.getFornecedor());
            pstmt.setInt(8, prod.getQtd_entrada());
            pstmt.setDouble(9, prod.getPreco());
            pstmt.setInt(10, prod.getId());            
            pstmt.execute();
            con.close();
        }catch(java.sql.SQLException err){
            throw new RuntimeException(err);
        }
    }
}
