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
public class Ciudades {
    private String Ciudad;
    private int cantHabitantes,cantUniversidades;

    public Ciudades(String Ciudad, int cantHabitantes, int cantUniversidades) {
        this.Ciudad = Ciudad;
        this.cantHabitantes = cantHabitantes;
        this.cantUniversidades = cantUniversidades;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public int getCantHabitantes() {
        return cantHabitantes;
    }

    public int getCantUniversidades() {
        return cantUniversidades;
    }
    
    
}
