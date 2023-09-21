package Entities;

import java.util.ArrayList;
import java.util.Scanner;

public class Electrodomestico {

    protected String modelo;
    protected Integer precio;
    protected String color;
    protected char consumoEnergetico;
    protected Integer peso;

    public Electrodomestico() {
    }

    public Electrodomestico(String color, char consumoEnergetico, Integer peso) {
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Electrodomestico(String modelo, Integer precio, String color, char consumoEnergetico, Integer peso) {
        this.modelo = modelo;
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico() {
        ArrayList<Character> consumos = new ArrayList<>();
        consumos.add('A');
        consumos.add('B');
        consumos.add('C');
        consumos.add('D');
        consumos.add('E');
        consumos.add('F');

        if (!consumos.contains(consumoEnergetico)) {
            consumoEnergetico = 'F'; // Si el consumo no es válido, se establece como F por defecto
        }

        System.out.println("Consumo energético: " + consumoEnergetico);
    }

    public void comprobarColor() {
        ArrayList<String> colores = new ArrayList<>();
        colores.add("blanco");
        colores.add("negro");
        colores.add("rojo");
        colores.add("azul");
        colores.add("gris");

        if (!colores.contains(this.getColor().toLowerCase())) {
            this.setColor("blanco");// Si el color no es válido, se establece como blanco por defecto
        }

        System.out.println("Color: " + this.getColor());
    }

    public int precioFinal() {
        precio = 1000;

        switch (consumoEnergetico) {
            case 'A':
                precio += 1000;
                break;
            case 'B':
                precio += 800;
                break;
            case 'C':
                precio += 600;
                break;
            case 'D':
                precio += 500;
                break;
            case 'E':
                precio += 300;
                break;
            case 'F':
                precio += 100;
                break;
        }

        if (peso >= 1 && peso <= 19) {
            precio += 100;
        } else if (peso >= 20 && peso <= 49) {
            precio += 500;
        } else if (peso >= 50 && peso <= 79) {
            precio += 800;
        } else {
            precio += 1000;
        }

        return precio;
    }

    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in);
    System.out.println("INGRESO DE DATOS");
    System.out.println("Ingrese los datos solicitados para realizar la carga del electrodoméstico a la base de datos");
    System.out.println(" ");
    System.out.print("Consumo Energético:");
    this.setConsumoEnergetico(leer.next().charAt(0));
    leer.nextLine(); //limpieza buffer
    System.out.print("Color:");
    this.setColor(leer.nextLine());
    System.out.print("Peso:");
    this.setPeso(leer.nextInt());
    leer.nextLine();
    
    }
    
    public void crearTicketElectrodomestico() {
        System.out.println("FICHA ELECTRODOMESTICO");
        System.out.println("* * * * *     &&     * * * * *");

        comprobarConsumoEnergetico();
        comprobarColor();
        System.out.println(precioFinal());

    }
}
