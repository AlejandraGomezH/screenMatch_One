public class Pelicula {
    String nombre;
    int fechaLanzamiento;
    int duracionEnminutos;
    boolean incluidoEnElPlan;
    double sumaDeLasEvaluaciones;
    int totalEvaluaciones;

    void muestraFichaTecnica(){ //void no nos retorna nada, se usa el modo imperativo en el verbo de la función.
        System.out.println("El nombre de la película es "+ nombre);
        System.out.println("El lanzamiento es: "+  fechaLanzamiento);
        System.out.println("Duración en minutos : "+  duracionEnminutos);
    }

    void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalEvaluaciones ++;
    }

    double calcularMedia(){//ponemos double porque nos va a retornar un tipo double.
        return sumaDeLasEvaluaciones / totalEvaluaciones;
    }
}
