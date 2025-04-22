/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.avanzado.listasenlazadas.listasimplegenerica;

import com.jgranados.ipc1_2025.poo.intermedios.target.Jugador;

/**
 *
 * @author jose
 */
public class Main {
    
    public static void main(String[] args) {
        ListaGenerica<String> listaStr = new ListaGenerica<>();
        listaStr.agregarAlFinal("a");
        listaStr.agregarAlFinal("b");
        listaStr.agregarAlFinal("c");
        listaStr.imprimirContenido();
        
        ListaGenerica<Jugador> listaJugadores = new ListaGenerica<>();
        listaJugadores.agregarAlFinal(new Jugador("jose"));
        listaJugadores.agregarAlFinal(new Jugador("Pedro"));
        listaJugadores.agregarAlFinal(new Jugador("Marta"));
        listaJugadores.imprimirContenido();
    }
}
