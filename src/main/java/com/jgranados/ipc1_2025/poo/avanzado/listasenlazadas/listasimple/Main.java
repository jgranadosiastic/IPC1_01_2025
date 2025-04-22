/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.avanzado.listasenlazadas.listasimple;

/**
 *
 * @author jose
 */
public class Main {
    
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        
        
        lista.imprimirContenido();
        
        lista.agregarAlFinal("a");
        
        lista.imprimirContenido();
        
        lista.agregarAlFinal("b");
        lista.agregarAlFinal("c");
        
        lista.imprimirContenido();
        try {
            lista.eliminar(0);
            lista.eliminar(0);
            lista.eliminar(0);
            //lista.eliminar(0);
            lista.imprimirContenido();
        } catch (ListaEnlazadaException e) {
            e.printStackTrace();
        }
        
    }
    
}
