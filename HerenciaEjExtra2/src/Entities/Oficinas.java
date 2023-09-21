package Entities;

import java.util.Scanner;

/**
Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
 */
public class Oficinas extends Edificio{
    
    private Integer numero_oficinas;
    private Integer cantidad_personas_por_oficina;
    private Integer numero_pisos;

    public Oficinas() {
    }

    public Oficinas(Integer numero_oficinas, Integer cantidad_personas_por_oficina, Integer numero_pisos, Integer ancho, Integer alto, Integer largo) {
        super(ancho, alto, largo);
        this.numero_oficinas = numero_oficinas;
        this.cantidad_personas_por_oficina = cantidad_personas_por_oficina;
        this.numero_pisos = numero_pisos;
    }

    public Integer getNumero_oficinas() {
        return numero_oficinas;
    }

    public void setNumero_oficinas(Integer numero_oficinas) {
        this.numero_oficinas = numero_oficinas;
    }

    public Integer getCantidad_personas_por_oficina() {
        return cantidad_personas_por_oficina;
    }

    public void setCantidad_personas_por_oficina(Integer cantidad_personas_por_oficina) {
        this.cantidad_personas_por_oficina = cantidad_personas_por_oficina;
    }

    public Integer getNumero_pisos() {
        return numero_pisos;
    }

    public void setNumero_pisos(Integer numero_pisos) {
        this.numero_pisos = numero_pisos;
    }

    @Override
    public String toString() {
        return "Oficinas:" + "> Numero de oficinas: " + numero_oficinas + "> Cantidad de personas por oficina: " + cantidad_personas_por_oficina + ", > Numero de pisos: " + numero_pisos;
    }
   
    @Override
    public void calcularSuperficie() {
        Integer superficie = largo * ancho;
        System.out.println("La superficie total del edificio de oficinas es: " + superficie);
    }

    @Override
    public void calcularVolumen() {
        Integer volumen = largo * ancho * alto;
        System.out.println("El volumen total del edificio de oficinas es: " + volumen);
    }
    
//    De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
//usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
//(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
//cuantas personas entrarían en un piso y cuantas en todo el edificio.
    
    public void crearEdificioOficina() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los datos solicitados");
        System.out.println("Cantidad de personas por oficina: ");
        this.setCantidad_personas_por_oficina(leer.nextInt());
        System.out.println("Cantidad de oficinas: ");
        this.setNumero_oficinas(leer.nextInt());
        System.out.println("Número de pisos: ");
        this.setNumero_pisos(leer.nextInt());
    }
    
    public void cantPersonas() {
        System.out.println("Cada piso tiene una capacidad para: " + this.getCantidad_personas_por_oficina());
        Integer capacidad_total = this.getCantidad_personas_por_oficina() * this.getNumero_oficinas() * this.getNumero_pisos();
        System.out.println("El edificio de oficinas tienen una capacidad total de: " + capacidad_total);
    }
    
}
