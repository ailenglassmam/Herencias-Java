package HerenciaEjercicio2;

import Entities.Electrodomestico;
import Entities.Lavadora;
import Entities.Televisor;
import java.util.ArrayList;

public class HerenciaEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Electrodomestico> listadoElectrodomesticos = new ArrayList<>();
        Lavadora nl = new Lavadora(35, "negro", 'A', 78);
        Televisor nt = new Televisor(45, true, "negro", 'A', 25);
        Lavadora nl2 = new Lavadora(32, "blanco", 'C', 60);
        Televisor nt2 = new Televisor(65, true, "blanco", 'B', 35);

        listadoElectrodomesticos.add(nl);
        listadoElectrodomesticos.add(nt);
        listadoElectrodomesticos.add(nt2);
        listadoElectrodomesticos.add(nl2);

        double precioFinalTotal = 0;

        for (Electrodomestico listadoElectrodomestico : listadoElectrodomesticos) {
            listadoElectrodomestico.crearTicketElectrodomestico();
            precioFinalTotal += listadoElectrodomestico.precioFinal();
        }

        System.out.println("Precio Final Total: " + precioFinalTotal);

    }

}
