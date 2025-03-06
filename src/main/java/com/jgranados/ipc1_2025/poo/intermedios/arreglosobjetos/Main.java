/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.intermedios.arreglosobjetos;

import com.jgranados.ipc1_2025.poo.intermedios.juegoaccionaventura.armas.Arma;
import com.jgranados.ipc1_2025.poo.intermedios.juegoaccionaventura.armas.Espada;

/**
 *
 * @author jose
 */
public class Main {
    
    public static void main(String[] args) {
        // Una dimension
        Arma[] arregloUnaDimension = new Arma[3];
        
        Arma[][] arregloDosDimensiones = new Arma[3][4];
        
        Arma[][][] arregloTresDimensiones = new Arma[3][4][2];
        
        Espada espada1 = new Espada();
        
        arregloUnaDimension[0] = espada1;
        
        arregloDosDimensiones[0][2] = espada1;
        
        arregloTresDimensiones[1][2][0] = espada1;
        
        
    }
    
}
