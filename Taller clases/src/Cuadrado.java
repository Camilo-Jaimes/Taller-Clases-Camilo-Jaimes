public class Cuadrado {

    private double lado;

    public Cuadrado(){

    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double area (double lado){
        double resultado = lado * lado;
        return resultado;
    }

    public double perimetro (double lado){
        double resultado = 4 * lado;
        return resultado;
    }

    @Override
    public String toString() {
        return "Cuadradro [lado=" + lado + "]";
    }
}
