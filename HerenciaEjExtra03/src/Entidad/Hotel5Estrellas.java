/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
 */
public class Hotel5Estrellas extends Hotel4Estrellas {
    
    
    private Integer cantidadSalonesConferencia;
    private Integer cantidadSuites;
    private Integer cantidadLimosinas;

    public Hotel5Estrellas() {
    }

    public Hotel5Estrellas(Integer cantidadSalonesConferencia, Integer cantidadSuites, Integer cantidadLimosinas, String gimnasio, String nombreRestaurantel, Integer capacidadRestaurante, Integer cantidadHabitaciones, Integer numCamas, Integer cantidadPisos, Integer precioHabitaciones) {
        super(gimnasio, nombreRestaurantel, capacidadRestaurante, cantidadHabitaciones, numCamas, cantidadPisos, precioHabitaciones);
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
    }

    public Integer getCantidadSalonesConferencia() {
        return cantidadSalonesConferencia;
    }

    public void setCantidadSalonesConferencia(Integer cantidadSalonesConferencia) {
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
    }

    public Integer getCantidadSuites() {
        return cantidadSuites;
    }

    public void setCantidadSuites(Integer cantidadSuites) {
        this.cantidadSuites = cantidadSuites;
    }

    public Integer getCantidadLimosinas() {
        return cantidadLimosinas;
    }

    public void setCantidadLimosinas(Integer cantidadLimosinas) {
        this.cantidadLimosinas = cantidadLimosinas;
    }

    @Override
    public String toString() {
        return "Hotel5Estrellas{" + "nombre= "+ nombre+"cantidadSalonesConferencia=" + cantidadSalonesConferencia + ", cantidadSuites=" + cantidadSuites + ", cantidadLimosinas=" + cantidadLimosinas + '}';
    }

    @Override
    public Integer precioHabitacion() {
        super.precioHabitacion();
        precioHabitaciones+=15*cantidadLimosinas;
        return precioHabitaciones;
    }
    
    
    
    
}
