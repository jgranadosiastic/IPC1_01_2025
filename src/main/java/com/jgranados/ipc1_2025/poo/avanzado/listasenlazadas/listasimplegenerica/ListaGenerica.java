/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.avanzado.listasenlazadas.listasimplegenerica;

import com.jgranados.ipc1_2025.poo.avanzado.listasenlazadas.listasimple.ListaEnlazadaException;
import com.jgranados.ipc1_2025.poo.avanzado.listasenlazadas.listasimple.Nodo;

/**
 *
 * @author jose
 */
public class ListaGenerica<T> {
    private NodoGenerico<T> inicio;
    private NodoGenerico<T> fin;
    private int tamaño;

    public ListaGenerica() {
        tamaño = 0;
    }

    public void agregarAlFinal(T contenido) {
        NodoGenerico<T> nuevo = new NodoGenerico(contenido);
        if (esVacia()) {
            inicio = nuevo;
        } else {
            fin.setSiguiente(nuevo);
        }
        fin = nuevo;
        tamaño++;
    }

    public boolean esVacia() {
        return inicio == null;
    }

    public T obtenerContenido(int index) throws ListaEnlazadaException {
        NodoGenerico<T> nodoBuscado = obtenerNodo(index);
        return nodoBuscado.getContenido();
    }

    private NodoGenerico<T> obtenerNodo(int index) throws ListaEnlazadaException {
        if (index < 0 || index >= tamaño) {
            throw new ListaEnlazadaException("El inidice esta fuera de rango, mula!");
        }
        NodoGenerico<T> actual = inicio;
        for (int i = 0; i <= index; i++) {
            actual = actual.getSiguiente();
        }
        return actual;
    }

    public void eliminar(int index) throws ListaEnlazadaException {
        if (index < 0 || index >= tamaño) {
            throw new ListaEnlazadaException("El inidice esta fuera de rango, mula!");
        }

        if (index == 0) {
            inicio = inicio.getSiguiente();

            if (inicio == null) {
                fin = null;
            }
        } else {

            NodoGenerico<T> anterior = obtenerNodo(index - 1);
            NodoGenerico<T> nodoAEliminar = anterior.getSiguiente();
            NodoGenerico<T> siguiente = nodoAEliminar.getSiguiente();

            anterior.setSiguiente(siguiente);
        }
        tamaño--;
    }

    public void imprimirContenido() {
        if (!esVacia()) {
            NodoGenerico<T> actual = inicio;
            for (int i = 0; i < tamaño; i++) {
                System.out.println(String.format("Index: %d, contenido: %s", i, actual.getContenido()));
                actual = actual.getSiguiente();
            }
        } else {
            System.out.println("Lista vacia");
        }
    }
}
