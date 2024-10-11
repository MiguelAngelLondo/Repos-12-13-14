/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio14;


public class Empleado {
    private String nombreCompleto;
    private double sueldoMensual;

    public Empleado(String nombreCompleto, double sueldoMensual) {
        this.nombreCompleto = nombreCompleto;
        this.sueldoMensual = sueldoMensual;
    }

    public String obtenerNombreCompleto() {
        return nombreCompleto;
    }

    public void establecerNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public double obtenerSueldoMensual() {
        return sueldoMensual;
    }

    public void establecerSueldoMensual(double sueldoMensual) {
        if (sueldoMensual > 0) {
            this.sueldoMensual = sueldoMensual;
        } else {
            System.out.println("El sueldo debe ser un valor positivo.");
        }
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombreCompleto);
        System.out.println("Sueldo: $" + sueldoMensual);
    }
}

