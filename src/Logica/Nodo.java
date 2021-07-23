
package Logica;

public class Nodo {
    
    public Nodo sig, ant;
    public String modelo, piloto;
    public int pasajeros, sobrecargos, id;

    public Nodo(){
        this.sig = null;
        this.ant = null;
    }
    

    public Nodo(String modelo, String piloto, int pasajeros, int sobrecargos, int id) {
        this.sig = null;
        this.ant = null;
        this.modelo = modelo;
        this.piloto = piloto;
        this.pasajeros = pasajeros;
        this.sobrecargos = sobrecargos;
        this.id = id;
    }
}
