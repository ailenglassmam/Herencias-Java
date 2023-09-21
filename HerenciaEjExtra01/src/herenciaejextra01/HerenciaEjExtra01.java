/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciaejextra01;

import Entidad.Alquiler;
import Entidad.Barco;
import Entidad.BarcoMotor;
import Entidad.Velero;
import Entidad.Yate;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author jupac
 */
public class HerenciaEjExtra01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alquiler miAlqui=new Alquiler("Mi proa", 23045, LocalDate.of(2021, Month.AUGUST, 1),LocalDate.now(), 10,new Barco());
        Alquiler miAlqui2=new Alquiler("Mi proa", 23045, LocalDate.of(2022, Month.DECEMBER, 1),LocalDate.now(), 10,new Barco());
        Alquiler miAlqui3=new Alquiler("Mi proa", 23045, LocalDate.of(2014, Month.JANUARY, 1),LocalDate.now(), 10,new Barco());
        BarcoMotor bMotor=new BarcoMotor(1000, "XXY666", 30, 2017 );
        bMotor.setAlqui(miAlqui);
        Yate yatesillo=new Yate(5, 700, "XXY420", 30, 2019);
        yatesillo.setAlqui(miAlqui2);
        Velero vel=new Velero(2, "xxh777", 39, 2014);
        vel.setAlqui(miAlqui3);
        
        System.out.println("El costo de alquiler para el yate es: ");
        System.out.println("Precio: "+yatesillo.calcularAlquiler());
        System.out.println("El costo de alquiler para el barcomotor es: ");
         System.out.println("Precio: "+bMotor.calcularAlquiler());
        System.out.println("El costo de alquiler para el velero es: ");
         System.out.println("Precio: "+vel.calcularAlquiler());
    
    }
    
}
