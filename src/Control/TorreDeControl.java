
package Control;

import Logica.ColaPistaAterrizaje;
import Logica.ColaPistaDespegue;
import Logica.ListaAviones;
import Logica.ListaAvionesVolando;
import Logica.Nodo;
import Logica.PilaHangar;
import Presentacion.JF_AgregarAleatorio;
import Presentacion.JF_AterrizarAvion;
import Presentacion.JF_Hangar;
import Presentacion.JF_PistaAterrizaje;
import Presentacion.JF_PistaDespegue;
import Presentacion.JF_menu;
import Presentacion.JF_listaAvionesEnVuelo;
import Presentacion.JF_AgregarManual;

public final class TorreDeControl {

    //instancias de colas y pilas
    private static final ListaAviones insLA = new ListaAviones();
    private static final ListaAvionesVolando insLAV = new ListaAvionesVolando();
    private static final ColaPistaAterrizaje insCPA = new ColaPistaAterrizaje();
    private static final ColaPistaDespegue insCPD = new ColaPistaDespegue();
    private static final PilaHangar insH = new PilaHangar();
    //instancias de JFrames
    private static final JF_menu insJFMenu = new JF_menu();    
    private static final JF_Hangar insJFH = new JF_Hangar();
    private static final JF_PistaAterrizaje insJFPA = new JF_PistaAterrizaje();
    private static final JF_PistaDespegue insJFPD = new JF_PistaDespegue();
    private static final JF_listaAvionesEnVuelo insJFLAV = new JF_listaAvionesEnVuelo();
    private static final JF_AterrizarAvion insJFA = new JF_AterrizarAvion();
    private static final JF_AgregarManual insAAM = new JF_AgregarManual();
    private static final JF_AgregarAleatorio insAAA = new JF_AgregarAleatorio();
    
    private static int ejecucion = 0;

    public TorreDeControl() {
        
        ejecucion++;
        
        if (ejecucion == 2) {
            creaBD();
            insJFMenu.setVisible(true);
        }
    }
    
    public int AvionesAleatorios(String centinela){
        
        int cantAviones = numeroAleatorio(10, 1);

        String modelo = ""; 
        String piloto = "";
        int pasajeros = numeroAleatorio(90, 300); 
        int sobrecargos = numeroAleatorio(4, 9);
        //int id = IDLibre();


        for(int i=0; i<cantAviones; i++){        
            
            // asigna un modelo al avion
            switch (numeroAleatorio(1, 5)){
                case 1:
                    modelo = "Bombardier CRJ 700";
                    break;
                case 2:
                    modelo = "Embraer Legacy 600";
                    break;
                case 3:
                    modelo = "Praetor - 500";
                    break;
                case 4:
                    modelo = "A350-900";
                    break;
                case 5:
                    modelo = "A318";
                    break;
                default:
                    break;
            }


            // asigna un nombre al piloto
            switch (numeroAleatorio(1, 10)){
                case 1:
                    piloto = "Alfredo";
                    break;
                case 2:
                    piloto = "Eduard";
                    break;
                case 3:
                    piloto = "Tatiana";
                    break;
                case 4:
                    piloto = "Miriam";
                    break;
                case 5:
                    piloto = "Anibal";
                    break;
                case 6:
                    piloto = "Abelardo";
                    break;
                case 7:
                    piloto = "Bernardo";
                    break;
                case 8:
                    piloto = "Nacho";
                    break;
                case 9:
                    piloto = "Aritz";
                    break;
                case 10:
                    piloto = "Maximiliano";
                    break;
                default:
                    break;
            }

            // asigna un apellido al piloto
            switch (numeroAleatorio(1, 10)){
                case 1:
                    piloto += " Diez";
                    break;
                case 2:
                    piloto += " Herrera";
                    break;
                case 3:
                    piloto += " Ferrer";
                    break;
                case 4:
                    piloto += " Santos";
                    break;
                case 5:
                    piloto += " Monge";
                    break;
                case 6:
                    piloto += " Beltran";
                    break;
                case 7:
                    piloto += " Lima";
                    break;
                case 8:
                    piloto += " Cubero";
                    break;
                case 9:
                    piloto += " Cortes";
                    break;
                case 10:
                    piloto += " Leiva";
                    break;
                default:
                    break;
            }
            
            int id = IDLibre();
            
            if(centinela.equals("Aleatorio")){
                // agrega el avion a la lista general de aviones
                insLA.agregaAvion(modelo, piloto, pasajeros, sobrecargos, id);
                // distribuye aleatoriamente el avion en una de las 4 listas, vuelo, hangar, aterrizaje o despegue
                distribuyeAvionesAleatoriamente(modelo, piloto, pasajeros, sobrecargos, id);
            }else{
                distribuyeAvionesManualmente(modelo, pasajeros, sobrecargos, piloto, id, centinela);
            }
        }
        return cantAviones;
    }

