/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.basicos.alumno;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Main {
    
    public static void main(String[] args) {
        String cui;
        String nombre;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el CUI");
        cui = scanner.nextLine();
        
        System.out.println("Ingrese el Nombre");
        nombre = scanner.nextLine();
        
        int notas[] = capturarNotas();
        
        Alumno alumno = new Alumno(cui, nombre, notas);
        /*alumno.cui = cui;
        alumno.nombre = nombre;
        alumno.notas = notas;*/
        
        alumno.mostrarDatos();
    }
    
    static int[] capturarNotas() {
        int[] notas = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese una nota");
            notas[i] = Integer.parseInt(scanner.nextLine());
        }
        
        return notas;
    }
}
