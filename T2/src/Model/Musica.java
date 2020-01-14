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
public class Musica {
    private int codigo;
    private String estilo;
    private String titulo; 
    private  String generoMusical;
    private int gravadora_codigo;
    private String musico_codigo;

    public Musica(int codigo, String estilo, String titulo, String generoMusical, int gravadora_codigo, String musico_codigo) {
        this.codigo = codigo;
        this.estilo = estilo;
        this.titulo = titulo;
        this.generoMusical = generoMusical;
        this.gravadora_codigo = gravadora_codigo;
        this.musico_codigo = musico_codigo;
    }

    public Musica() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public int getGravadora_codigo() {
        return gravadora_codigo;
    }

    public void setGravadora_codigo(int gravadora_codigo) {
        this.gravadora_codigo = gravadora_codigo;
    }

    public String getMusico_codigo() {
        return musico_codigo;
    }

    public void setMusico_codigo(String musico_codigo) {
        this.musico_codigo = musico_codigo;
    }
    
    
}
