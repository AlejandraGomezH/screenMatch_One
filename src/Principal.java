import com.aluracursos.screenmatch.modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula(); //com.aluracursos.screenmatch.modelos.Pelicula: es un tipo de dato, despues le damos el nombre a la variable, nuevo e instanciamos pelicula() Que significa una instacncia, el compilador crea un espacio de memoria para diferentes atributos.
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaLanzamiento(2021);
        miPelicula.setDuracionEnminutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        System.out.println(miPelicula.getTotalEvaluaciones());
        System.out.println(miPelicula.calcularMedia());
        System.out.println(miPelicula.getNombre());


        //otraPelicula.muestraFichaTecnica();
        // System.out.println(otraPelicula); //asi se muestra el lugar de memoria donde está apuntando el objeto com.aluracursos.screenmatch.modelos.Pelicula@3cda1055
    }
}
