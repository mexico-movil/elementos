/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jc.campitos;

/**
 *
 * @author campitos
 */
public class Opcion {
    private String titulo;
    private boolean opcion;

    public Opcion(String titulo, boolean opcion) {
        this.titulo = titulo;
        this.opcion = opcion;
    }

    public boolean isOpcion() {
        return opcion;
    }

    public void setOpcion(boolean opcion) {
        this.opcion = opcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}
