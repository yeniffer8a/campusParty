package proyectointegrador;

import javax.swing.JOptionPane;

public class ProyectoIntegrador {
    private FileITM A;
    private Metodo M;

    public ProyectoIntegrador() {
        A = new FileITM();
        M = new Metodo();
    }

    public static void main(String[] args) {
        ProyectoIntegrador p = new ProyectoIntegrador();
        p.A.create(JOptionPane.showInputDialog("Ingrese el nombre del archivo"));
        p.menu();
//        Metodo imprimir = new Metodo();
//        imprimir.RegistroCampuseros();
// 
    }
    private void menu(){
        int opc = Integer.parseInt(JOptionPane.showInputDialog(null, 
            "1. Almacenar la informaciÃ³n. \n" +
            "2. Escribir en un archivo. \n" +
            "3. Imprimir el texto almacenado en el archivo. \n" +
            "4. Borrar un archivo. \n","SELECCIONE UNA OPCIÃ“N", 1));

        switch(opc){
            case 1:
                M.RegistroCampuseros();
                break;
            case 2:
                A.write(M.nombreUsuario());
                break;
            case 3:
                A.print();
                break;
            case 4:
                if(JOptionPane.showConfirmDialog(null,"Está seguro de eliminar el archivo? ", "ELIMINAR", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
                    A.delete();
                break; 
            default:
                JOptionPane.showMessageDialog(null, "Opción incorrecta!!!");
        }

        if (JOptionPane.showConfirmDialog(null,"¿Desea otra opción del menu? ", "MENU", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            menu(); //recursividad
        }
    }
    
    }

    


