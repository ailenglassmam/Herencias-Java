package Entities;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {

    protected int carga;

    public Lavadora() {
        super();
        this.setPrecio(1000);
    }

    public Lavadora(int carga, String color, char consumoEnergetico, Integer peso) {
        super(color, consumoEnergetico, peso);
        this.carga = carga;
    }
    
    

    public Lavadora(int carga, String modelo, Integer precio, String color, char consumoEnergetico, Integer peso) {
        super(modelo, precio, color, consumoEnergetico, peso); //con super heredo todos los atributos de la clase madre
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
        this.crearElectrodomestico();
        Scanner leer = new Scanner(System.in);
        
        //en el método de crearLavadora, DIVIDO responsabilidades y es donde voy
        //a solicitar la información necesaria para el calculo del método de precio
        System.out.print("Carga:");
        this.setCarga(leer.nextInt());
    }
    
        // Sobreescribir precioFinal para agregar funcionalidad adicional
    //SI O SI tienen que ser IGUALES para lograr la sobreescritura
    @Override
public int precioFinal() {
    // Llama al método de la clase madre para calcular el precio base
    super.precioFinal();
    int precioActual = this.getPrecio();
    
    // Verifica si la carga de la lavadora es mayor que 30 kg
    if (this.getCarga() > 30) {
        return precioActual + 500;
        } else {
        return precioActual;
        }
}
    
}
