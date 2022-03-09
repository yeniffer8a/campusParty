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
public class Hoteles {
    int tarifa;
    String nombreHotel, ubicacion;

    public Hoteles(int tarifa, String nombreHotel, String ubicacion) {
        this.tarifa = tarifa;
        this.nombreHotel = nombreHotel;
        this.ubicacion = ubicacion;
    }

    public int getTarifa() {
        return tarifa;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public String getUbicacion() {
        return ubicacion;
    }
    
    
    
    
}
