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
public class Parqueadero {
    String vehiculo, ubicacion;
    int numParqueo;

    public Parqueadero(String vehiculo, String ubicacion, int numParqueo) {
        this.vehiculo = vehiculo;
        this.ubicacion = ubicacion;
        this.numParqueo = numParqueo;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public int getNumParqueo() {
        return numParqueo;
    }

    @Override
    public String toString() {
        return "Parqueadero{" + "vehiculo=" + vehiculo + ", ubicacion=" + ubicacion + ", numParqueo=" + numParqueo + '}';
    }
    
}
