package Entities;

import java.util.Scanner;

public class Televisor extends Electrodomestico {

    protected Integer resolucion;
    protected boolean sintonizador;

    public Televisor() {
        super();
    }

    public Televisor(Integer resolucion, boolean sintonizador, String color, char consumoEnergetico, Integer peso) {
        super(color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }
    
    

    public Televisor(Integer resolucion, boolean sintonizador, String modelo, Integer precio, String color, char consumoEnergetico, Integer peso) {
        super(modelo, precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    public void crearTelevisor() {
        this.crearElectrodomestico();
        Scanner leer = new Scanner(System.in);
        System.out.print("Resolución:");
        this.setResolucion(leer.nextInt());
        System.out.print("Sintonizador TDT:");
        this.setSintonizador(leer.nextBoolean());
    }

    @Override
    public int precioFinal() {
        // Llama al método de la clase madre para calcular el precio base
        super.precioFinal();
        int precioActual = this.getPrecio();

        // Verifica si la carga de la lavadora es mayor que 30 kg
        if (this.getResolucion() > 40 && this.isSintonizador()) {
            return (precioActual + (precioActual * 30) / 100) + 500;
        } else if (this.isSintonizador()) {
            return precioActual + 500;
        } else {
        return precioActual;
    }
    }
}
