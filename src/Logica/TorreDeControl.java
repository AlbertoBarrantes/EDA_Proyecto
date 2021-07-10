
package Logica;

public final class TorreDeControl {
    
    private static final ListaAviones insLA = new ListaAviones();
    private static final ListaAvionesVolando insLAV = new ListaAvionesVolando();
    private static final ColaPistaAterrizaje insCPA = new ColaPistaAterrizaje();
    private static final ColaPistaDespegue insCPD = new ColaPistaDespegue();
    private static final PilaHangar insPA = new PilaHangar();
    
    public TorreDeControl(){
        
    }
    
    
    
    public void imprimeEnConsola() {
        
        imprimeAvionesVolando();
        imprimeAvionesPistaAterrizaje();
        imprimeAvionesPistaDespegue();
        imprimeAvionesHangar();
        imprimeTodosLosAviones();
    }
    
    
    
    public void distribuyeAviones(){
        
        int estadoAleatorio;
        
        for (Nodo aux = insLA.lista; aux != null; aux = aux.sig) {
            estadoAleatorio = estadoAleatorioDelAvion();
        
            switch ( estadoAleatorio ){
                case 1: 
                    insLAV.agregaAvion( aux.modelo,aux.piloto, aux.pasajeros, aux.sobrecargos, aux.id);
                    break;
                case 2: 
                    insCPA.agregaAvion( aux.modelo,aux.piloto, aux.pasajeros, aux.sobrecargos, aux.id);
                    break;
                case 3: 
                    insCPD.agregaAvion( aux.modelo,aux.piloto, aux.pasajeros, aux.sobrecargos, aux.id);
                    break;
                case 4: 
                    insPA.agregaAvion( aux.modelo,aux.piloto, aux.pasajeros, aux.sobrecargos, aux.id);
                    break;
                default: 
                    break;
            }
        }
    }
    
    
    
    public int estadoAleatorioDelAvion() {
        int min = 0;
        int max = 5;
        int randomN = (int)( Math.random()* ((min+1) - max) + max );
        
        return randomN;
    }
    
    
    
    public int creaBD() {
        
        insLA.agregaAvion("Boeing 747", "David Gisbert", 155, 5, 1);
        insLA.agregaAvion("Boeing 777","Jesus Ali",205,4,2);
        insLA.agregaAvion("Airbus A340","Luciano Mayor",177,5,3);
        insLA.agregaAvion("Boeing 767","Joaquin Velez",220,4,4);
        insLA.agregaAvion("Boeing 757","Leonardo Valcarcel",206,3,5);
        insLA.agregaAvion("Airbus A330","Juan Mejia",160,6,6);
        insLA.agregaAvion("Boeing 737","Marcos Tamayo",123,5,7);
        insLA.agregaAvion("McDonnell Douglas MD-80","Emilio Iglesias",148,4,8);
        insLA.agregaAvion("Embraer 170"," Miguel Verdu",202,3,9);
        insLA.agregaAvion("Airbus A320","Celestino Badia",195,4,10);
        insLA.agregaAvion("Boeing 747","Antoni Manzanares",171,4,11);
        insLA.agregaAvion("Boeing 777","Hector Guillen",195,4,12);
        insLA.agregaAvion("Airbus A340","Andres Villa",166,3,13);
        insLA.agregaAvion("Boeing 767","Carlos Barbero",144,2,14);
        insLA.agregaAvion("Boeing 757","Antoni Santamaria",222,5,15);
        insLA.agregaAvion("Airbus A330","Jose Neira",200,5,16);
        insLA.agregaAvion("Boeing 737","Jacobo Salgado",160,4,17);
        insLA.agregaAvion("McDonnell Douglas MD-80","Ramon Vivas",155,3,18);
        insLA.agregaAvion("Embraer 170","Roberto Tapia",151,3,19);
        insLA.agregaAvion("Airbus A320","Jaime Duque",153,3,20);
        insLA.agregaAvion("Boeing 747","Lorenzo Camino",169,3,21);
        insLA.agregaAvion("Boeing 777","Felix Quintana",174,4,22);
        insLA.agregaAvion("Airbus A340","Kevin Giraldo",110,3,23);
        insLA.agregaAvion("Boeing 767","Adolfo Castañeda",120,2,24);
        insLA.agregaAvion("McDonnell Douglas MD-80","Brahim Montoya",111,2,25);
        
        // borra los nodos extras (25 - calculo random)
        int cont = 0;
        int random = cantidadAleatoriaDeAviones();
        System.out.println("[" + random + " aviones generados aleatoriamente]");
        
        Nodo aux = insLA.lista;
        
        do{
            cont++;
            if( cont == random ){
                aux.sig = null;
            }
            aux = aux.sig;
        }while( cont != random );
        return random;
    }
    
    
    public int cantidadAleatoriaDeAviones(){

        int max = 25;
        int min = 10;
        int randomRangePlanes = (int)( Math.random()* ((max+1) - min) + min );
        
        return randomRangePlanes;
    }
    
    
    
    public void imprimeAvionesVolando() {
        System.out.println("★★★★★★★★★★★★★★★★★★★★★"
                + "\nAVIONES VOLANDO"
                + "\n" + insLAV.retornaLista()
                + "★★★★★★★★★★★★★★★★★★★★★" );
    }
    public String imprimeAvionesVolando2() {
        return insLAV.retornaLista2();
    }
    
    
    
    public void imprimeAvionesPistaAterrizaje() {
        System.out.println("★★★★★★★★★★★★★★★★★★★★★"
                + "\nAVIONES EN PISTA DE ATERRIZAJE"
                + "\n" + insCPA.retornaLista()
                + "★★★★★★★★★★★★★★★★★★★★★" );
    }
    public String imprimeAvionesPistaAterrizaje2() {
        return insCPA.retornaLista2();
    }
        
        
        
    public void imprimeAvionesPistaDespegue() {
        System.out.println("★★★★★★★★★★★★★★★★★★★★★"
                + "\nAVIONES EN PISTA DE DESPEGUE"
                + "\n" + insCPD.retornaLista()
                + "★★★★★★★★★★★★★★★★★★★★★" );
    }
    public String imprimeAvionesPistaDespegue2() {
        return insCPD.retornaLista2();
    }
    
    
    
    public void imprimeAvionesHangar() {
        System.out.println("★★★★★★★★★★★★★★★★★★★★★"
                + "\nAVIONES EN EL HANGAR"
                + "\n" + insPA.retornaLista()
                + "★★★★★★★★★★★★★★★★★★★★★" );
    }
    public String imprimeAvionesHangar2() {
        return insPA.retornaLista2();
    }
        
    
        
    public void imprimeTodosLosAviones() {
        
        System.out.println("★★★★★★★★★★★★★★★★★★★★★"
                + "\nTODOS LOS AVIONES"
                + "\n" + insLA.retornaLista()
                + "★★★★★★★★★★★★★★★★★★★★★" );
    }
    
    
    
}