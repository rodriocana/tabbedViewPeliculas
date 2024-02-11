package com.example.tabbedview.Modelo;

public class Pelicula {

    String titulo;
    String director;

    String BackgroundImagen;

    public Pelicula(String titulo, String director, String backgroundImagen) {
        this.titulo = titulo;
        this.director = director;
        this.BackgroundImagen = backgroundImagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getBackgroundImagen() {
        return BackgroundImagen;
    }

    public void setBackgroundImagen(String backgroundImagen) {
        BackgroundImagen = backgroundImagen;
    }
}
