package com.example.tabbedview.Modelo;

public class Serie {

    String titulo;
    String plataforma;

    String BackgroundImagen;


    public Serie(String titulo, String plataforma, String backgroundImagen) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        BackgroundImagen = backgroundImagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getBackgroundImagen() {
        return BackgroundImagen;
    }

    public void setBackgroundImagen(String backgroundImagen) {
        BackgroundImagen = backgroundImagen;
    }
}
