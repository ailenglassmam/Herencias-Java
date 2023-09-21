/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @los Camping y las
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones. 
 */
public class Camping extends Extrahotelero {
    
    private Integer capacidadMaxCarpas;
    private Integer cantidadBanos;
    private boolean tieneRestaurante;

    public Camping() {
    }

    public Camping(Integer capacidadMaxCarpas, Integer cantidadBanos, boolean tieneRestaurante, boolean esPrivado, Integer cantidadMetrosSqr) {
        super(esPrivado, cantidadMetrosSqr);
        this.capacidadMaxCarpas = capacidadMaxCarpas;
        this.cantidadBanos = cantidadBanos;
        this.tieneRestaurante = tieneRestaurante;
    }

    public Integer getCapacidadMaxCarpas() {
        return capacidadMaxCarpas;
    }

    public void setCapacidadMaxCarpas(Integer capacidadMaxCarpas) {
        this.capacidadMaxCarpas = capacidadMaxCarpas;
    }

    public Integer getCantidadBanos() {
        return cantidadBanos;
    }

    public void setCantidadBanos(Integer cantidadBanos) {
        this.cantidadBanos = cantidadBanos;
    }

    public boolean isTieneRestaurante() {
        return tieneRestaurante;
    }

    public void setTieneRestaurante(boolean tieneRestaurante) {
        this.tieneRestaurante = tieneRestaurante;
    }

    @Override
    public String toString() {
        return "Camping{" + "capacidadMaxCarpas=" + capacidadMaxCarpas + ", cantidadBanos=" + cantidadBanos + ", tieneRestaurante=" + tieneRestaurante + '}';
    }
    
    
}
