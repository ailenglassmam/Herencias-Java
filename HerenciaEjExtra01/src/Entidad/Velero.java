/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author jupac
 */
public class Velero extends Barco {
    
    private Integer numero_mastiles;

    public Velero(Integer numero_mastiles, String matricula, Integer eslora_Metros, Integer anio_Fabricacion) {
        super(matricula, eslora_Metros, anio_Fabricacion);
        this.numero_mastiles = numero_mastiles;
    }

    public Velero() {
        
    }

    
    
    public Integer getNumero_mastiles() {
        return numero_mastiles;
    }

    public void setNumero_mastiles(Integer numero_mastiles) {
        this.numero_mastiles = numero_mastiles;
    }

    @Override
    public String toString() {
        return "Velero{" + "numero_mastiles=" + numero_mastiles + '}';
    }

    @Override
    public double calcularAlquiler() {
        double valor=super.calcularAlquiler();
        return valor+numero_mastiles;
    }
    
    
    
    
    
    
}
