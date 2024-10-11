package com.ronny.reproductordeaudio.principal;

import com.ronny.reproductordeaudio.modelos.Cancion;
import com.ronny.reproductordeaudio.modelos.MisFavoritos;
import com.ronny.reproductordeaudio.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion billieJean = new Cancion();
        billieJean.setTitulo("billie jean");
        billieJean.setCantante("Michael Jackson");
        billieJean.setDuracion(4);
        billieJean.setGenero("Pop");

        Podcast podcast1 = new Podcast();
        podcast1.setPresentador("Gabriela Aguiar");
        podcast1.setTitulo("Cafe.tech");

        //bucle canciones
        for (int i = 0; i < 6000; i++) {
            billieJean.meGusta();
        }

        for (int i = 0; i < 5000; i++) {
            billieJean.reproducciones();
        }

        //bucle podcast

        for (int i = 0; i < 250; i++) {
            podcast1.meGusta();
        }

        for (int i = 0; i < 5000; i++) {
            podcast1.reproducciones();
        }

        System.out.println("Reproducciones de la cancion Billie Jean: " + billieJean.getTotalDeReproducciones());
        System.out.println("Total de Me gusta: " + billieJean.getTotalMeGusta());

        System.out.println("Reproducciones del Podcast1: " + podcast1.getTotalDeReproducciones());
        System.out.println("Total de Me gusta: " + podcast1.getTotalMeGusta());


        //Favoritos.
        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicione(billieJean);
        favoritos.adicione(podcast1);




    }
}
