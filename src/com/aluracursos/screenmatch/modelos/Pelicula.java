package com.aluracursos.screenmatch.modelos;

public class Pelicula {
    private String nombre;
    private int fechaLanzamiento;
    private int duracionEnminutos;
    boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalEvaluaciones;

    public String getNombre() {
        return nombre;
    }

    public int getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public int getDuracionEnminutos() {
        return duracionEnminutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre; // this indica que es el atributo de nuestra clase el que declaramos arriba.
    }

    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public void setDuracionEnminutos(int duracionEnminutos) {
        this.duracionEnminutos = duracionEnminutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public int getTotalEvaluaciones(){
        return totalEvaluaciones;
    }

    public void muestraFichaTecnica(){ //void no nos retorna nada, se usa el modo imperativo en el verbo de la función.
        System.out.println("El nombre de la película es "+ nombre);
        System.out.println("El lanzamiento es: "+  fechaLanzamiento);
        System.out.println("Duración en minutos : "+  duracionEnminutos);
    }

    public void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalEvaluaciones ++;
    }

    public double calcularMedia(){//ponemos double porque nos va a retornar un tipo double.

        return sumaDeLasEvaluaciones / totalEvaluaciones;
    }
}
