package laboratorios_cristian;

import javax.swing.*;

public class Aplicacion_2 {
    public static void main(String[] args) {
        // Declaración de las variables para los lados
        double ladoA;
        double ladoB;

        // Llamada a la función para obtener los datos de los lados de la cancha
        ladoA = obtenerDatos("Introduce la longitud del lado A: ");
        ladoB = obtenerDatos("Introduce la longitud del lado B: ");
        
        // Cálculo del área de la cancha
        calcularArea(ladoA, ladoB);
    }

    /**
     * Función para obtener los datos de los lados de la cancha.
     * Recibe un mensaje para mostrar al usuario.
     */
    public static double obtenerDatos(String mensaje) {
        // Declaración de variables locales
        String entrada;
        double valor;
        
        // Obtención de datos desde la entrada del usuario
        entrada = JOptionPane.showInputDialog(null, mensaje);
        valor = Double.parseDouble(entrada);
        
        // Retorna el valor ingresado
        return valor;
    }

    // Método para calcular el área de la cancha
    public static void calcularArea(double a, double b) {
        // Variable que contendrá el resultado
        double area;
        
        // Cálculo del área
        area = a * b;
        
        // Presentación del resultado al usuario
        JOptionPane.showMessageDialog(null, "El área es: " + area);
    }
}