    public void distribuyeAvionesAleatoriamente(String modelo, String piloto, int pasajeros, int sobrecargos, int id) { // reparte los aviones en las diferentes areas aleatoriamente

            switch (numeroAleatorio(1, 4)) {
                case 1:
                    //insLAV.agregaAvion(aux.modelo, aux.piloto, aux.pasajeros, aux.sobrecargos, aux.id);
                    insLAV.agregaAvion(modelo, piloto, pasajeros, sobrecargos, id);
                    break;
                case 2:
                    //insCPA.agregaAvion(aux.modelo, aux.piloto, aux.pasajeros, aux.sobrecargos, aux.id);
                    insCPA.agregaAvion(modelo, piloto, pasajeros, sobrecargos, id);
                    break;
                case 3:
                    //insCPD.agregaAvion(aux.modelo, aux.piloto, aux.pasajeros, aux.sobrecargos, aux.id);
                    insCPD.agregaAvion(modelo, piloto, pasajeros, sobrecargos, id);
                    break;
                case 4:
                    //insH.agregaAvion(aux.modelo, aux.piloto, aux.pasajeros, aux.sobrecargos, aux.id);
                    insH.agregaAvion(modelo, piloto, pasajeros, sobrecargos, id);
                    break;
                default:
                    break;
            }
    }

