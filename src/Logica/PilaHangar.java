
package Logica;

public class PilaHangar {
    
    public Nodo lista;
    
    public boolean listaVacia() {
        return lista == null;
    } 
        
    public void agregaAvion(String modelo, String piloto, int pasajeros, int sobrecargos, int id) {
        
        Nodo nuevoNodo = new Nodo(modelo,piloto,pasajeros,sobrecargos,id);
        
        if( listaVacia() ) {
            lista = nuevoNodo;
        }else {
            
            Nodo aux = lista;
            
            while(aux.sig != null){
                aux = aux.sig;
            }
            aux.sig = nuevoNodo;
        }
    }
    
    public void eliminar() {
        
        if( !listaVacia() && lista.sig == null) {
            lista = null;
        }else {
            
            Nodo aux = lista;
            
            while(aux != null){
                
                if(aux.sig.sig == null){
                    aux.sig = null;
                }
                aux = aux.sig;
            }
        }
    }
    
    public Nodo retornaNodo() {
        
        Nodo aux = lista;
            
        if( !listaVacia() && lista.sig == null) {
            return lista;
        }else {
            
            while(aux != null){
                
                if(aux.sig.sig == null){
                    return aux.sig;
                }
                aux = aux.sig;
            }
        }
        return aux;
    }

    public String retornaLista2() {
        
        String str = "";
        
        if( listaVacia() ) {
        }else{
            
            Nodo aux = lista;
            
            while(aux != null){
                str += " ✈ ";
                aux = aux.sig;
            }
        }
        return str;
    }
    
}
