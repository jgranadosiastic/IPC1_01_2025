/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.intermedios.juegoaccionaventura.armas;

import com.jgranados.ipc1_2025.poo.intermedios.juegoaccionaventura.personajes.enemigos.Enemigo;
import com.jgranados.ipc1_2025.poo.intermedios.juegoaccionaventura.personajes.enemigos.Gargola;
import com.jgranados.ipc1_2025.poo.intermedios.juegoaccionaventura.personajes.enemigos.Troll;
import com.jgranados.ipc1_2025.poo.intermedios.juegoaccionaventura.personajes.jugador.Jugador;

/**
 *
 * @author jose
 */
public class Main {
    
    public static void main(String[] args) {
        Enemigo troll = new Troll();
        Jugador jugador = new Jugador();
        
        jugador.atacarConEspada(troll);
        
        jugador.atacarConArco(troll);
        
        Enemigo gargola = new Gargola();
        jugador.atacarConEspada(gargola);
    }
}
