    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.sql.SQLException;

/**
 *
 * @author victor
 */
public class ProdutoControle {
    /*elemento no índice 0 contém o nome do produto e no índice 1 o id da categoria*/
    
    public static boolean inserirProduto(String[] atributos) throws ClassNotFoundException{
        modelo.Produto prod = new modelo.Produto();
        prod.setNome(atributos[0]);
        modelo.dao.CategoriaDao cdao = new modelo.dao.CategoriaDao();
        int idcat = cdao.buscarId(atributos[1]);        
        prod.setCategoria(idcat);
        prod.setValidade(atributos [2]);
        prod.setQtd_estoque(Integer.parseInt(atributos[3]));
        prod.setFabricacao(atributos[4]);
        prod.setTipo(atributos[5]);
        prod.setFornecedor(atributos[6]);
        prod.setQtd_entrada(Integer.parseInt(atributos[7]));
        prod.setPreco(Double.parseDouble(atributos[8]));        
        boolean retorno = modelo.dao.ProdutoDAO.inserirProduto(prod);
        return retorno;
    }
    
    public static java.util.List<Object[]> obterTodos(){
        java.util.List<Object[]> retorno = new java.util.ArrayList<>();
        java.util.List<modelo.Produto> produtos = modelo.dao.ProdutoDAO.listarTodos();
        for (modelo.Produto p : produtos){
            retorno.add(new Object[]{p.getId(), p.getNome(), p.getCategoria(), p.getValidade(), p.getQtd_estoque(), p.getFabricacao(), p.getTipo(), p.getFornecedor(), p.getQtd_entrada(), p.getPreco()});
        }
        return retorno;
    }
    
    public static void excluir(String[] atributos) throws ClassNotFoundException, SQLException{
        modelo.dao.ProdutoDAO pdao = new modelo.dao.ProdutoDAO();
        modelo.Produto prod = new modelo.Produto();
        prod.setId (Integer.parseInt(atributos[0]));
        System.out.println(prod.toString());
        boolean retorno = modelo.dao.ProdutoDAO.excluir(prod);
    }
    
    public static modelo.Produto consultarId(String id) throws ClassNotFoundException, SQLException{
        modelo.dao.ProdutoDAO pdao = new modelo.dao.ProdutoDAO();
        modelo.Produto prod = new modelo.Produto();
        prod.setId(Integer.parseInt(id));
        modelo.Produto retorno = modelo.dao.ProdutoDAO.consultarId(prod);
        return retorno;
    }    
    
    public static void update(String[] atributos) throws ClassNotFoundException, SQLException{
        modelo.dao.ProdutoDAO pdao = new modelo.dao.ProdutoDAO();
        modelo.Produto prod = new modelo.Produto();
        modelo.dao.CategoriaDao cdao = new modelo.dao.CategoriaDao();        
        prod.setNome(atributos[0]);
        int idcat = cdao.buscarId(atributos[1]);        
        prod.setCategoria(idcat);
        prod.setValidade(atributos[2]);
        prod.setQtd_estoque(Integer.parseInt(atributos[3]));
        prod.setFabricacao(atributos[4]);
        prod.setTipo(atributos[5]);
        prod.setFornecedor(atributos[6]);
        prod.setQtd_entrada(Integer.parseInt(atributos[7]));
        prod.setPreco(Double.parseDouble(atributos[8]));
        prod.setId(Integer.parseInt(atributos[9]));        
        pdao.update(prod);
    }   
}

