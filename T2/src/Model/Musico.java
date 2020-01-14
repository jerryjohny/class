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
public class Musico {
    private int codigo;
    private String nomes;
    private String apelido;
    private String estiloMusical;
    private int NumeroDeMusicas;

    public Musico(int codigo, String nomes, String apelido, String estiloMusical, int NumeroDeMusicas) {
        this.codigo = codigo;
        this.nomes = nomes;
        this.apelido = apelido;
        this.estiloMusical = estiloMusical;
        this.NumeroDeMusicas = NumeroDeMusicas;
    }
     public Musico( String nomes, String apelido, String estiloMusical, int NumeroDeMusicas) {
        
        this.nomes = nomes;
        this.apelido = apelido;
        this.estiloMusical = estiloMusical;
        this.NumeroDeMusicas = NumeroDeMusicas;
    }

    public Musico() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomes() {
        return nomes;
    }

    public void setNomes(String nomes) {
        this.nomes = nomes;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEstiloMusical() {
        return estiloMusical;
    }

    public void setEstiloMusical(String estiloMusicsl) {
        this.estiloMusical = estiloMusicsl;
    }

    public int getNumeroDeMusicas() {
        return NumeroDeMusicas;
    }

    public void setNumeroDeMusicas(int NumeroDeMusicas) {
        this.NumeroDeMusicas = NumeroDeMusicas;
    }
    
    
    
}
