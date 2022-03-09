package proyectointegrador;
import java.io.*;
import javax.swing.JOptionPane;
//https://www.tutorialspoint.com/java/io/java_io_file.htm

public class FileITM {
    
    private File archivo; //"archivo": objeto tipo "File". "File" es una clase del paquete "io".
    private BufferedReader read;
    
    //Método que crea el archivo plano
    public void create(String nombre){
        archivo = new File(nombre + ".txt"); //"archivo" almacena la ruta donde se guardó el archivo plano.
        if(!comprobararchivo()){ //Verifica si el archivo plano existe o no.
            JOptionPane.showMessageDialog(null,"¡¡¡El archivo " + archivo.getName() + ", fue creado con éxito!!!, en la ruta " +
                    archivo.getAbsolutePath()); //"archivo.getName()" retorna el nombre del archivo.
        }//"archivo.getAbsolutePath()" retorna la ruta donde está almacenado el archivo plano.
        else{
            JOptionPane.showMessageDialog(null,"El archivo " + archivo.toString() + ", ya existe.");//"archivo.toString()" imprime el nombre del archivo plano.
        }
    }
    
    //Método que escribe la información digitada por el usuario dentro del archivo plano.
    public void write(String dato){
        try { //CONSULTAR try-catch
            BufferedWriter escribir=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo,true)));
            escribir.write(dato);
            escribir.write("\n");
            escribir.close();
        } catch (Exception ex) {
           System.out.println("El error fue porque: " + ex.getMessage());
        }
    }
    
    //Método que imprime el texto que contiene el archivo plano.
    public void print(){
        String text = null;
        try {
            if(comprobararchivo()){
               read = new BufferedReader(new FileReader(archivo));
                while((text = read.readLine()) != null) {//"readLine()" retorna los caracteres que están escritos en el archivo plano.
                    System.out.println(text);
                }
                read.close();
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void delete(){
        try {
            if(comprobararchivo()){
                archivo.delete();
                JOptionPane.showMessageDialog(null,"El archivo " + archivo.getName() + " fue borrado con éxito");
            }
        } catch (Exception ex) {
              System.out.println(ex.getMessage());
        }
    }
       
    public boolean comprobararchivo(){
        if(!archivo.exists()){
            JOptionPane.showMessageDialog(null,"Archivo no existe");
            return false;
        }
        return true;
    }

    public File getArchivo() {
        return archivo;
    }
}
