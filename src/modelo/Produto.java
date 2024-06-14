/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author victor
 */
public class Produto {
    private int id;
    private String nome;
    private int categoria;
    private String validade;
    private int qtd_estoque;
    private String fabricacao;
    private String tipo;
    private String fornecedor;
    private int qtd_entrada;
    private double preco;
    
    
    public int getId()
    {
        return id;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public int getCategoria()
    {
        return categoria;
    }
    
    public void setCategoria(int categoria)
    {
        this.categoria = categoria;
    }
    
    public String getValidade()
    {
        return validade;
    }
    
    public void setValidade(String validade)
    {
        this.validade = validade;
    }
    
    public int getQtd_estoque()
    {
        return qtd_estoque;
    }
    
    public void setQtd_estoque(int qtd_estoque)
    {
        this.qtd_estoque = qtd_estoque;
    }
    
    public String getFabricacao()
    {
        return fabricacao;
    }
    
    public void setFabricacao(String fabricacao)
    {
        this.fabricacao = fabricacao;
    }
    
    public String getTipo()
    {
        return tipo;
    }
    
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
    
    public String getFornecedor()
    {
        return fornecedor;
    }
    
    public void setFornecedor(String fornecedor)
    {
        this.fornecedor = fornecedor;
    }
    
    public int getQtd_entrada()
    {
        return qtd_entrada;
    }
    
    public void setQtd_entrada(int qtd_entrada)
    {
        this.qtd_entrada = qtd_entrada;
    }
    
    public double getPreco()
    {
        return preco;
    }
    
    public void setPreco(double preco)
    {
        this.preco = preco;
    }
    
}
