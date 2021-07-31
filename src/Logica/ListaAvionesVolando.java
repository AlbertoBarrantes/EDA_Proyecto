
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
    
    
    
    public Nodo listaOrdenada(){
        
        Nodo temp1 = new Nodo();
        Nodo aux;
        Nodo aux2;
        aux2 = lista;
        
        aux = lista;
        while(aux != null){
            
            aux2 = lista;
            while(aux2 != null){

                if(aux2.sig != null){ 
                    if((aux2.piloto).compareToIgnoreCase(aux2.sig.piloto) > 0){
                        temp1.id = aux2.id;
                        temp1.modelo = aux2.modelo;
                        temp1.pasajeros = aux2.pasajeros;
                        temp1.piloto = aux2.piloto;
                        temp1.sobrecargos = aux2.sobrecargos;
                        
                        aux2.id = aux2.sig.id;
                        aux2.modelo = aux2.sig.modelo;
                        aux2.pasajeros = aux2.sig.pasajeros;
                        aux2.piloto = aux2.sig.piloto;
                        aux2.sobrecargos = aux2.sig.sobrecargos;
                        
                        aux2.sig.id = temp1.id;
                        aux2.sig.modelo = temp1.modelo;
                        aux2.sig.pasajeros = temp1.pasajeros;
                        aux2.sig.piloto = temp1.piloto;
                        aux2.sig.sobrecargos = temp1.sobrecargos;
                    }
                }
                aux2 = aux2.sig;
            }
            aux = aux.sig;
        }
        aux2=lista;
        return aux2;
    }

    
    
    public int getLength() {
        
        int contador = 0;
        
        if( listaVacia() ) {
            return 0;
        }else{
            
            
            Nodo aux = lista;
            
            while(aux != null){
                contador++;
                aux = aux.sig;
            }
        }
        return contador;
    }
    
    
    
    public Nodo getByIndex(int index) {
        
        Nodo aux = lista;
        Nodo nNull = new Nodo();
        
        if( listaVacia() ) {
            return nNull;
        }else{
            for (int i = 0; i < index; i++) {
                aux = aux.sig;
            }
            return aux;
        }
    }

    public void deleteByIndex(int index) {
        
        if(lista != null){
            if(lista.sig == null){
                lista = null;
            }else{
                Nodo aux = lista;
                
                if(index == 0){
                    lista = lista.sig;
                }else{

                    int contador = 0;
                    while(contador != index-1){
                        aux = aux.sig;
                        contador++;
                    }
                    if(aux.sig.sig == null){
                        aux.sig = null;
                    }else{
                        aux.sig = aux.sig.sig;
                    }
                }
            }
        }
        
        
        
    }
    
    
    
    
}