/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.avanzado.listasenlazadas.listasimplegenerica;

/**
 *
 * @author jose
 */
public class NodoGenerico<T> {
    private T contenido;
    private NodoGenerico siguiente;

    public NodoGenerico(T contenido) {
        this.contenido = contenido;
    }

    public T getContenido() {
        return contenido;
    }

    public void setContenido(T contenido) {
        this.contenido = contenido;
    }

    public NodoGenerico getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoGenerico siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
