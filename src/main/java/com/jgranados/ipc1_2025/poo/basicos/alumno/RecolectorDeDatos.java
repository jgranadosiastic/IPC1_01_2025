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
public class RecolectorDeDatos {
    
    
    String recolectarCui() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el CUI");
        return scanner.nextLine();
    }
    
    String recolectarNombre() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre");
        return scanner.nextLine();
    }
    
    int[] capturarNotas() {
        int[] notas = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese una nota");
            notas[i] = Integer.parseInt(scanner.nextLine());
        }
        
        return notas;
    }
}
