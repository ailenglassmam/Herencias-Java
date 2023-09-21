package Entities;

/*
Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
*/

public class Polideportivo extends Edificio {
    
    private String nombre;
    private String tipo_instalacion;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, String tipo_instalacion, Integer ancho, Integer alto, Integer largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipo_instalacion = tipo_instalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_instalacion() {
        return tipo_instalacion;
    }

    public void setTipo_instalacion(String tipo_instalacion) {
        this.tipo_instalacion = tipo_instalacion;
    }

    @Override
    public String toString() {
        return "Polideportivo: " + "> Nombre: " + nombre + ", > Tipo de instalacion: " + tipo_instalacion;
    }
    
   
    @Override
    public void calcularSuperficie() {
        Integer superficie = largo * ancho;
        System.out.println("La superficie total del polideportivo es: " + superficie);
    }

    @Override
    public void calcularVolumen() {
        Integer volumen = largo * ancho * alto;
        System.out.println("El volumen total del polideportivo es: " + volumen);
    }
    
}
