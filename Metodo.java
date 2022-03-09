
package proyectointegrador;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Yenifer
 */
public class Metodo {
    private ArrayList<Campuseros> arrayCampuseros;
    private int cont=0,opc=0,j=0, num2=0,i=0, num1=0;
    private String texto="", area="";
    private Cola colaSoftware;
    private Pila pilaciudad;
    private ListaDoble listaParqueadero;
    public Metodo(){
        arrayCampuseros = new ArrayList();
        colaSoftware = new Cola();
        pilaciudad = new Pila();
        listaParqueadero = new ListaDoble();
    }
    
    private Cola ingresarSoftware(){
        Cola colaAux = new Cola();
        colaSoftware.offer( new Softwares(
                   JOptionPane.showInputDialog("Ingrese nombre del software"),
                   Integer.parseInt(JOptionPane.showInputDialog("Ingrese precio del software ")),
                   Integer.parseInt(JOptionPane.showInputDialog("Ingresa puntaje del software")),
                   JOptionPane.showInputDialog("Ingresa nombre del creador "),
                   JOptionPane.showInputDialog("Ingresa apellido del creador"),
                   JOptionPane.showInputDialog("Ingresa documento de identidad del creador") 
                
        ));
        
        while(!colaSoftware.isEmpty()){
            Softwares software = (Softwares)colaSoftware.poll();
            System.out.println("Sus datos fueron registrados con éxito");
            System.out.println("Nombre del software: " + software.getNombreSoftware()+
                    " Precio del software: "+software.precio+" Puntaje del software: "
                    +software.puntaje_valor+" Creador de software: ");
            colaAux.offer(software);   
        }
          while(!colaAux.isEmpty()){
              colaSoftware.offer(colaAux.poll());
          }
       return colaSoftware;
    }//fin metodo ingresarSoftware
    
    private RegistroPC ingresarRegistroPC(){
        return new RegistroPC(
                   JOptionPane.showInputDialog("Ingresa número de serial"),
                   JOptionPane.showInputDialog("Ingresa memoria ram"),
                   JOptionPane.showInputDialog("Ingresa capacidad de disco duro"),//Aquí se puede hacer switch case para que e
                   ingresarSoftware()
        );
    }//fin metodo ingresarRegistroPC
    
    private Pila ingresarCiudad(){
        Pila pilaAux = new Pila();
        pilaciudad.push( new Ciudades(
                   JOptionPane.showInputDialog("Ingresa nombre de tu ciudad natal"),
                   Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de habitantes de tu ciudad")),
                   Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de universidades de tu ciudad"))
        ));
        while(!pilaciudad.empty()){
            Ciudades ciudad = (Ciudades)pilaciudad.pop();
            System.out.println("Sus datos fueron registrados con éxito");
            System.out.println("Nombre del ciudad: " + ciudad.getCiudad()+
                    " Cantidad habitantes: "+ciudad.getCantHabitantes()+" Cantidad de universidades: "
                    +ciudad.getCantUniversidades());
            pilaAux.push(ciudad);
        }
        while(!pilaAux.empty()){
            pilaciudad.push(pilaAux.pop());
        }
        return pilaciudad;
    
        
    }//fin metodo ingresarCiudad
    
    private Pabellones ingresarPabellon(){
        
        return new Pabellones(
                   tematica(),
                   texto,
                   cont,
                   area
        );
    }// fin metodo ingresarPabellon
    
    private String tematica(){
        String texto="";
        opc= Integer.parseInt(JOptionPane.showInputDialog(
                "Marca:\n 1.Temática Video Juego. \n 2. Temática Educativa."));
                
        if(opc==1){
           texto="Video Juego"; 
           System.out.println(condicion1());
        }else{
            if(opc==2){
                texto="Educativa";
                System.out.println(condicion2());
            }else{
                JOptionPane.showMessageDialog(null, "Elegiste una opción incorrecta, vuelvelo a intentar");
                tematica();
            }
        }
        return texto;
    
    }//fin metodo tematica

 
//    private void nombrePabellon(){
//        if(1==opc){
//           System.out.println(condicion1());
//        }else{
//              System.out.println(condicion2());
//        }
//      
//    }//fin metodo nombrePabellon
//    
    private String condicion1(){
        String texto1="";
        int cont1=0;
         ++cont1;
         ++cont;
           if(251!=cont1){
               texto="Pabellon A";
               area="Norte";
               texto1="Queda registrado en el "+texto+" área "+area+" carpa Número: "+ cont;
               return texto1;
           }else
               if(501!=cont1){
                 texto="Pabellon B";
                 area="Este";
                 texto1="Queda registrado en el "+texto+" área "+area+" carpa Número: "+ cont;
               return texto1;
                 
               }else{
                     System.out.println("Ya no hay cupos disponibles para la temática seleccionada, "
                             + "gracias por visitarnos.");
                     return null;
               }
        
    }//fin metodo condicion1
    
