/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author Luis
 */
public class Categoria implements Serializable {
    private int codigo;
    private String nombre;
    private String autor;

    public Categoria() {
        this.codigo=0;
        this.nombre="";
        this.autor="";
    }

    public Categoria(int codigo, String nombre, String autor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.autor = autor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
    
    
    
}