    public int creaBD() {
        // Parametros: modelo del avion, nombre del piloto, catidad de pasajeros, cantidad de sobrecargos, ID del avion 
        insLA.agregaAvion("Boeing 747", "David Gisbert", numeroAleatorio(300, 90), numeroAleatorio(4, 9), 1);
        insLA.agregaAvion("Boeing 777", "Jesus Ali", numeroAleatorio(300, 90), numeroAleatorio(4, 9), 2);
        insLA.agregaAvion("Airbus A340", "Luciano Mayor", numeroAleatorio(300, 90), numeroAleatorio(4, 9), 3);
        insLA.agregaAvion("Boeing 767", "Joaquin Velez", numeroAleatorio(300, 90), numeroAleatorio(4, 9), 4);
        insLA.agregaAvion("Boeing 757", "Leonardo Valcarcel", numeroAleatorio(300, 90), numeroAleatorio(4, 9), 5);
        insLA.agregaAvion("Airbus A330", "Juan Mejia", numeroAleatorio(300, 90), numeroAleatorio(4, 9), 6);
        insLA.agregaAvion("Boeing 737", "Marcos Tamayo", numeroAleatorio(300, 90), numeroAleatorio(4, 9), 7);
        insLA.agregaAvion("McDonnell Douglas MD-80", "Emilio Iglesias", numeroAleatorio(300, 90), numeroAleatorio(4, 9), 8);
        insLA.agregaAvion("Embraer 170", "Miguel Verdu", numeroAleatorio(300, 90), numeroAleatorio(4, 9), 9);
        insLA.agregaAvion("Airbus A320", "Celestino Badia", numeroAleatorio(300, 90), numeroAleatorio(4, 9), 10);
        insLA.agregaAvion("Boeing 747", "Antoni Manzanares", numeroAleatorio(300, 90), numeroAleatorio(4, 9), 11);
        insLA.agregaAvion("Boeing 777", "Hector Guillen", numeroAleatorio(300, 90), numeroAleatorio(4, 9), 12);
        insLA.agregaAvion("Airbus A340", "Andres Villa", numeroAleatorio(300, 90), numeroAleatorio(4, 9), 13);
        insLA.agregaAvion("Boeing 767", "Carlos Barbero", numeroAleatorio(300, 90), numeroAleatorio(4, 9), 14);
        insLA.agregaAvion("Boeing 757", "Antoni Santamaria", numeroAleatorio(300, 90), numeroAleatorio(4, 9), 15);
        insLA.agregaAvion("Airbus A330", "Jose Neira", numeroAleatorio(300, 90), numeroAleatorio(4, 9), 16);
        insLA.agregaAvion("Boeing 737", "Jacobo Salgado", numeroAleatorio(300, 90), numeroAleatorio(4, 9), 17);
        insLA.agregaAvion("McDonnell Douglas MD-80", "Ramon Vivas", numeroAleatorio(300, 90), numeroAleatorio(4, 9), 18);
        insLA.agregaAvion("Embraer 170", "Roberto Tapia", numeroAleatorio(300, 90), numeroAleatorio(4, 9), 19);
        insLA.agregaAvion("Airbus A320", "Jaime Duque", numeroAleatorio(300, 90), numeroAleatorio(4, 9), 20);
        insLA.agregaAvion("Boeing 747", "Lorenzo Camino", numeroAleatorio(300, 90), numeroAleatorio(4, 9), 21);
        insLA.agregaAvion("Boeing 777", "Felix Quintana", numeroAleatorio(300, 90), numeroAleatorio(4, 9), 22);
        insLA.agregaAvion("Airbus A340", "Kevin Giraldo", numeroAleatorio(300, 90), numeroAleatorio(4, 9), 23);
        insLA.agregaAvion("Boeing 767", "Adolfo Castañeda", numeroAleatorio(300, 90), numeroAleatorio(4, 9), 24);
        insLA.agregaAvion("McDonnell Douglas MD-80", "Brahim Montoya", numeroAleatorio(300, 90), numeroAleatorio(4, 9), 25);

        // borra los nodos extras (25 - calculo random)
        int cont = 0;
        int random = numeroAleatorio(25, 10);

        Nodo aux = insLA.lista;

        do {
            cont++;
            if (cont == random) {
                aux.sig = null;
            }
            aux = aux.sig;
        } while (cont != random);
        
        // distribuye los aviones en las diferentes areas
        Nodo aux2 = insLA.lista;
        while(aux2!=null){
            distribuyeAvionesAleatoriamente(aux2.modelo, aux2.piloto, aux2.pasajeros, aux2.sobrecargos, aux2.id);
            aux2 = aux2.sig;
        }
        
        return random;
    }

    public int numeroAleatorio(int max, int min) {
        max--;
        min++;
        int randomRangePlanes = (int) (Math.random() * ((max + 1) - min) + min);
        return randomRangePlanes;
    }

    public int IDLibre(){
        return insLA.getLastNode().id + 1;
    }

    public String imprimeAvionesVolando2() {
        return insLAV.retornaLista2();
    }

    public String imprimeAvionesPistaAterrizaje2() {
        return insCPA.retornaLista2();
    }

    public String imprimeAvionesPistaDespegue2() {
        return insCPD.retornaLista2();
    }

    public String imprimeAvionesHangar2() {
        return insH.retornaLista2();
    }
    
    public String imprimeTotalDeAviones() {
        return "" + insLA.size();
    }

    public Nodo retornaListaAvionesVolando() {
        return insLAV.listaOrdenada();
    }
    
    public Nodo retornaListaAvionesVolando2() {
        return insLAV.listaOrdenada();
    }

    public Nodo retornaListaPistaDespegue() {
        return insCPD.lista;
    }

    public Nodo retornaPilaHangar() {
        return insH.lista;
    }

    public Nodo retornaListaPistaAterrizaje() {
        return insCPA.lista;
    }

