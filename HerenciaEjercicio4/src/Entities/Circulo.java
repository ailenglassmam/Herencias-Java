package Entities;

import Interfaces.CalculosFormas;
import java.util.Scanner;

public class Circulo extends Formas implements CalculosFormas {

    public final double PI = 3.14; // coloco que es final porque es una CONSTANTE que no se va a modificar nunca

    public Circulo() {
    }

    public Circulo(int a, int b) {
        super(a, b);
    }
    
        public void crearCirculo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor del radio: ");
        this.setA(leer.nextInt());
        
        this.calcularArea(a, b);
        this.calcularPerimetro(a, b);
    }

    @Override
    public void calcularArea(int a, int b) {
        //        Área circulo: PI * radio ^ 2 
        double areaCirculo = Math.pow(PI * a, 2);

        System.out.println("El área total final del circulo es: " + areaCirculo);
    }

    @Override
    public void calcularPerimetro(int a, int b) {
        //        Perímetro circulo: PI * diámetro. donde "a" va a ser el radio
        double perimetroCirculo = PI * (a * 2);

        System.out.println("El perímetro total final del circulo es: " + perimetroCirculo);
    }

}
