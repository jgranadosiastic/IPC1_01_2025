/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.intermedios.target;

import com.jgranados.ipc1_2025.poo.intermedios.target.tiros.Tiro;
import com.jgranados.ipc1_2025.poo.intermedios.target.tiros.TiroBajoElBrazo;
import com.jgranados.ipc1_2025.poo.intermedios.target.tiros.TiroControlado;
import com.jgranados.ipc1_2025.poo.intermedios.target.tiros.TiroRapido;
import java.util.Scanner;

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

    public void lanzar() {
        int puntosDelTurno = 0;
        // escoger tiro
        int opcion = escogerTiro();
        Tiro tiroSeleccionado;
        switch (opcion) {
            case 1:
                tiroSeleccionado = new TiroRapido();
                break;
            case 2:
                tiroSeleccionado = new TiroControlado();
                break;
            default:
                tiroSeleccionado = new TiroBajoElBrazo();
        }
        puntosDelTurno = tiroSeleccionado.calcularPuntos();
        
        
        /*switch (opcion) {
            case 1:
                TiroRapido tiroRapido = new TiroRapido();
                puntosDelTurno = tiroRapido.calcularPuntos();
                break;
            case 2:
                TiroControlado tiroControlado = new TiroControlado();
                puntosDelTurno = tiroControlado.calcularPuntos();
                break;
            default:
                TiroBajoElBrazo tiroBajoElBrazo = new TiroBajoElBrazo();
                puntosDelTurno = tiroBajoElBrazo.calcularPuntos();
        }*/
        
        
        
        sumarPuntos(puntosDelTurno);
        imprimirPuntos(puntosDelTurno);
    }
    
    private void sumarPuntos(int puntosDelTurno) {
        puntos = puntos + puntosDelTurno;
    }
    
    private void imprimirPuntos(int puntosDelTurno) {
        System.out.println("Puntos obtenidos en el turno actual: " + puntosDelTurno);
        System.out.println("Puntos obtenidos en total: " + puntos);
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public int obtenerPunteo() {
        return puntos;
    }
    
    private int escogerTiro() {
        int opcion;
        System.out.println("1. Tiro Rapido ");
        System.out.println("2. Tiro Controlado");
        System.out.println("3. Tiro Bajo el Brazo");
        
        Scanner scanner = new Scanner(System.in);
        opcion = Integer.parseInt(scanner.nextLine());
        
        return opcion;
        
    }

    public boolean esGanador() {
        if (puntos >= Target.PUNTEO_PARA_GANAR) {
            return true;
        } else {
            return false;
        }
    }
}
