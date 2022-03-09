package proyectointegrador;

public class Cola {
    
    private Nodo Final, Front;
    
    public Cola(){
        Final = Front = null;
        /*
        Final = null;
        Frente = null;
        */
    }
        
    public boolean isEmpty(){ 
        return Final == null;
    }
           
    public void offer(Object data){
        if(isEmpty()){
            Front = Final = new Nodo(data);
        }
        else{
            Final.setSiguiente(new Nodo(data));
            Final = Final.getSiguiente();
        } 
    }
    
    public Object poll(){
        Object d = null;
        if(!isEmpty()){
	    d = Front.getDato();
            if(Front == Final){
                Front = Final = null;
            }
            else{
                Front = Front.getSiguiente();
            }
        }
        return d;
    }
 
    public Object peek(){
       if(!isEmpty()){
           return Front.getDato();
       }
       return null;
    }

//    @Override
//    public String toString() {
//        return "Cola{" + "Final=" + Final + ", Front=" + Front + '}';
//    }
    
    
}
