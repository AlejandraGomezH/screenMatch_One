import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula(); //com.aluracursos.screenmatch.modelos.Pelicula: es un tipo de dato, despues le damos el nombre a la variable, nuevo e instanciamos pelicula() Que significa una instacncia, el compilador crea un espacio de memoria para diferentes atributos.
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        System.out.println("El total de evaluaciones es: " + miPelicula.getTotalEvaluaciones());
        System.out.println("La media de las evaluaciones es:" + miPelicula.calcularMedia());
        System.out.println("El nombre de la pelicula es: " + miPelicula.getNombre());

        Serie serie = new Serie();

        serie.setNombre("DEXTER");
        serie.setTemporadas(12);
        serie.setEpisodiosPorTemporada(5);
        serie.setMinutosPorEpisodio(12);
        serie.muestraFichaTecnica();
        System.out.println("La serie dura: " + serie.getDuracionEnMinutos());


        Pelicula peliculaDos = new Pelicula();
        peliculaDos.setNombre("VENOM");
        peliculaDos.setFechaLanzamiento(2024);
        peliculaDos.setDuracionEnMinutos(120);


        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();

        calculadora.incluye(miPelicula);
        calculadora.incluye(serie);
        calculadora.incluye(peliculaDos);
        System.out.println("Necesitas " + calculadora.getTiempoTotal() + " minutos para ver tus series");






        //otraPelicula.muestraFichaTecnica();
        // System.out.println(otraPelicula); //asi se muestra el lugar de memoria donde está apuntando el objeto com.aluracursos.screenmatch.modelos.Pelicula@3cda1055
    }
}
