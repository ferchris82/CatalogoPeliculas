
package com.peliculas.servicio;

public interface ICatalogoPeliculas {
    
    String NOMBRE_RECURSO = "peliculas.txt";
    
    void agregarPelicula(String nombrePelicula);
    
    void listarPeliculas();
    
    void buscaarPelicula(String buscar);
    
    void iniciarCatalogoPeliculas();
}
