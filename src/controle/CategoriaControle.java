/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

/**
 *
 * @author victor
 */
public class CategoriaControle {
    public static java.util.List<String> listarTodas() throws ClassNotFoundException{
        java.util.List<String> categs = new java.util.ArrayList<>();
        java.util.List<modelo.Categoria> cats = modelo.dao.CategoriaDao.listarTodas();
        for (modelo.Categoria c : cats){
            categs.add(c.getNome());
        }
        return categs;
    }
    
    public static String buscarId(String nome) throws ClassNotFoundException{
        Integer id = modelo.dao.CategoriaDao.buscarId(nome);
        return id.toString();
    }
}
