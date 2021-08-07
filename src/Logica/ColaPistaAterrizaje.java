
package Logica;

public class ColaPistaAterrizaje  {
    
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
    
    public void borrarAlInicio() {

        if( !listaVacia() ) {
            lista = lista.sig;
        }
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
    
    public Nodo getNodeByIndex(int index) {
        
        Nodo nIndex = new Nodo();
        
        if( listaVacia() ) {
            
        }else{
            
            Nodo aux = lista;
            
            for (int i = 0; i < index; i++) {
                nIndex = aux;
                aux = aux.sig;
            }
        }
        return nIndex;
    }
}