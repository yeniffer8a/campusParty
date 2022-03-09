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
public class Campuseros extends Super{
  Pabellones pabellon;
  Pila ciudad;
  RegistroPC regPc;
  SuperGamers gamers;
  ListaDoble parqueo;
  Hoteles hotel;

    public Campuseros(String nombreCampusero, String Apellidos, String cedula,Pabellones pabellon, Pila ciudad, RegistroPC regPc, SuperGamers gamers,ListaDoble parqueo, Hoteles hotel) {
        super(nombreCampusero, Apellidos, cedula);
        this.pabellon = pabellon;
        this.ciudad = ciudad;
        this.regPc = regPc;
        this.gamers = gamers;
        this.parqueo = parqueo;
        this.hotel = hotel;
    }

    public Pabellones getPabellon() {
        return pabellon;
    }

    public Pila getCiudad() {
        return ciudad;
    }

    public RegistroPC getRegPc() {
        return regPc;
    }

    public SuperGamers getGamers() {
        return gamers;
    }

    public ListaDoble getParqueo() {
        return parqueo;
    }

    public Hoteles getHotel() {
        return hotel;
    }

    @Override
    public String toString() {
        return "Campuseros{" + "pabellon=" + pabellon + ", ciudad=" + ciudad + ", regPc=" + regPc + ", gamers=" + gamers + ", parqueo=" + parqueo + ", hotel=" + hotel + '}';
    }

   
}
