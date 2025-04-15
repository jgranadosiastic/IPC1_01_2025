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
public class Pila {
    
    private String[] elementos;
    private int topePila;

    public Pila(int tamaño) {
        elementos = new String[tamaño];
        topePila = -1;
    }
    
    
    public void apilar(String nombre) throws PilaException {
        if (estaLlena()) {
            throw new PilaException("La pila ya esta llena!");
        }
        elementos[topePila + 1] = nombre;
        topePila = topePila + 1;
    }
    
    public String desapilar() throws PilaException {
        if (estaVacia()) {
            throw new PilaException("La pila esta vacia, nada que desapilar!");
        }
        String elemento = elementos[topePila];
        
        topePila = topePila - 1;
        
        return elemento;
    }
    
    public String darVistazo() throws PilaException {
        if (estaVacia()) {
            throw new PilaException("La pila esta vacia, nada que ver!");
        }
        
        return elementos[topePila];
    }
    
    public boolean estaLlena() {
        return topePila == elementos.length - 1;
    }
    
    public boolean estaVacia() {
        return topePila == -1;
    }
}
