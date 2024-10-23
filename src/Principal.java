public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula(); //Pelicula: es un tipo de dato, despues le damos el nombre a la variable, nuevo e instanciamos pelicula() Que significa una instacncia, el compilador crea un espacio de memoria para diferentes atributos.
        miPelicula.nombre = "Encanto";
        miPelicula.fechaLanzamiento = 2021;
        miPelicula.duracionEnminutos = 120;

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);


        System.out.println(miPelicula.sumaDeLasEvaluaciones);
        System.out.println(miPelicula.totalEvaluaciones);
        System.out.println(miPelicula.calcularMedia());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "Matrix";
        otraPelicula.fechaLanzamiento = 1593;

        //otraPelicula.muestraFichaTecnica();
        // System.out.println(otraPelicula); //asi se muestra el lugar de memoria donde está apuntando el objeto Pelicula@3cda1055
    }
}
