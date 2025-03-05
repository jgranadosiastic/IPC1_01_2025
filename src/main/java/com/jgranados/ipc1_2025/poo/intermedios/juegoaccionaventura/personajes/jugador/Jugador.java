/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.intermedios.juegoaccionaventura.personajes.jugador;

import com.jgranados.ipc1_2025.poo.intermedios.juegoaccionaventura.armas.Arco;
import com.jgranados.ipc1_2025.poo.intermedios.juegoaccionaventura.armas.Arma;
import com.jgranados.ipc1_2025.poo.intermedios.juegoaccionaventura.armas.Espada;
import com.jgranados.ipc1_2025.poo.intermedios.juegoaccionaventura.personajes.Personaje;
import com.jgranados.ipc1_2025.poo.intermedios.juegoaccionaventura.personajes.enemigos.Enemigo;

/**
 *
 * @author jose
 */
public class Jugador extends Personaje {
    public static final int CANTIDAD_ARMAS = 2;
    private Arma[] armas;
    
    
    public Jugador() {
        armas = new Arma[CANTIDAD_ARMAS];
        armas[0] = new Espada();
        armas[1] = new Arco();
    }
    
    public void atacarConEspada(Enemigo enemigo) {
        int daño = armas[0].hacerDaño(enemigo);
        System.out.println("Se le hizo un daño del :" + daño);
    }
    
     public void atacarConArco(Enemigo enemigo) {
        int daño = armas[1].hacerDaño(enemigo);
        System.out.println("Se le hizo un daño del :" + daño);
    }
}
