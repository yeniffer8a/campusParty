package proyectointegrador;

public class Pila {
    //La variable "tope" es la misma que la variable "cabeza"
    private Nodo tope; //Memory address
    
    public Pila(){
        tope = null; //initialize the variables
    }
    
    //verifica si existen nodos en la Pila
    public boolean empty(){
        return tope == null;
    }

    //Apila o almacena la información.
    public void push(Object dato){
        tope = new Nodo(dato, tope);
    }

    //Desapila o extrae la información.
    public Object pop(){
        Object d=null;
            if(tope.getSiguiente() == null){ //se realiza si es el último nodo
                d = tope.getDato();
                tope = null;
            }
            else{
                d = tope.getDato();
                tope = tope.getSiguiente(); //permite desplazarme entre los nodos
            }
        return d;
    }
    
    public Object peek(){
       if(!empty()){
           return tope.getDato();
       }
       return null;
    }
}