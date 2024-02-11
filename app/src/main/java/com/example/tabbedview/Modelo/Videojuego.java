package com.example.tabbedview.Modelo;

public class Videojuego {

    String titulo;
    String empresa;

    String BackgroundImagen;

    public Videojuego(String titulo, String empresa, String backgroundImagen) {
        this.titulo = titulo;
        this.empresa = empresa;
        BackgroundImagen = backgroundImagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getBackgroundImagen() {
        return BackgroundImagen;
    }

    public void setBackgroundImagen(String backgroundImagen) {
        BackgroundImagen = backgroundImagen;
    }
}
