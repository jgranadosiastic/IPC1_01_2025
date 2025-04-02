/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.swing.target.backend.tiros;

import java.util.Random;

/**
 *
 * @author jose
 */
public class TiroControlado extends Tiro {
    
    
    @Override
    public int calcularPuntos() {
        Random random = new Random();
        int probabilidad = random.nextInt(100);
        
        if (probabilidad <= 33) {
            return 10;
        } else if (probabilidad > 33 && probabilidad <= 66) {
            return 20;
        } else {
            return 30;
        }
    }
}
