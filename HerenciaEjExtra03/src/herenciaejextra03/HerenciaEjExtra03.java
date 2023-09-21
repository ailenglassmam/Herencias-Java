/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciaejextra03;

import Entidad.Alojamiento;
import Entidad.Camping;
import Entidad.Hotel;
import Entidad.Hotel4Estrellas;
import Entidad.Hotel5Estrellas;
import Entidad.Residencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author jupac
 */
public class HerenciaEjExtra03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        int eleccion=0;
        
        Hotel hote=new Hotel();
        //Integer capacidadRestaurante, Integer cantidadHabitaciones, 
        //Integer numCamas, Integer cantidadPisos, Integer precioHabitaciones) {
        Alojamiento hotel4=new Hotel4Estrellas(
                "A", 
                "La caldera de la bruja", 35, 25, 50, 3, 50);
        
        
       hotel4.setNombre("Star");
        
        /**
         * Integer cantidadSalonesConferencia, Integer cantidadSuites, 
         * Integer cantidadLimosinas, String gimnasio, String nombreRestaurantel, 
         * Integer capacidadRestaurante, Integer cantidadHabitaciones, 
         * Integer numCamas, Integer cantidadPisos, Integer precioHabitaciones) {
         */
        Alojamiento hotel5=new Hotel5Estrellas(4, 4, 15,
                "B", "La cacerola torcida.", 20, 30, 60, 4, 60);
        
        hotel5.setNombre("RiverSide");
        /**
         * 
         * Integer capacidadMaxCarpas, Integer cantidadBanos, 
         * boolean tieneRestaurante, boolean esPrivado, Integer cantidadMetrosSqr) {
         */
        Alojamiento camp=new Camping(10, 
                20, true, false, 5000);
        
        
        camp.setNombre("Fullmetal Jacket");
        /**
         * 
         * Integer cantidadHabitaciones, boolean seHaceDescuento, 
         * boolean poseeCampoDeportivo,
         * boolean esPrivado, Integer cantidadMetrosSqr) {
         */
        Alojamiento resid=new Residencia(14,
                false, true, true, 10000);
        
        resid.setNombre("Residencia Mirado");
        
        ArrayList<Alojamiento> listaAlojamientos=new ArrayList<>();
        listaAlojamientos.add(hotel4);
        listaAlojamientos.add(resid);
        listaAlojamientos.add(hotel5);
        listaAlojamientos.add(camp);
        
        
        System.out.println("Ingresa porfa la opcion deseada: "); 
        imprimirMenu();
        eleccion=leer.nextInt();
        
        switch (eleccion) {
            case 1 -> {
                for (Alojamiento listaAlojamiento : listaAlojamientos) {
                    System.out.println(listaAlojamiento);
                }
            }
            case 2 -> {
                ArrayList<Hotel> listaHoteles=new ArrayList<>();
                for (Alojamiento listaAlojamiento  : listaAlojamientos) {
                    if(listaAlojamiento instanceof Hotel){
                        listaHoteles.add((Hotel) listaAlojamiento);
                        
                    }
                    //Hotel hotel1=new Hotel();
                }
                    Collections.sort(listaHoteles,hote);
                    for (Hotel listaHotele : listaHoteles) {
                        System.out.println(listaHotele.getNombre());
                    }
            }
            case 3 -> {
                for (Alojamiento listaAlojamiento : listaAlojamientos) {
                    if(listaAlojamiento instanceof Camping){
                        // Se pasa entre parentesis el tipo de campingm, para hacer
                        // referencia a la clase u objeto heredero de la clase Alojamiento.
                        if(((Camping) listaAlojamiento).isTieneRestaurante()){
                            System.out.println(listaAlojamiento.getNombre());
                        };
                        
                    }
                }
            }
            case 4 -> {
                for (Alojamiento listaAlojamiento : listaAlojamientos) {
                    if(listaAlojamiento instanceof Residencia){
                        if(((Residencia) listaAlojamiento).isSeHaceDescuento()){
                            System.out.println(listaAlojamiento.getNombre());
                        };
                        
                    }
                }
            }
            default -> throw new AssertionError();
        }
        
        
        
    }
    
    
    public static void imprimirMenu(){
        System.out.println("->1)Mostrar todos los alojamientos.");
        System.out.println("->2)Mostrar hoteles de caro a mas barato.");
        System.out.println("->3)Mostrar campings con restaurante.");
        System.out.println("->4)Mostrar residencias con descuento.");
    }
}
