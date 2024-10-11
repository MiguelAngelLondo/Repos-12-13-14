/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio14;

public class Productos {
    private String nombre;
    private double precio;
    private int cantidadStock;

    public Productos(String nombre, double precio, int cantidadStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio debe ser un valor positivo.");
        }
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        if (cantidadStock > 0) {
            this.cantidadStock = cantidadStock;
        } else {
            System.out.println("La cantidad debe ser positiva.");
        }
    }

    public void mostrarDetalles() {
        System.out.println("Nombre del producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad en stock: " + cantidadStock);
    }
}

    

