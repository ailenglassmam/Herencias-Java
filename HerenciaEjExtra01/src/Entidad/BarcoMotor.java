/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.time.temporal.ChronoUnit;

/**
 *
 * @author jupac
 */
public class BarcoMotor extends Barco {
    private double potencia_cv;
    
    
     
       
    
            
    
    public BarcoMotor(double potencia_cv, String matricula, Integer eslora_Metros, Integer anio_Fabricacion) {
        super(matricula, eslora_Metros, anio_Fabricacion);
        this.potencia_cv = potencia_cv;
    }

    public BarcoMotor() {
    }

    public double getPotencia_cv() {
        
        return potencia_cv;
    }

    public void setPotencia_cv(double potencia_cv) {
        
        this.potencia_cv = potencia_cv;
    }

    @Override
    public String toString() {
        return "BarcoMotor{" + "potencia_cv=" + potencia_cv + '}';
    }

    @Override
    public double calcularAlquiler() {
        double valor=super.calcularAlquiler();
        return valor+potencia_cv;
        
    }
    
    
    
    
}
