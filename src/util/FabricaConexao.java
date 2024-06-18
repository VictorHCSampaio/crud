package util;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author victor
 */
public class FabricaConexao {
    //dados para a conexao do banco
    private static final String USUARIO = "root";
    private static final String SENHA = "";
    private static final String BANCO = "dbloja";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String STRINGCONEXAO = "jdbc:mysql://localhost:3306/";
    
    public static Connection getConexao() throws SQLException, ClassNotFoundException{
       Connection con = null;
       try{
           Class.forName(DRIVER);
           con = DriverManager.getConnection(STRINGCONEXAO + BANCO, USUARIO, SENHA);
           return con;
       }catch(ClassNotFoundException e){
           throw new ClassNotFoundException("Driver MySql não foi encontrado" +e.getMessage());
       }catch(SQLException e){
           throw new SQLException("Erro ao conectar" + "com a base de dados" + e.getMessage());
       }
    }
    
    public static void fechaConexao(Connection con){
        try{
            if (con != null){
                con.close();
                System.out.println("Fechada a conexão com o banco de dados");
            }
        }catch (Exception e){
            System.out.println("Não foi possível fechar a conexão com o banco de dados" + e.getMessage());
        }
    }
    
    public static void fechaConexao(Connection con, PreparedStatement stmt){
        try{
            if (con != null){
                fechaConexao(con);
            }
            if(stmt != null){
                stmt.close();
                System.out.println("Statement foi fechado com sucesso");
            }
        }catch(Exception e){
            System.out.println("Não foi possível fechar o statement" + e.getMessage());
        } 
    }
    
    public static void fechaConexao(Connection con, PreparedStatement stmt, ResultSet rs){
        try{
            if(con != null || stmt != null){
                fechaConexao(con, stmt);
            }
            if(rs != null){
                rs.close();
                System.out.println("ResultSet fechado com sucesso");
            }
        }catch(Exception e){
            System.out.println("Não foi possível fechar o ResultSet" + e.getMessage());
        }   
    }
}
