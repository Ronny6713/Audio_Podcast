package com.ronny.reproductordeaudio.modelos;

public class Audio {

    private String titulo;
    private int duracion;
    private int totalDeReproducciones;
    private int totalMeGusta;
    private int clasificacion;

    public void meGusta(){
        this.totalMeGusta++;
    }

    public  void reproducciones(){
        this.totalDeReproducciones ++;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public void setTotalDeReproducciones(int totalDeReproducciones) {
        this.totalDeReproducciones = totalDeReproducciones;
    }

    public int getTotalMeGusta() {
        return totalMeGusta;
    }

    public void setTotalMeGusta(int totalMeGusta) {
        this.totalMeGusta = totalMeGusta;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}