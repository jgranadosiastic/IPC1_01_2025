/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.avanzado.listasenlazadas.listasimple;

/**
 *
 * @author jose
 */
public class ListaEnlazada {

    private Nodo inicio;
    private Nodo fin;
    private int tamaño;

    public ListaEnlazada() {
        tamaño = 0;
    }

    public void agregarAlFinal(String contenido) {
        Nodo nuevo = new Nodo(contenido);
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

    public String obtenerContenido(int index) throws ListaEnlazadaException {
        Nodo nodoBuscado = obtenerNodo(index);
        return nodoBuscado.getContenido();
    }

    private Nodo obtenerNodo(int index) throws ListaEnlazadaException {
        if (index < 0 || index >= tamaño) {
            throw new ListaEnlazadaException("El inidice esta fuera de rango, mula!");
        }
        Nodo actual = inicio;
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

            Nodo anterior = obtenerNodo(index - 1);
            Nodo nodoAEliminar = anterior.getSiguiente();
            Nodo siguiente = nodoAEliminar.getSiguiente();

            anterior.setSiguiente(siguiente);
        }
        tamaño--;
    }

    public void imprimirContenido() {
        if (!esVacia()) {
            Nodo actual = inicio;
            for (int i = 0; i < tamaño; i++) {
                System.out.println(String.format("Index: %d, contenido: %s", i, actual.getContenido()));
                actual = actual.getSiguiente();
            }
        } else {
            System.out.println("Lista vacia");
        }
    }

}
