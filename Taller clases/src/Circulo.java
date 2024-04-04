public class Circulo {
    private double radio;

    public Circulo() {
        
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double areaCir (double radio){
        return Math.PI * radio * radio;
    }

    public double perimetroCir (double radio){
        return Math.PI * 2 * radio;
    }

    @Override
    public String toString() {
        return "Circulo [radio=" + radio + "]";
    }

    
}
