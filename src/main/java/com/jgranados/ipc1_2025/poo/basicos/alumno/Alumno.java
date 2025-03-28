/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.basicos.alumno;

/**
 *
 * @author jose
 */
public class Alumno {
    
    private int[] notas;
    private String cui;
    private String nombre;
    
    public Alumno(String cui, String nombre, int[] notas) {
        this.cui = cui;
        this.nombre = nombre;
        this.notas = notas;
    }
    
    public void cambiarNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerCui() {
        return cui;
    }
    
    
    public float calcularPromedio() {
        /*float total = notas[0] + notas[1] + notas[2];
        
        return total / 3;*/
        float total = 0f;
        int i;
        for (i = 0; i < notas.length; i++) {
            total = total + notas[i];
        }
        
        // return total / (i + 1);
        return total / notas.length;
    }
    
    public void mostrarDatos() {
        float promedio = calcularPromedio();
        System.out.println("CUI: " + cui);
        System.out.println("Nombre: " + nombre);
        System.out.println("Nota promedio: " + promedio);
        
        if (calcularPromedio() >= 61) {
            System.out.println("El alumno aprobo");
        } else {
            System.out.println("El alumno no aprobo");
        }
    }
    
    public void mostrarDatosSinNotas() {
        System.out.println("CUI: " + cui);
        System.out.println("Nombre: " + nombre);    }
    
    public boolean esCUIIgual(String cui) {
        return this.cui.equals(cui);
    }
}
