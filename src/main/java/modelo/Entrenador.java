/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author Edgar
 */
public class Entrenador implements Serializable {
    
    private int idEntrenador;
    private String nombreEntrenador;
    private int edad;
    private boolean titulo;

    public Entrenador() {
    }

    public Entrenador(String nombreEntrenador, int edad, boolean titulo) {
        this.nombreEntrenador = nombreEntrenador;
        this.edad = edad;
        this.titulo = titulo;
    }

    public int getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public void setNombreEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isTitulo() {
        return titulo;
    }

    public void setTitulo(boolean titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Entrenador{" + "idEntrenador=" + idEntrenador + ", nombreEntrenador=" + nombreEntrenador + ", edad=" + edad + ", titulo=" + titulo + '}';
    }
    
    
    
}