    private String condicion2(){
        String texto1="";
        int cont2=0;
        ++cont2;
        ++cont;
           if(251!=cont2){
               texto="Pabellon C";
               area="Sur";
               texto1="Queda registrado en el "+texto+" área "+area+" carpa Número: "+ cont2;
               return texto1;
           }else
               if(501!=cont2){
                 texto="Pabellon D";
                 area="Oeste";
                 texto1="Queda registrado en el "+texto+" área "+area+" carpa Número: "+ cont2;
                 return texto1;
               }else{
                     System.out.println("Ya no hay cupos disponibles para la temática seleccionada, "
                             + "gracias por visitarnos");
                     return null;
                     
               }      
    }//fin metodo condicion2
    
    private SuperGamers ingresarGamers(){
        return new SuperGamers(
               JOptionPane.showInputDialog("Nombre del equipo"),
               JOptionPane.showInputDialog("Ciudad de procedencia"),
               Integer.parseInt(JOptionPane.showInputDialog("Cantidad de títulos"))
        );
        
    }//fin ingresarGamers
    
    private Hoteles deseaAlojamiento(){
        int opc=0;
        opc=Integer.parseInt(JOptionPane.showInputDialog("Tenemos convenio con algunos hoteles, si desea conocer "
                + "la información marca: \n 1. Para si \n 2. Para no"));
        if(opc==1){
           return convenioHotel();
        }else{
            if(opc==2){
                JOptionPane.showMessageDialog(null, "Gracias por visitarnos");
            }else{
                JOptionPane.showMessageDialog(null, "Elegiste una opción incorrecta, vuelvelo a intentar");
                deseaAlojamiento();
            }//if
        }//if
        return null;
    }//fin deseaAlojamiento
    
    private Hoteles convenioHotel(){
        Hoteles hotel = null;
        int opc=0,tarifa=0;
        opc=Integer.parseInt(JOptionPane.showInputDialog("Selecciona la mejor oferta para ti: \n 1.Hotel del Mar, hotel 5 estrellas, "
                + "tarifa por noche $100.000, aunque con el convenio tiene un descuento de $30.000 ubicado a una "
                + "cuadra del evento "
                + "al evento. \n 2. Hotel Costa Clara, hotel 4 estrellas, tarifa por noche $70.000 con un "
                + "descuento de $20.000 ubicado a 5 cuadras del evento. \n 3. Hotel el Rinconsito, hotel 4 estrellas, "
                + "tarifa por noche $70.000 con un "
                + "descuento de $20.000 ubicado a 10 cuadras del evento. "));
        switch(opc){
            case 1:
                tarifa=70000;
                hotel= new Hoteles(
                        tarifa,
                        "Hotel del Mar",
                        "A una cuadra del evento"
                );
                break;
            case 2:
                tarifa=50000;
                hotel= new Hoteles(
                        tarifa,
                        "Hotel Costa Clara",
                        "A 5 cuadras del evento"
                );
                break;
            case 3:
                tarifa=50000;
                hotel= new Hoteles(
                        tarifa,
                        "Hotel El Riconsito",
                        "A 10 cuadras del evento"
                );
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción Incorrecta, vuelve a seleccionar");
                convenioHotel();
                break;
        }
        return hotel; 
    }//fin convenioHotel
    
    private ListaDoble Parqueadero(){
        int opc=0;
        opc= Integer.parseInt(JOptionPane.showInputDialog("¿Asistirá al evento en transporte privado y requiere"
                + " parqueadero?, responda: \n 1. Si. \n 2. No"));
        if(opc==1){
            int opc2=0;
           opc2=Integer.parseInt(JOptionPane.showInputDialog("Ahora dinos: \n 1. Automóvil. \n "
                   + "2. Motocicleta."));
           return asignacionParqueadero(opc2);
        }else{
            if(opc==2){
                JOptionPane.showMessageDialog(null, "Gracias por visitarnos");
            }else{
                 JOptionPane.showMessageDialog(null, "Elegiste una opción incorrecta, vuelvelo a intentar");
                 Parqueadero();
        }//if
    }//if
        return null;
    }//fin Parqueadero
    
