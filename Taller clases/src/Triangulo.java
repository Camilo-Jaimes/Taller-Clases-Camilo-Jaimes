public class Triangulo {
    private double altura;
    private double base;

    public Triangulo(){

    }

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double areaTri (double altura, double base){
        double resultado = (base * altura)/2;
        return resultado;
    }

    public double perimetroTri (double altura, double base){
        double resultado =(altura * 2) + base;
        return resultado;
    }
    public double hipotenusaTri (double altura, double base){
        double resultado = Math.sqrt(Math.pow(altura, base));
        return resultado;
    }
}
