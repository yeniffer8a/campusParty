/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectointegrador;

/**
 *
 * @author Yenifer
 */
public class Softwares extends Super{
    String nombreSoftware;
    int precio, puntaje_valor;

    public Softwares(String nombreSoftware, int precio, int puntaje_valor, String nombreCampusero, String Apellidos, String cedula) {
        super(nombreCampusero, Apellidos, cedula);
        this.nombreSoftware = nombreSoftware;
        this.precio = precio;
        this.puntaje_valor = puntaje_valor;
    }

    public String getNombreSoftware() {
        return nombreSoftware;
    }

    public int getPrecio() {
        return precio;
    }

    public int getPuntaje_valor() {
        return puntaje_valor;
    }
    
    
    
}
