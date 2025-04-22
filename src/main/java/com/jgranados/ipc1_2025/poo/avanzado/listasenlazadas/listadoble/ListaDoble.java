/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.avanzado.listasenlazadas.listadoble;

import com.jgranados.ipc1_2025.poo.avanzado.listasenlazadas.listasimple.ListaEnlazadaException;

/**
 *
 * @author jose
 */
public class ListaDoble<T> {

    private NodoDoble<T> inicio;
    private NodoDoble<T> fin;
    private int tamaño = 0;

    public void agregar(int index, T contenido) throws ListaEnlazadaException {
        NodoDoble<T> nuevo = new NodoDoble<>(contenido);
        if (esVacia()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            if (index < 0 || index >= tamaño) {
                throw new ListaEnlazadaException("El inidice esta fuera de rango, mula!");
            }

            if (index == 0) {
                nuevo.setSiguiente(inicio);
                inicio.setAnterior(nuevo);

                inicio = nuevo;
            } else if (index == tamaño - 1) {
                nuevo.setAnterior(fin);
                fin.setSiguiente(nuevo);

                fin = nuevo;
            } else {
                NodoDoble<T> nodoAReemplazar = obtenerNodo(index);
                NodoDoble<T> anterior = nodoAReemplazar.getAnterior();
                anterior.setSiguiente(nuevo);
                nuevo.setAnterior(anterior);

                nuevo.setSiguiente(nodoAReemplazar);
                nodoAReemplazar.setAnterior(nuevo);

            }
        }
        tamaño++;
    }

    public boolean esVacia() {
        return tamaño == 0;
    }

    private NodoDoble<T> obtenerNodo(int index) throws ListaEnlazadaException {
        if (index < 0 || index >= tamaño) {
            throw new ListaEnlazadaException("El inidice esta fuera de rango, mula!");
        }

        if (index <= tamaño / 2) {
            NodoDoble<T> actual = inicio;
            for (int i = 0; i <= index; i++) {
                actual = actual.getSiguiente();
            }
            return actual;
        } else {
            int indiceFinal = tamaño - 1;
            int pasos = indiceFinal - index;
            
            NodoDoble<T> actual = fin;
            for (int i = 0; i < pasos; i++) {
                actual = actual.getAnterior();                
            }
            
            return actual;
        }
    }

}