    public boolean despegar() {

        if (!insCPD.listaVacia()) {

            insLAV.agregaAvion(insCPD.lista.modelo, insCPD.lista.piloto, insCPD.lista.pasajeros, insCPD.lista.sobrecargos, insCPD.lista.id);
            insCPD.borrarAlInicio();
            return true;
        } else {           
            return false;
        }
    }

    public void aterrizar(int index) {

        // agregar el avion a la pista de aterrizaje
        Nodo nTemp = insLAV.getByIndex(index);

        insCPA.agregaAvion(nTemp.modelo, nTemp.piloto, nTemp.pasajeros, nTemp.sobrecargos, nTemp.id);
        // borra el avion de la lista de aviones volando
        insLAV.deleteByIndex(index);
    }

    public boolean atterizarValida() {
        return insLAV.listaVacia();
    }

    public boolean hangarAPistaDespegue() {

        if (!insH.listaVacia()) {

            insCPD.agregaAvion(insH.retornaNodo().modelo, insH.retornaNodo().piloto, insH.retornaNodo().pasajeros, insH.retornaNodo().sobrecargos, insH.retornaNodo().id);
            insH.eliminar();
            return true;
        } else {
            return false;
        }

    }

    public boolean DePistaAterrizajeAHangar() {

        if (!insCPA.listaVacia()) {

            insH.agregaAvion(insCPA.lista.modelo, insCPA.lista.piloto, insCPA.lista.pasajeros, insCPA.lista.sobrecargos, insCPA.lista.id);
            insCPA.borrarAlInicio();
            return true;
        } else {
            return false;           
        }
    }

    public int retornaTamAvionesVolando() {
        return insLAV.getLength();
    }

    public void actualizaInformacion() {

        insJFMenu.llenaEtiquetasAviones();
        insJFH.llenaTabla(insH.lista);
        insJFPA.llenaTabla(insCPA.lista);
        insJFPD.llenaTabla(insCPD.lista);
        insJFLAV.llenaTabla(insLAV.listaOrdenada());
        insJFA.llenaCB();
    }

    public void distribuyeAvionesManualmente(String modelo, int pasajeros, int sobrecargos, String nombre, int id, String centinela) {

        switch (centinela) {

            case "Hangar": // hangar
                insH.agregaAvion(modelo, nombre, pasajeros, sobrecargos, id);
                insLA.agregaAvion(modelo, nombre, pasajeros, sobrecargos, id);
                break;
            case "Pista de Aterrizaje": // pista de aterrizaje
                insCPA.agregaAvion(modelo, nombre, pasajeros, sobrecargos, id);
                insLA.agregaAvion(modelo, nombre, pasajeros, sobrecargos, id);
                break;
            case "Pista de Despegue": // pista de despegue
                insCPD.agregaAvion(modelo, nombre, pasajeros, sobrecargos, id);
                insLA.agregaAvion(modelo, nombre, pasajeros, sobrecargos, id);
                break;
            case "En Vuelo": // aviones volando
                insLAV.agregaAvion(modelo, nombre, pasajeros, sobrecargos, id);
                insLA.agregaAvion(modelo, nombre, pasajeros, sobrecargos, id);
                break;
        }
    }

    public void abreJFHangar(){
        insJFH.setLocationRelativeTo(null);
        insJFH.setVisible(true);
    }
    
    public void abreJFAterrizaje(){
        insJFPA.setLocationRelativeTo(null);
        insJFPA.setVisible(true);
        
    }
    public void abreJFDespegue(){
        insJFPD.setLocationRelativeTo(null);
        insJFPD.setVisible(true);
        
    }
    
    public void abreJFAvionesEnVuelo() {
        insJFLAV.setLocationRelativeTo(null);
        insJFLAV.setVisible(true);
    }

    public void abreJFAterrizar() {
        insJFA.setLocationRelativeTo(null);
        insJFA.setVisible(true);
        
    }

    public void agregaAvionManual() {
        insAAM.setVisible(true);
        insAAM.setLocationRelativeTo(null);
    }

    public void actualizaEtiquetaID() {
        insAAM.actualizaEtiquetaID();
    }

    public void abreJFAgregaAleatorio() {
        insAAA.setVisible(true);
        insAAA.setLocationRelativeTo(null);
    }

}
