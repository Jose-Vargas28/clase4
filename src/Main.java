import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* System.out.println("Ingrese el nombre del curso: ");
        String nombreDelCurso = scanner.nextLine();
        System.out.println("Ingrese el periodo del curso: ");
        String periodo = scanner.nextLine();
        System.out.println("Ingrese el año del curso: ");
        int año = scanner.nextInt();
        System.out.println("Ingrese el promedio del curso: ");
        double promedio = scanner.nextDouble();

        LibroCalificaciones miLibroCalificaciones =
                new LibroCalificaciones(nombreDelCurso, periodo, anio, promedio);
                miLibroCalificaciones.*/
/*
miLibroCalificaciones.establecerNombreDelCurso(nombreDelCurso);
miLibroCalificaciones.establecerPeriodo(periodo);
miLibroCalificaciones.establecerAño(año);
miLibroCalificaciones.establecerPromedio(promedio);


 miLibroCalificaciones.mostrarMensaje();
        LibroCalificaciones miLibro2 = new LibroCalificaciones();

        miLibro2.metodo1();
*/
        System.out.println("CALCULADORA");
        System.out.println("Ingrese el número 1: ");
        double n1 = scanner.nextDouble();
        System.out.println("Ingrese el número 2: ");
        double n2 = scanner.nextDouble();
        operaciones operaciones = new operaciones(n1,n2);
        operaciones.imprimirDatos();

        System.out.println(operaciones.sumatoria());
        operaciones.sumaeimpresion();
        operaciones.restaimpresion();
        operaciones.raiz();
    }
}