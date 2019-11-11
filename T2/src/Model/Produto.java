/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author jerry johny
 */
public class Produto {
    private int id;
    private  int categoria;
    private  String nome;
    private float preco;
    private  int quantidade;
    private String prazo;
    private String fornecedor;

    public Produto() {
    }

    public Produto(int categoria, String nome, float preco, int quantidade, String prazo ,String fornecedor) {
        this.categoria = categoria;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.prazo = prazo;
        this.fornecedor= fornecedor;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getPrazo() {
        return prazo;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }
    
    
    
    
    
            
    
    
}
