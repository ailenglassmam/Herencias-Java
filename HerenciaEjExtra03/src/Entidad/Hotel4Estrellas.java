/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
 */
public class Hotel4Estrellas extends Hotel {
//    private Integer cantidadHabitaciones;
//    private Integer numCamas;
//    private Integer cantidadPisos;
//    private Integer precioHabitaciones;
    private String gimnasio;
    private String nombreRestaurantel;
    private Integer capacidadRestaurante;

    public Hotel4Estrellas() {
    }

    public Hotel4Estrellas(String gimnasio, String nombreRestaurantel, Integer capacidadRestaurante, Integer cantidadHabitaciones, Integer numCamas, Integer cantidadPisos, Integer precioHabitaciones) {
        super(cantidadHabitaciones, numCamas, cantidadPisos, precioHabitaciones);
        this.gimnasio = gimnasio;
        this.nombreRestaurantel = nombreRestaurantel;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurantel() {
        return nombreRestaurantel;
    }

    public void setNombreRestaurantel(String nombreRestaurantel) {
        this.nombreRestaurantel = nombreRestaurantel;
    }

    public Integer getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(Integer capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    @Override
    public String toString() {
        return "Hotel4Estrellas{" +"nombre= "+ nombre + "gimnasio=" + gimnasio + ", nombreRestaurantel=" + nombreRestaurantel + ", capacidadRestaurante=" + capacidadRestaurante + '}';
    }

    /**
     * 
     * Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.
Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
     */
    
    @Override
    public Integer precioHabitacion() {
        
//        Scanner leer=new Scanner(System.in);
//        int cantidadPersonas=0;
        super.precioHabitacion();
        
        if(capacidadRestaurante<30){
             precioHabitaciones+=10;
        }
        else if(capacidadRestaurante>=30 && capacidadRestaurante<=50){
             precioHabitaciones+=30;
        }
        else if(capacidadRestaurante>50){
             precioHabitaciones+=50;
        }
        
        ///////Valor Agregado Gym///////
        
        switch (gimnasio) {
            case "A" -> {
                precioHabitaciones+=50;
            }
            case "B" ->{
                precioHabitaciones+=30;
            }
            default -> throw new AssertionError();
        }
        
        return precioHabitaciones;
       
    }

    
  
    
    
    
    
    
    
    
}
