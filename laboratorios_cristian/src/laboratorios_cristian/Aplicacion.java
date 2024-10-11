package laboratorios_cristian;

import javax.swing.*;

// Definición de la clase principal
public class Aplicacion {
    public static void main(String[] args) {
        
        // Declaración de variables
        String entradaUsuario;
        double ladoA;
        double ladoB;
        double area;
        
        // Solicitar al usuario la longitud del lado A
        entradaUsuario = JOptionPane.showInputDialog(null, "Introduce la longitud del lado A:");
        ladoA = Double.parseDouble(entradaUsuario);
        
        // Solicitar al usuario la longitud del lado B
        entradaUsuario = JOptionPane.showInputDialog(null, "Introduce la longitud del lado B:");
        ladoB = Double.parseDouble(entradaUsuario);
        
        // Calcular el área del rectángulo
        area = ladoA * ladoB;
        
        // Mostrar el resultado al usuario
        JOptionPane.showMessageDialog(null, "El resultado es: " + area);
    }
}
