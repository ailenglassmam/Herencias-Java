/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author jupac
 */
public class Yate extends BarcoMotor{
    
    private Integer numero_camarotes;

    public Yate(Integer numero_camarotes, double potencia_cv, String matricula, Integer eslora_Metros, Integer anio_Fabricacion) {
        super(potencia_cv, matricula, eslora_Metros, anio_Fabricacion);
        this.numero_camarotes = numero_camarotes;
    }

    public Yate() {
    }

    public Integer getNumero_camarotes() {
        return numero_camarotes;
    }

    public void setNumero_camarotes(Integer numero_camarotes) {
        this.numero_camarotes = numero_camarotes;
    }

    @Override
    public String toString() {
        return "Yate{" + "numero_camarotes=" + numero_camarotes + '}';
    }

    @Override
    public double calcularAlquiler() {
        double valor=super.calcularAlquiler();
        return valor+numero_camarotes;
    }
    
    
    
    
    
}
