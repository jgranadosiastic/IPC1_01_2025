/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.intermedios.juegoaccionaventura.armas;

import com.jgranados.ipc1_2025.poo.intermedios.juegoaccionaventura.personajes.enemigos.Enemigo;
import com.jgranados.ipc1_2025.poo.intermedios.juegoaccionaventura.personajes.enemigos.EnemigoVolador;
import com.jgranados.ipc1_2025.poo.intermedios.juegoaccionaventura.personajes.enemigos.Troll;
import java.util.Random;

/**
 *
 * @author jose
 */
public class Arco extends Arma {
    public static final int LIMITE_INFERIOR = 1;
    public static final int LIMITE_SUPERIOR = 3;
    
    public static final int LIMITE_INFERIOR_VOLADORES = 5;
    public static final int LIMITE_SUPERIOR_VOLADORES = 9;
    
    private int cantidadFlechas;
    private int puntosDañoVoladores;
    
    public Arco() {
        Random random = new Random();
        puntosDaño = random.nextInt(LIMITE_INFERIOR, LIMITE_SUPERIOR + 1);
        puntosDañoVoladores = random.nextInt(LIMITE_INFERIOR_VOLADORES, LIMITE_SUPERIOR_VOLADORES + 1);
        cantidadFlechas = 15;
    }
    
    
    public boolean puedeAtacar() {
        /*if (cantidadFlechas > 0) {
            return true;
        } else {
            return false;
        }*/
        return cantidadFlechas > 0;
    }
    
    @Override
    public int hacerDaño(Enemigo enemigo) {
        if (!puedeAtacar()) {
            return 0;
        }
        
        if (enemigo instanceof Troll) {
            return puntosDaño - enemigo.obtenerPuntosDeDefensa();
        }
        
        EnemigoVolador enemigoVolador = (EnemigoVolador) enemigo;
        if (enemigoVolador.estaVolando()) {
            return puntosDañoVoladores - enemigo.obtenerPuntosDeDefensa();
        }
        
        return puntosDaño - enemigo.obtenerPuntosDeDefensa();
    }
}
