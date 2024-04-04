public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado1 = new Cuadrado(5.0);
            System.out.println("El area del cuadrado es: " + cuadrado1.area(cuadrado1.getLado()));
            System.out.println("El perimetro del cuadrado es: " + cuadrado1.perimetro(cuadrado1.getLado()));

        Cuadrado cuadrado2 = new Cuadrado(10.0);
            System.out.println("El area del cuadrado es: " + cuadrado2.area(cuadrado2.getLado()));
            System.out.println("El perimetro del cuadrado es: " + cuadrado2.perimetro(cuadrado2.getLado()));

        Circulo circulo1 = new Circulo(3.9);
            System.out.println("El area del circulo es: " + circulo1.areaCir(circulo1.getRadio()));
            System.out.println("El perimetro del circulo es: " + circulo1.perimetroCir(circulo1.getRadio()));

        Circulo circulo2 = new Circulo(4);
            System.out.println("El area del circulo es: " + circulo2.areaCir(circulo2.getRadio()));
            System.out.println("El perimetro del circulo es: " + circulo2.perimetroCir(circulo2.getRadio()));

        Triangulo triangulo1 = new Triangulo();
            System.out.println("El area del circulo es: " + triangulo1.areaTri(triangulo1.getAltura(), triangulo1.getBase()));
            System.out.println("El perimetro del circulo es: " + triangulo1.perimetroTri(triangulo1.getAltura(), triangulo1.getBase()));
            System.out.println("La hipotenusa del triángulo es: " + triangulo1.hipotenusaTri(triangulo1.getAltura(), triangulo1.getBase()));
    
        Triangulo triangulo2 = new Triangulo();
            System.out.println("El area del circulo es: " + triangulo2.areaTri(triangulo2.getAltura(), triangulo2.getBase()));
            System.out.println("El perimetro del circulo es: " + triangulo2.perimetroTri(triangulo2.getAltura(), triangulo2.getBase()));
            System.out.println("La hipotenusa del triángulo es: " + triangulo2.hipotenusaTri(triangulo2.getAltura(), triangulo2.getBase()));
        }
}


