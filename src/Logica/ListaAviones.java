
package Logica;

public final class ListaAviones {
    
    public Nodo lista;
    
    public ListaAviones() {
    }
    
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

        public int size(){
        
        int cont = 0;
        
        if( listaVacia() ) {
            return 0;
        }else{
            
            Nodo aux = lista;
            
            
            while(aux != null){
                cont++;
                aux = aux.sig;
            }
        }
        return cont;
    }
    
    public Nodo getLastNode(){
        
        Nodo aux = lista;
        
        if( listaVacia() ) {
            return null;
        }else{
            while(aux.sig!=null){
                aux = aux.sig;
            }
            return aux;
        }
    }
}