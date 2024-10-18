package org.example;

public class LibroCalificaciones {
    private String nombreDelCurso;//atributo
    private String periodo;
    private int anio;
    private Double promedio;

    //constructor
    public LibroCalificaciones(String nombre, String periodo, int anio, Double promedio) {
        this.nombreDelCurso = nombre;
        this.periodo = periodo;
        this.anio = anio;
        this.promedio = promedio;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    //setter
    public void establecerNombreDelCurso(String nombre) {
        this.nombreDelCurso = nombre;
    }
    //getter
    public String obtenerNombreDelCurso() {
        return nombreDelCurso;
    }

    public void mostrarMensaje(){
        System.out.println(nombreDelCurso);
        System.out.println(periodo);
        System.out.println(anio);
        System.out.println(promedio);

        System.out.println("//////");
        System.out.printf("Los datos son: %s, %s, %d,%.2f \n", nombreDelCurso, periodo,anio,promedio);

    }
public void metodo1(){}
public void metodo2(){}
}