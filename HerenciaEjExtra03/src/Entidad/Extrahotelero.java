/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @aEn contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo. Realizar un programa en el que se representen todas las relaciones
descriptas.
Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.
 */
public class Extrahotelero extends Alojamiento{
    private boolean esPrivado;
    private Integer cantidadMetrosSqr;

    public Extrahotelero() {
    }

    public Extrahotelero(boolean esPrivado, Integer cantidadMetrosSqr) {
        this.esPrivado = esPrivado;
        this.cantidadMetrosSqr = cantidadMetrosSqr;
    }

    public boolean isEsPrivado() {
        return esPrivado;
    }

    public void setEsPrivado(boolean esPrivado) {
        this.esPrivado = esPrivado;
    }

    public Integer getCantidadMetrosSqr() {
        return cantidadMetrosSqr;
    }

    public void setCantidadMetrosSqr(Integer cantidadMetrosSqr) {
        this.cantidadMetrosSqr = cantidadMetrosSqr;
    }
    
    
    
}
