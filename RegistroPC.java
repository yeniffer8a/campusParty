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
public class RegistroPC{
    String serial,ram,discoDuro;
    Cola software;

    public RegistroPC(String serial, String ram, String discoDuro, Cola software) {
        this.serial = serial;
        this.ram = ram;
        this.discoDuro = discoDuro;
        this.software = software;
    }
    
    
}
