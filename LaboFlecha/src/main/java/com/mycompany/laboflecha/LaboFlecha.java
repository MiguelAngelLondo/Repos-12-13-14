package com.mycompany.laboflecha;

public class LaboFlecha {
    
    Flecha flechaUno, flechaDos, flechaTres;

    public static void main(String[] args) {
        LaboFlecha instanciaPrincipal = new LaboFlecha();
    }

    public LaboFlecha() {
        flechaUno = new Flecha();
        flechaUno.construirFlecha();
        flechaUno.color="negro";
        flechaUno.imprimirSalto();
        
        flechaDos = new Flecha(); 
        flechaDos.construirFlecha();
        flechaDos.color="rojo";
        flechaDos.imprimirSalto();
        
        flechaTres = new Flecha(); 
        flechaTres.construirFlecha();
        flechaTres.color="negro";
        flechaTres.imprimirSalto();
    }
}
