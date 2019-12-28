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
public class Gravadora {
    private int codigo;
    private String nome;
    private int numeroDeMusicas;
    private String estado;

    public Gravadora(int codigo, String nome, int numeroDeMusicas, String estado) {
        this.codigo = codigo;
        this.nome = nome;
        this.numeroDeMusicas = numeroDeMusicas;
        this.estado = estado;
    }
     public Gravadora( String nome, int numeroDeMusicas, String estado) {
        
        this.nome = nome;
        this.numeroDeMusicas = numeroDeMusicas;
        this.estado = estado;
    }

    public Gravadora() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDeMusicas() {
        return numeroDeMusicas;
    }

    public void setNumeroDeMusicas(int numeroDeMusicas) {
        this.numeroDeMusicas = numeroDeMusicas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
