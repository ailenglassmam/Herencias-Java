package Entities;

/**
     * Crear una superclase llamada Edificio con los siguientes atributos:
     * ancho, alto y largo.
 */
public abstract class Edificio {
    protected Integer ancho;
    protected Integer alto;
    protected Integer largo;

    public Edificio() {
    }

    public Edificio(Integer ancho, Integer alto, Integer largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    public Integer getLargo() {
        return largo;
    }

    public void setLargo(Integer largo) {
        this.largo = largo;
    }
    
//    La clase edificio tendrá como métodos: 
//     • Método calcularSuperficie(): calcula la superficie del edificio. 
//     • Método calcularVolumen(): calcula el volumen del edifico. 
//    Estos métodos serán abstractos
    
public abstract void calcularSuperficie();
public abstract void calcularVolumen();
    
    @Override
    public String toString() {
        return "Medidas edificio: " + "ancho = " + ancho + ", alto = " + alto + ", largo = " + largo;
    }
    
    
}
