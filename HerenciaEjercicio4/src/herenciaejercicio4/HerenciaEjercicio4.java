package herenciaejercicio4;

import Entities.Circulo;
import Entities.Rectangulo;
import java.util.Scanner;

public class HerenciaEjercicio4 {

    /**
     * @param args the command line arguments
     *
     * Desarrollar el ejercicio para que las formas implementen los métodos de
     * la interfaz y se calcule el área y el perímetro de los dos. En el main se
     * crearán las formas y se mostrará el resultado final. Área circulo: PI *
     * radio ^ 2 / Perímetro circulo: PI * diámetro. Área rectángulo: base *
     * altura / Perímetro rectángulo: (base + altura) * 2.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Circulo nc = new Circulo();
        Rectangulo nr = new Rectangulo();

        System.out.println("¿Qué desea calcular?");
        System.out.println("1. Circulo");
        System.out.println("2. Rectangulo");
        int opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                nc.crearCirculo();
                break;
            case 2:
                nr.crearRectangulo();
                break;
            default:
                System.out.println("Opción no disponible.2");
        }

    }

}
