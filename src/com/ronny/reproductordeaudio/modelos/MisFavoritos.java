package com.ronny.reproductordeaudio.modelos;

public class MisFavoritos {
    public  void adicione (Audio audio){
        if (audio.getClasificacion() >=8){
            System.out.println("Mas populares del momento: " + audio.getTitulo());
        } else {
            System.out.println("Recomendados para ti: " + audio.getTitulo());
        }
    }
}
