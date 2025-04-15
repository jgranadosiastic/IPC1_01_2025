/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.avanzado.genericas.object;

import com.jgranados.ipc1_2025.poo.avanzado.pilasycolas.cola.exceptions.ColaException;

/**
 *
 * @author jose
 */
public class ColaObjectos {
    private Object[] elementos;
    private int ultimaPosicion;

    public ColaObjectos(int tamaño) {
        elementos = new Object[tamaño];
        ultimaPosicion = -1;
    }
    
    
    public void agregarACola(Object elemento) throws ColaException {
        if (estaLlena()) {
            throw new ColaException("La cola ya esta llena");
        }
        elementos[ultimaPosicion + 1] = elemento;
        ultimaPosicion = ultimaPosicion + 1;
    }
    
    public Object sacarDeCola() throws ColaException {
        if (estaVacia()) {
            throw new ColaException("La cola esta vacia, nada que sacar!");
        }
        Object elemento = elementos[0];
        
        for (int i = 1; i <= ultimaPosicion; i++) {
            Object elementoDetraz = elementos[i];
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
