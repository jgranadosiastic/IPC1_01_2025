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
public class Cola {
    private String[] elementos;
    private int ultimaPosicion;

    public Cola(int tamaño) {
        elementos = new String[tamaño];
        ultimaPosicion = -1;
    }
    
    
    public void agregarACola(String nombre) throws ColaException {
        if (estaLlena()) {
            throw new ColaException("La cola ya esta llena");
        }
        elementos[ultimaPosicion + 1] = nombre;
        ultimaPosicion = ultimaPosicion + 1;
    }
    
    public String sacarDeCola() throws ColaException {
        if (estaVacia()) {
            throw new ColaException("La cola esta vacia, nada que sacar!");
        }
        String elemento = elementos[0];
        
        for (int i = 1; i <= ultimaPosicion; i++) {
            String elementoDetraz = elementos[i];
            elementos[i - 1] = elementoDetraz;
        }
        
        ultimaPosicion = ultimaPosicion - 1;
        
        return elemento;
    }
    
    public boolean estaLlena() {
        return ultimaPosicion == elementos.length - 1;
    }
    
    public boolean estaVacia() {
        return ultimaPosicion == -1;
    }
    
}
