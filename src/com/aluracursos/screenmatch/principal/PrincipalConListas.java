package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evalua(9);
        Pelicula peliculaDos = new Pelicula("VENOM", 2025);
        peliculaDos.evalua(10);
        var peliculaDeAle = new Pelicula("El señor de los anillos",2001);
        peliculaDeAle.evalua(7);
        Serie serie = new Serie("DEXTER", 2001);
        serie.evalua(5);

        ArrayList<Titulo> lista = new ArrayList<>(); //<Tipo de dato> todos los objetos dentro serán de tipo Pelicula
        lista.add(miPelicula);
        lista.add(peliculaDos);
        lista.add(peliculaDeAle);
        lista.add(serie);

        // Como llamamos a cada elemento de la lista:lo que queremos iterar
        for (Titulo item: lista) {
            System.out.println(item.getNombre());
            if (item instanceof Pelicula){
                Pelicula pelicula = (Pelicula) item;
                System.out.println(pelicula.getClasificacion());
            }
        }

    }
}
