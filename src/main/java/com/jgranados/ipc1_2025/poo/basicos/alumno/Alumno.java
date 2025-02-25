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
    
    int[] notas;
    String cui;
    String nombre;
    
    
    float calcularPromedio() {
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
    
    void mostrarDatos() {
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
}
