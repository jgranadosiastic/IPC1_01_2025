/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.intermedios.juegoaccionaventura.armas;

import com.jgranados.ipc1_2025.poo.intermedios.juegoaccionaventura.personajes.enemigos.Enemigo;
import com.jgranados.ipc1_2025.poo.intermedios.juegoaccionaventura.personajes.enemigos.EnemigoVolador;
import com.jgranados.ipc1_2025.poo.intermedios.juegoaccionaventura.personajes.enemigos.Gargola;
import com.jgranados.ipc1_2025.poo.intermedios.juegoaccionaventura.personajes.enemigos.Troll;
import java.util.Random;

/**
 *
 * @author jose
 */
public class Espada extends Arma {

    public static final int LIMITE_INFERIOR = 5;
    public static final int LIMITE_SUPERIOR = 8;

    public Espada() {
        Random random = new Random();
        puntosDaño = random.nextInt(LIMITE_INFERIOR, LIMITE_SUPERIOR + 1);
    }

    @Override
    public int hacerDaño(Enemigo enemigo) {
        /*if (enemigo instanceof Troll) {
            return puntosDaño - enemigo.obtenerPuntosDeDefensa();
        } else {
            EnemigoVolador enemigoVolador = (EnemigoVolador) enemigo;
            if (enemigoVolador.estaVolando()) {
                return 0;
            }
        }*/

        if (enemigo instanceof Troll) {
            return puntosDaño - enemigo.obtenerPuntosDeDefensa();
        }

        EnemigoVolador enemigoVolador = (EnemigoVolador) enemigo;
        if (!enemigoVolador.estaVolando()) {
            return puntosDaño - enemigo.obtenerPuntosDeDefensa();
        }

        return 0;
    }
}