    private ListaDoble asignacionParqueadero(int sel){
        if(sel==1){
           return parqueaderoAuto();
        }else{
            if(sel==2){
                return parqueaderoMoto();
            }else{
                JOptionPane.showMessageDialog(null, "Elegiste una opción incorrecta, vuelvelo a intentar");
                asignacionParqueadero(sel);
            }//if
        }//if
        return null;
    }// fin asignacionParqueadero
    
    private ListaDoble parqueaderoAuto(){
           while(i<21){
           
                listaParqueadero.add(new Parqueadero(
                       "Automóvil",
                       "Parqueadero Automóvil Pabellon A, Zona Norte",
                       ++num1      
               ));
                System.out.println(imprimirRegParqueadero());
                i++;
                return listaParqueadero;
           }//while
               while(i<41){
                   listaParqueadero.add(new Parqueadero(
                       "Automóvil",
                       "Parqueadero Automóvil Pabellon B, Zona Norte",
                       ++num1      
               ));
                   System.out.println(imprimirRegParqueadero());
                   i++;
                   return listaParqueadero;
               }//while
               if(i==41){  
                     System.out.println("Ya no hay parqueadero disponible, te sugerimos ir "
                             + "al parqueadero más cercano, que es Cl 42 N° 85 11 Copacabana.");
                     
               }//if
            
           
           return null;

    }//fin parqueaderoAuto
     
    private ListaDoble parqueaderoMoto(){
        String texto1="";
         
           if(21!=j){
               listaParqueadero.add(new Parqueadero(
                       "Motocicleta",
                       "Parqueadero Motocicleta Pabellon C, Zona Este",
                       ++num2
               ));
               System.out.println(imprimirRegParqueadero());
               
           }else
               if(41!=j){
                   listaParqueadero.add(new Parqueadero(
                       "Motocicleta",
                       "Parqueadero Motocicleta Pabellon D, Zona Este",
                       ++num2
               ));
                   System.out.println(imprimirRegParqueadero());
               }else{
                     System.out.println("Ya no hay parqueadero disponible, te sugerimos ir "
                             + "al parqueadero más cercano, que es Cl 42 N° 85 11 Copacabana.");
                     
               }//if
           return listaParqueadero;
 
    }//fin parqueaderoAuto
    
    public void RegistroCampuseros(){
        ListaDoble listaParqueo;
        listaParqueo = listaParqueadero;
        while(JOptionPane.showConfirmDialog(null, "Desea registrar un usuario?") == JOptionPane.YES_NO_OPTION){
        arrayCampuseros.add( new Campuseros(
                JOptionPane.showInputDialog("Ingresa el nombre"),
                JOptionPane.showInputDialog("Ingresa el apellido"),
                JOptionPane.showInputDialog("Ingresa el documento de identidad"),
                ingresarPabellon(),
                ingresarCiudad(),
                ingresarRegistroPC(),
                ingresarGamers(),
                Parqueadero(),
                deseaAlojamiento()
                
                
        ));
        }
    }
    
    private String imprimirRegParqueadero(){
//        String texto="";
//        if(!listaParqueadero.isEmpty()){
//            Nodo q = listaParqueadero.getCabeza();
//            while(q != null){
//                Parqueadero imprimirReg = (Parqueadero)q.getDato();
//                
//                texto= "Su vehículo es: "+imprimirReg.vehiculo+
//                " y su vehículo se encuentra en la zona de parqueo, "+imprimirReg.ubicacion+
//                " y que da registrado con el número, "+ imprimirReg.numParqueo;
//
//            }
//            q = q.getSiguiente();
//        }
//       return texto;
        String texto = "";
        Nodo q = listaParqueadero.getCabeza();
        while(q != null){
            texto += q.getDato().toString() + "\n";
            q = q.getSiguiente();
        }
        return texto;
    }//fin imprimirRegParqueadero
    
        public String nombreUsuario(){
        String texto = "";
        for (Campuseros campusero : arrayCampuseros) {
            Nodo q = campusero.getParqueo().getCabeza();
            while(q!=null){
                texto += q.getDato().toString()+ "  ";
                q = q.getSiguiente();
            }
            texto +=campusero.getPabellon().getNombrePabellon();
        }
        return texto;
    }
}//fin clase
 