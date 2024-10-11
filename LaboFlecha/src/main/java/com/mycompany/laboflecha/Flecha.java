package com.mycompany.laboflecha;

import javax.swing.JOptionPane;

public class Flecha {
    int longitudCuerda;
    String color;

    public Flecha() {
        longitudCuerda = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud de la cuerda:"));
        color = "negro";
    }

    public void construirFlecha() {
        for (int i = 0; i < longitudCuerda; i++) {
           
      imprime("-");
        }
        imprime(">"); 
    }

    void imprime(String simbolo) {
        if (color.equalsIgnoreCase("negro")) {
            System.out.print(simbolo);
        } else {
            System.err.print(simbolo); 
        }
    }

    public void imprimirSalto() {
        System.out.println();
    }
}
