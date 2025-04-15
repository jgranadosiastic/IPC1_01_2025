/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.avanzado.pilasycolas.cola;

import com.jgranados.ipc1_2025.poo.avanzado.pilasycolas.cola.exceptions.ColaException;

/**
 *
 * @author jose
 */
public class Main {
    
    public static void main(String[] args) {
        Cola cola = new Cola(5);
        try {
            cola.agregarACola("Jose");
            cola.agregarACola("Mario");
            cola.agregarACola("Marta");
            cola.agregarACola("Pedro");
            cola.agregarACola("Alice");
            cola.agregarACola("pepe");
        } catch (ColaException e) {
            System.out.println(e.getMessage());
        }

        try {
            while (true) {
                String elemento = cola.sacarDeCola();
                System.out.println(elemento);
            }
        } catch (ColaException e) {
            System.out.println(e.getMessage());
        }
    }
}
