/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.basicos;

/**
 *
 * @author jose
 */
public class UsoArgumentos {
    
    public static void main(String[] args) {
        System.out.println("Parametros iniciales");
        
        for (int i = 0; i < args.length; i++) {
            String argumento = args[i];
            System.out.println("argumento: " + argumento);
            
        }
        
    }
    
}
