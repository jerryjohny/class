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
public class Formacao {
    
    private int id_formacao;
    private String curso;
    private String duracao;
    private String estado;

    public Formacao(int id_formacao, String curso, String duracao, String estado) {
        this.id_formacao = id_formacao;
        this.curso = curso;
        this.duracao = duracao;
        this.estado = estado;
    }

    public Formacao() {
    }

    public int getId_formacao() {
        return id_formacao;
    }

    public void setId_formacao(int id_formacao) {
        this.id_formacao = id_formacao;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
