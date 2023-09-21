/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @Una compañía de promociones turísticas desea mantener información sobre la infraestructura
de alojamiento para turistas, de forma tal que los clientes puedan planear sus vacaciones de
acuerdo con sus posibilidades. Los alojamientos se identifican por un nombre, una dirección,
una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de
alojamientos: Hoteles y Alojamientos Extrahoteleros.
 */
public class Alojamiento {
   
    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected String gerentito;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, String direccion, String localidad, String gerentito) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerentito = gerentito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerentito() {
        return gerentito;
    }

    public void setGerentito(String gerentito) {
        this.gerentito = gerentito;
    }
    
    
    
    
}
