/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará
 */
public class Alquiler {
    
    
    protected String nombre;
    protected Integer documento_Cliente;
    protected LocalDate fecha_Alquiler;
    protected LocalDate fecha_Devolucion;
    protected Integer posicion_Amarre;
    protected Barco barco_Ocupado;

    public Alquiler() {
    }

    public Alquiler(String nombre, Integer documento_Cliente, LocalDate fecha_Alquiler, LocalDate fecha_Devolucion, Integer posicion_Amarre, Barco barco_Ocupado) {
        this.nombre = nombre;
        this.documento_Cliente = documento_Cliente;
        this.fecha_Alquiler = fecha_Alquiler;
        this.fecha_Devolucion = fecha_Devolucion;
        this.posicion_Amarre = posicion_Amarre;
        this.barco_Ocupado = barco_Ocupado;
    }
  
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDocumento_Cliente() {
        return documento_Cliente;
    }

    public void setDocumento_Cliente(Integer documento_Cliente) {
        this.documento_Cliente = documento_Cliente;
    }

    public LocalDate getFecha_Alquiler() {
        return fecha_Alquiler;
    }

    public void setFecha_Alquiler(LocalDate fecha_Alquiler) {
        this.fecha_Alquiler = fecha_Alquiler;
    }

    public LocalDate getFecha_Devolucion() {
        return fecha_Devolucion;
    }

    public void setFecha_Devolucion(LocalDate fecha_Devolucion) {
        this.fecha_Devolucion = fecha_Devolucion;
    }

    public Integer getPosicion_Amarre() {
        return posicion_Amarre;
    }

    public void setPosicion_Amarre(Integer posicion_Amarre) {
        this.posicion_Amarre = posicion_Amarre;
    }

    public Barco getBarco_Ocupado() {
        return barco_Ocupado;
    }

    public void setBarco_Ocupado(Barco barco_Ocupado) {
        this.barco_Ocupado = barco_Ocupado;
    }





    
    
    
}
