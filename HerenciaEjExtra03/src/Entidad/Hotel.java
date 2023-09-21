/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;
import java.util.Comparator;
/**
 *
 * @Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las
características de las distintas categorías son las siguientes:
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
 */
public class Hotel extends Alojamiento implements Comparator<Hotel>{
    
    protected Integer cantidadHabitaciones;
    protected Integer numCamas;
    protected Integer cantidadPisos;
    protected Integer precioHabitaciones;
    protected boolean identificadorEsHotel;

    public Hotel() {
    }

    public Hotel(Integer cantidadHabitaciones, Integer numCamas, Integer cantidadPisos, Integer precioHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numCamas = numCamas;
        this.cantidadPisos = cantidadPisos;
        this.precioHabitaciones = precioHabitaciones;
        this.identificadorEsHotel=true;
    }

    public boolean isIdentificadorEsHotel() {
        return identificadorEsHotel;
    }

    
    
    ////////Metodos de clase/////////
    
    public Integer precioHabitacion(){
        
        /**
         * El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).
Donde:
Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.
Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.
         */
      return precioHabitaciones+=50+(1*cantidadHabitaciones);  
    }
    
    
    public Integer getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(Integer cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public Integer getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(Integer numCamas) {
        this.numCamas = numCamas;
    }

    public Integer getCantidadPisos() {
        return cantidadPisos;
    }

    public void setCantidadPisos(Integer cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }

    public Integer getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(Integer precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }
    
    
    @Override 
    public int compare(Hotel hotel1,Hotel hotel2){
        int comparacion=(hotel1.getPrecioHabitaciones()).compareTo(hotel2.getPrecioHabitaciones());
        return comparacion;
    }
    
}
