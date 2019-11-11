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
public class Estagiario {
    private int id_estagiario;
    private  String apelido;
    private String nomes;
    private String contacto;
    private String nacimento;
    private String estado;
    private String formacao;
    private String departamento;

    public Estagiario() {
    }

    public Estagiario( String apelido, String nomes, String contacto, String nacimento, String estado, String formacao, String departamento) {
      
        this.apelido = apelido;
        this.nomes = nomes;
        this.contacto = contacto;
        this.nacimento = nacimento;
        this.estado = estado;
        this.formacao = formacao;
        this.departamento = departamento;
    }

    public int getId_estagiario() {
        return id_estagiario;
    }

    public void setId_estagiario(int id_estagiario) {
        this.id_estagiario = id_estagiario;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNomes() {
        return nomes;
    }

    public void setNomes(String nomes) {
        this.nomes = nomes;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getNacimento() {
        return nacimento;
    }

    public void setNacimento(String nacimento) {
        this.nacimento = nacimento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
    
}
