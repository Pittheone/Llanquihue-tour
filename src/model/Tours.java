/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
public class Tours {
    private String nombre;
    private String lugar;
    private int precio;

    public Tours() {
    }

    public Tours(String nombre, String lugar, int precioNoche) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.precio = precioNoche;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getPrecioNoche() {
        return precio;
    }

    public void setPrecioNoche(int precioNoche) {
        this.precio = precioNoche;
    }

    @Override
    public String toString() {
        return "Tours{" + "nombre=" + nombre + ", lugar=" + lugar + ", precio=" + precio + '}';
    }
    
    
}
