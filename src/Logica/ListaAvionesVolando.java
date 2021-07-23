
package Logica;

public class ListaAvionesVolando {
    
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
    
    
    
    // PENDIENTE
    public void borraAvion(int id) { 
        
        
        if( listaVacia() ) {
        }else {
            
            Nodo aux = lista;
            
            while(aux.sig != null){
                
                if(aux.id == id){
                    
                    System.out.println("MATCH");
                    aux = aux.sig.sig;
                }
                
                aux = aux.sig;
            }
            
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
    
    
    
    public String retornaListaOrdenada() {
//        
//        Nodo temp = new Nodo();
//        Nodo aux = lista;
//        
//        String str = "";
//        
//        if( !listaVacia() ) {
//            while(aux != null){
//                
//                if (aux.piloto.compareToIgnoreCase(aux.sig.piloto) > 0) {
//                    
//                    temp = aux.sig;
//                    aux = aux.sig;
//                    t
//                    
////                    aux = aux.sig.sig;
////                    aux.sig = aux.ant;
//                    
//                }
//                
//                str += " ✈ ID: " + aux.id + " Modelo: " + aux.modelo + " Piloto: " + aux.piloto + " Pasajeros: " + aux.pasajeros + " Sobrecargos: " + aux.sobrecargos + "\n";
//                aux = aux.sig;
//            }
//        }
        return "adsad"; // str;
    }
    
    
    
}