package proyectointegrador;

public class Nodo {
    
    private Object dato; //permite almacenar cualquier tipo de dato
    private Nodo siguiente, anterior;

    //POLIMORFISMO, porque se utilizan 2 métodos con el mismo nombre, también conocido como sobrecarga
    //Para trabajar con las estructuras pilas
    public Nodo(Object dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }
    
    public Object getDato() {
        return dato;
    }
    
    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    //Para trabajar con las estructuras colas
    public Nodo(Object dato){
        this.dato = dato;
        this.siguiente = null;
    }
    
    //Para trabajar con las estructuras listas dobles
    public Nodo(Nodo anterior, Object dato, Nodo siguiente){
        this.anterior = anterior;
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
}
