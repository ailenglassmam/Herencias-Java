/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo. Realizar un programa en el que se representen todas las relaciones
descriptas.

 */
public class Residencia extends Extrahotelero {
    
    
    private Integer cantidadHabitaciones;
    private boolean seHaceDescuento;
    private boolean poseeCampoDeportivo;

    public Residencia() {
    }

    public Residencia(Integer cantidadHabitaciones, boolean seHaceDescuento, boolean poseeCampoDeportivo, boolean esPrivado, Integer cantidadMetrosSqr) {
        super(esPrivado, cantidadMetrosSqr);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.seHaceDescuento = seHaceDescuento;
        this.poseeCampoDeportivo = poseeCampoDeportivo;
    }

    public Integer getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(Integer cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public boolean isSeHaceDescuento() {
        return seHaceDescuento;
    }

    public void setSeHaceDescuento(boolean seHaceDescuento) {
        this.seHaceDescuento = seHaceDescuento;
    }

    public boolean isPoseeCampoDeportivo() {
        return poseeCampoDeportivo;
    }

    public void setPoseeCampoDeportivo(boolean poseeCampoDeportivo) {
        this.poseeCampoDeportivo = poseeCampoDeportivo;
    }

    @Override
    public String toString() {
        return "Residencia{" + "cantidadHabitaciones=" + cantidadHabitaciones + ", seHaceDescuento=" + seHaceDescuento + ", poseeCampoDeportivo=" + poseeCampoDeportivo + '}';
    }
    
     
}
