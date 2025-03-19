/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.intermedios.target;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Partida {

    private Jugador[] jugadores;
    private int turno;

    public Partida(Jugador[] jugadores) {
        this.jugadores = jugadores;
        turno = 0;
    }

    private Jugador obtenerGanador() {
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

    public void ejecutarPartida() {
        Scanner scanner = new Scanner(System.in);
        // definir posiciones
        decidirPosiciones();
        // saber quien es el jugador que inicia
        Jugador jugadorEnTurno = obtenerJugadorInicial();
        
        // se repite hasta que haya ganador
        do {
            // se muestra el nombre del jugador en turno
            System.out.println("Jugador en turno: " + jugadorEnTurno.obtenerNombre());
            
            // el jugador selecciona el tiro
            // el jugador hace el tiro
            // se muestran puntos del jugador
            jugadorEnTurno.lanzar();
            
            // cambiamos de turno
            jugadorEnTurno = cambiarJugador();
            System.out.println("Presione ENTER para continuar ya que el juego termina cuando alguien alcance el punteo de: " + Target.PUNTEO_PARA_GANAR);
            scanner.nextLine();
        } while (obtenerGanador() == null);
        
        // cuando haya ganador mostramos los datos del ganador
        mostrarGanador();
        
    }

    private void mostrarGanador() {
        Jugador ganador = obtenerGanador();
        System.out.printf("El ganador es el jugador %s, con un punteo de %d puntos",
                ganador.obtenerNombre(),
                ganador.obtenerPunteo());
    }
    
    private Jugador cambiarJugador() {
        turno = turno + 1;
        if (turno >= jugadores.length) {
            turno = 0;
        }
        
        return jugadores[turno];
    }
}
