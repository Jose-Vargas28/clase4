import static java.lang.Math.sqrt;

public class operaciones {

    private double n1;
    private double n2;

    public operaciones() {

    }

    public operaciones(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    private double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    private double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    //metodo personalizado

    public void imprimirDatos() {
        System.out.println("N1: " + getN1());
        System.out.println("N2: " + getN2());
    }

    public Double sumatoria() {
        return n1 + n2;
    }

    public void sumaeimpresion() {
        Double suma = n1 + n2;
        System.out.println(suma);
    }

    public void raiz() {
        System.out.println(sqrt(n1));
        System.out.println(sqrt(n2));
    }

    public void restaimpresion() {
        Double resta = n1 - n2;
        System.out.println(resta);
    }

}