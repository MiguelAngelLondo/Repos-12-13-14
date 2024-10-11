package laboratorios_cristian;

import javax.swing.JOptionPane;

public class Entidad {
    // Variables privadas para almacenar las dimensiones del rectángulo
    private double ladoA;
    private double ladoB;

    // Método para solicitar y almacenar las longitudes de los lados
    public void recogerDatos() {
        String entrada;
        
        // Solicitar longitud del lado A
        entrada = JOptionPane.showInputDialog(null, "Introduce la longitud del lado A: ");
        ladoA = Double.parseDouble(entrada);
        
        // Solicitar longitud del lado B
        entrada = JOptionPane.showInputDialog(null, "Introduce la longitud del lado B: ");
        ladoB = Double.parseDouble(entrada);
    }

    // Método para calcular y mostrar el área del rectángulo
    public void calcularArea() {
        double area = ladoA * ladoB;
        JOptionPane.showMessageDialog(null, "El área es: " + area);
    }
}
