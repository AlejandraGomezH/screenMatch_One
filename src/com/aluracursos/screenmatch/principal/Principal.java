package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto", 2021); //com.aluracursos.screenmatch.modelos.Pelicula: es un tipo de dato, despues le damos el nombre a la variable, nuevo e instanciamos pelicula() Que significa una instacncia, el compilador crea un espacio de memoria para diferentes atributos.
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        System.out.println("El total de evaluaciones es: " + miPelicula.getTotalEvaluaciones());
        System.out.println("La media de las evaluaciones es:" + miPelicula.calcularMedia());
        //System.out.println("El nombre de la pelicula es: " + miPelicula.getNombre());

        Serie serie = new Serie("DEXTER", 2001);

        serie.setTemporadas(12);
        serie.setEpisodiosPorTemporada(5);
        serie.setMinutosPorEpisodio(12);
        serie.muestraFichaTecnica();
        System.out.println("La serie dura: " + serie.getDuracionEnMinutos());


        Pelicula peliculaDos = new Pelicula("VENOM", 2025);
        peliculaDos.setDuracionEnMinutos(120);


        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();

        calculadora.incluye(miPelicula);
        calculadora.incluye(serie);
        calculadora.incluye(peliculaDos);
        System.out.println("Necesitas " + calculadora.getTiempoTotal() + " minutos para ver tus series");

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();

        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("Episodio 1");
        episodio.setSerie(serie);
        episodio.setTotalVisualizaciones(80);

        filtroRecomendacion.filtra(episodio);

        var peliculaDeAle = new Pelicula("El señor de los anillos",2001); //var infiere el tipo de dato de la derecha es decir del objeto.

        peliculaDeAle.setDuracionEnMinutos(180);
        peliculaDeAle.setFechaLanzamiento(2002);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>(); //<Tipo de dato> todos los objetos dentro serán de tipo Pelicula
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(peliculaDos);
        listaDePeliculas.add(peliculaDeAle);

        System.out.println("Tamaño de la Lista " + listaDePeliculas.size());
        System.out.println("La primera pelicula es " + listaDePeliculas.get(0).getNombre());

        System.out.println(listaDePeliculas);

        System.out.println("toString de la pelicula: " + listaDePeliculas.get(0).toString());

        //otraPelicula.muestraFichaTecnica();
        // System.out.println(otraPelicula); //asi se muestra el lugar de memoria donde está apuntando el objeto com.aluracursos.screenmatch.modelos.Pelicula@3cda1055
    }
}
