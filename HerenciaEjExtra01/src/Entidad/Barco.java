/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
 */
public class Barco {
    
    protected String matricula;
    protected Integer eslora_Metros;
    protected Integer anio_Fabricacion;
    private Alquiler alqui;

    public Alquiler getAlqui() {
        return alqui;
    }

    public void setAlqui(Alquiler alqui) {
        this.alqui = alqui;
    }
    
    
    public Barco() {
        alqui=new Alquiler();
          
    }

    public Barco(String matricula, Integer eslora_Metros, Integer anio_Fabricacion) {
        this.matricula = matricula;
        this.eslora_Metros = eslora_Metros;
        this.anio_Fabricacion = anio_Fabricacion;
    }

      public double calcularAlquiler() {
            long dias=ChronoUnit.DAYS.between(alqui.fecha_Alquiler,alqui.fecha_Devolucion);
            
            return eslora_Metros*dias*10;
            
            
        }
    
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora_Metros() {
        return eslora_Metros;
    }

    public void setEslora_Metros(Integer eslora_Metros) {
        this.eslora_Metros = eslora_Metros;
    }

    public Integer getAnio_Fabricacion() {
        return anio_Fabricacion;
    }

    public void setAnio_Fabricacion(Integer anio_Fabricacion) {
        this.anio_Fabricacion = anio_Fabricacion;
    }
    
    
    
}
