package laboratorios_cristian;

import javax.swing.*;

public class Numeros {
    int numero; // Variable para almacenar el número ingresado
    int i, negativos = 0, pares = 0; // Contadores para negativos y pares

    /**
     * Método para solicitar números y clasificarlos como negativos o pares.
     */
    public void entrada() {
        for (int i = 0; i < 5; i++) {
            numero = obtenerNumero("Introduce un número:"); // Llama al método para ingresar datos
            // Condiciones para contar pares y negativos
            if (numero % 2 == 0) {
                pares++;
            }
            if (numero < 0) {
                negativos++;
            }
        }
        // Muestra el resultado de los conteos
        JOptionPane.showMessageDialog(null, "Cantidad de números pares: " + pares + "\n" +
                                          "Cantidad de números negativos: " + negativos);
    }

    /**
     * Método que solicita un número y lo retorna.
     */
    public static int obtenerNumero(String mensaje) {
        String entrada;
        int valor;
        // Solicita el dato al usuario
        entrada = JOptionPane.showInputDialog(null, mensaje);
        valor = Integer.parseInt(entrada);
        // Devuelve el valor ingresado
        return valor;
    }
}
