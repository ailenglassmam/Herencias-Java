package Entities;

import Interfaces.CalculosFormas;
import java.util.Scanner;

public class Rectangulo extends Formas implements CalculosFormas {

    public Rectangulo() {
    }

    public Rectangulo(int a, int b) {
        super(a, b);
    }
    
            public void crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de la base: ");
        this.setA(leer.nextInt());
        System.out.println("Ingrese el valor de la altura: ");
        this.setB(leer.nextInt());
        
        this.calcularArea(a, b);
        this.calcularPerimetro(a, b);
    }

    @Override
    public void calcularArea(int a, int b) {
//        Área rectángulo: base * altura 
        int areaRectangulo = a * b;
        
        System.out.println("El área total final del rectángulo es: " + areaRectangulo);
    }

    @Override
    public void calcularPerimetro(int a, int b) {
        //        Perímetro rectángulo: (base + altura) * 2.
        int perimetroRectangulo = (a + b) * 2;
        
        System.out.println("El perímetro total final del rectángulo es: " + perimetroRectangulo);
    }

    
}