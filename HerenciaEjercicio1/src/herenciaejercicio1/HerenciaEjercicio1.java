package herenciaejercicio1;

import Entities.Animal;
import Entities.Caballo;
import Entities.Gato;
import Entities.Perro;

public class HerenciaEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perro1 = new Animal("Rocco", "Carnívoro", 5, "Mestizo");
        perro1.alimentarse();
        
        Perro perro2 = new Perro("Loretha", "Carnívoro", 10, "Terranova");
        perro2.alimentarse();
        
        Gato gato1 = new Gato("Sr. Whiskas", "Carnívoro", 5, "Gris");
        gato1.alimentarse();
        
        Caballo caballo1 = new Caballo("Poseidón", "Hervívoro", 5, "Percherón");
        caballo1.alimentarse();
    }
    
}
