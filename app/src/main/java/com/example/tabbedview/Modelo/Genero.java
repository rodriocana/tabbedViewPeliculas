package com.example.tabbedview.Modelo;

public class Genero {

    int id_genero;
    String nombre_genero;

    String BackgroundImagen;


    public Genero(int id_genero, String nombre_genero, String backgroundImagen) {
        this.id_genero = id_genero;
        this.nombre_genero = nombre_genero;
        BackgroundImagen = backgroundImagen;
    }

    public int getId_genero() {
        return id_genero;
    }

    public void setId_genero(int id_genero) {
        this.id_genero = id_genero;
    }

    public String getNombre_genero() {
        return nombre_genero;
    }

    public void setNombre_genero(String nombre_genero) {
        this.nombre_genero = nombre_genero;
    }

    public String getBackgroundImagen() {
        return BackgroundImagen;
    }

    public void setBackgroundImagen(String backgroundImagen) {
        BackgroundImagen = backgroundImagen;
    }
}
