
package com.peliculas.domain;

public class Pelicula {
    //Atributo con el concepto de Java Bean(atributo privado y constructor vacío)
     private String nombre;

    public Pelicula() {
    }

    public Pelicula(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
     
     
}
