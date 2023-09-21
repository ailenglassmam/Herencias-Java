package herenciaejextra2;

import Entities.Edificio;
import Entities.Oficinas;
import Entities.Polideportivo;
import java.util.ArrayList;

public class HerenciaEjExtra2 {

    /**
     * Por último, en el main vamos a crear un ArrayList de tipo Edificio. El
     * ArrayList debe contener dos polideportivos y dos edificios de oficinas.
     * Luego, recorrer este array y ejecutar los métodos calcularSuperficie y
     * calcularVolumen en cada Edificio. Se deberá mostrar la superficie y el
     * volumen de cada edificio. Además de esto, para la clase Polideportivo nos
     * interesa saber cuántos polideportivos son techados y cuantos abiertos. Y
     * para la clase EdificioDeOficinas deberemos llamar al método
     * cantPersonas() y mostrar los resultados de cada edificio de oficinas.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
//        dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
//        métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
//        superficie y el volumen de cada edificio.
        ArrayList<Edificio> listadoEdificios = new ArrayList<>();

        Polideportivo np1 = new Polideportivo("Barrio Luz", "Techado", 15, 30, 20);
        Polideportivo np2 = new Polideportivo("La Fortaleza", "Abierto", 25, 50, 30);

        Oficinas no1 = new Oficinas(5, 20, 5, 30, 30, 25);
        Oficinas no2 = new Oficinas(10, 50, 10, 30, 30, 250);

        listadoEdificios.add(np1);
        listadoEdificios.add(np2);
        listadoEdificios.add(no1);
        listadoEdificios.add(no2);
        Integer id = 1;

//        int techados = 0;
//        int abiertos = 0;
//
//        for (Edificio listadoEdificio : listadoEdificios) {
//            System.out.println("Edificio " + id);
//            listadoEdificio.calcularSuperficie();
//            listadoEdificio.calcularVolumen();
//
//            if (listadoEdificio instanceof Polideportivo) {
//                ((Polideportivo) listadoEdificio).getTipo_instalacion().equalsIgnoreCase("techado");
//                Polideportivo poli = (Polideportivo) listadoEdificio;
//                if (poli.getTipo_instalacion().equalsIgnoreCase("techado")) {
//                    techados++;
//                } else {
//                    abiertos++;
//                }
//            }
//
//            if (listadoEdificio instanceof Oficinas) {
//                Oficinas oficina = (Oficinas) listadoEdificio;
//                int cantPersonas = oficina.cantPersonas();
//                System.out.println("Cantidad de personas en el edificio de oficinas: " + cantPersonas);
//            }
//
//            id += 1;
//        }
//
//        System.out.println("Polideportivos techados: " + techados);
//        System.out.println("Polideportivos abiertos: " + abiertos);
//    }

        for (Edificio listadoEdificio : listadoEdificios) {
            System.out.println("Edificio " + id);
            listadoEdificio.calcularSuperficie();
            listadoEdificio.calcularVolumen();
            
            id += 1;
        }
//        Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
//        techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
//        cantPersonas() y mostrar los resultados de cada edificio de oficinas.
}

}
