/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.avanzado.pilasycolas.pila;

import com.jgranados.ipc1_2025.poo.avanzado.pilasycolas.pila.exceptions.PilaException;

/**
 *
 * @author jose
 */
public class Main {

    public static void main(String[] args) {
        Pila pila = new Pila(5);
        try {
            pila.apilar("Jose");
            pila.apilar("Mario");
            pila.apilar("Marta");
            pila.apilar("Pedro");
            pila.apilar("Alice");
            pila.apilar("pepe");
        } catch (PilaException e) {
            System.out.println(e.getMessage());
        }

        try {
            while (true) {
                String elemento = pila.desapilar();
                System.out.println(elemento);
            }
        } catch (PilaException e) {
            System.out.println(e.getMessage());
        }

    }
}
