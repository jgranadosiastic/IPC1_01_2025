/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.swing.target.backend;


import java.util.Random;

/**
 *
 * @author jose
 */
public class Partida {
    
    public static final int PUNTEO_PARA_GANAR = 200;

    private Jugador[] jugadores;
    private Jugador jugadorEnTurno;
    private int turno;

    public Partida(Jugador[] jugadores) {
        this.jugadores = jugadores;
        turno = 0;
        
        decidirPosiciones();
        jugadorEnTurno = obtenerJugadorInicial();
    }

    public Jugador obtenerGanador() {
        for (Jugador jugador : jugadores) {
            // revisar quien tiene 200 puntos
            if (jugador.esGanador()) {
                return jugador;
            }
        }

        return null;
    }

    private void decidirPosiciones() {

        Random random = new Random();
        int posicionInicial = random.nextInt(jugadores.length);
        Jugador jugadorIncial = jugadores[posicionInicial];
        for (int i = posicionInicial - 1; i >= 0; i--) {
            Jugador jugadorAMover = jugadores[i];
            jugadores[i + 1] = jugadorAMover;
        }
        jugadores[0] = jugadorIncial;

    }

    private Jugador obtenerJugadorInicial() {
        return jugadores[0];
    }
    
    public void cambiarJugador() {
        turno = turno + 1;
        if (turno >= jugadores.length) {
            turno = 0;
        }
        
        jugadorEnTurno = jugadores[turno];
    }

    public Jugador getJugadorEnTurno() {
        return jugadorEnTurno;
    }
    
    public boolean hayGanador() {
        return obtenerGanador() != null;
    }
}
