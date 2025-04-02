/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.swing.target.backend;

import com.jgranados.ipc1_2025.swing.target.backend.tiros.Tiro;
import com.jgranados.ipc1_2025.swing.target.frontend.TargetFrame;

/**
 *
 * @author jose
 */
public class Jugador {
    
    private String nombre;
    private int puntos;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public void lanzar(Tiro tiroSeleccionado, TargetFrame ui) {
        int puntosDelTurno = tiroSeleccionado.calcularPuntos();
        
        sumarPuntos(puntosDelTurno);
        ui.mostrarPuntos(puntosDelTurno, puntos);
    }
    
    private void sumarPuntos(int puntosDelTurno) {
        puntos = puntos + puntosDelTurno;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public int obtenerPunteo() {
        return puntos;
    }

    public boolean esGanador() {
        return puntos >= Partida.PUNTEO_PARA_GANAR;
    }
}
