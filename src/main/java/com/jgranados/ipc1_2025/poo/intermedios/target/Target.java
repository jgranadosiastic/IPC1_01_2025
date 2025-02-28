/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.intermedios.target;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Target {
    
    public static final int PUNTEO_PARA_GANAR = 200;
    
    public static void main(String[] args) {
        Target target = new Target();
        target.iniciarJuego();
        
    }
    
    public void iniciarJuego() {
        int cantidadJugadores = preguntarCantidadJugadores();
        Jugador[] jugadores = crearJugadores(cantidadJugadores);
        Partida partida = new Partida(jugadores);
        
        partida.ejecutarPartida();
    }
    
    private int preguntarCantidadJugadores() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos jugadores?");
        
        int cantidadJugadores = Integer.parseInt(scanner.nextLine());
        
        return cantidadJugadores;
    }
    
    private Jugador[] crearJugadores(int cantidadJugadores) {
        Jugador[] jugadores = new Jugador[cantidadJugadores];
        
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < cantidadJugadores; i++) {
            System.out.printf("Ingrese nombre del jugador %d\n", i + 1);
            String nombre = scanner.nextLine();
            
            Jugador jugador = new Jugador(nombre);
            jugadores[i] = jugador;
        }
        
        return jugadores;
    }
    
}
