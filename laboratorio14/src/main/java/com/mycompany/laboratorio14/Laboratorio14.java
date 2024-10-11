/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laboratorio14;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class Laboratorio14 {

    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        ArrayList<Productos> productos = new ArrayList<>();
        
        productos.add(new Productos("hamburguesa", 100, 50));
        productos.add(new Productos("salchipapa", 7000, 10));
        productos.add(new Productos("cocacola", 5000, 5));
        
        for (Productos producto : productos) {
            producto.mostrarDetalles();
            System.out.println("*********************************************");
        }

        productos.get(0).setPrecio(300);
        productos.remove(2);
        
        String nombreConsulta = JOptionPane.showInputDialog("Ingrese el nombre del producto");
        Productos productoEncontrado = buscarProducto(productos, nombreConsulta);
    }

    public static Productos buscarProducto(ArrayList<Productos> productos, String nombreConsulta) {
        for (Productos producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombreConsulta)) {
                System.out.println("Producto encontrado: ");
                producto.mostrarDetalles();
                return producto;
            }
        }
        System.out.println("Producto no encontrado.");
        return null;
    }
}

    

