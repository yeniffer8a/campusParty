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
public class Pabellones{
    String nombrePabellon,tematicaPabellon,ubicacion;
    int carpaNro;

    public Pabellones(String tematicaPabellon,String nombrePabellon, int carpaNro,  String ubicacion) {
        this.nombrePabellon = nombrePabellon;
        this.carpaNro = carpaNro;
        this.tematicaPabellon = tematicaPabellon;
        this.ubicacion = ubicacion;
    }

    public String getNombrePabellon() {
        return nombrePabellon;
    }

    public String getTematicaPabellon() {
        return tematicaPabellon;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public int getCarpaNro() {
        return carpaNro;
    }
    
    
   
}
