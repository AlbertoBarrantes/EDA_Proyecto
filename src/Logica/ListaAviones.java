
package Logica;

public final class ListaAviones {
    
    Nodo lista;
    
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

    public String retornaLista() {
        
        String str = "";
        
        if( listaVacia() ) {
            str = "La lista está vacia\n";
        }else{
            
            Nodo aux = lista;
            
            while(aux != null){
                str += " ✈ ID: " + aux.id + " Modelo: " + aux.modelo + " Piloto: " + aux.piloto + " Pasajeros: " + aux.pasajeros + " Sobrecargos: " + aux.sobrecargos + "\n";
                aux = aux.sig;
            }
        }
        return str;
    }
}
