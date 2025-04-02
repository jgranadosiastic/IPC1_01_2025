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
public class TiroBajoElBrazo extends Tiro {
    
    @Override
    public int calcularPuntos() {
        Random random = new Random();
        int probabilidad = random.nextInt(100);
        
        if (probabilidad <= 20) {
            return 10;
        } else if (probabilidad > 20 && probabilidad <= 40) {
            return 20;
        } else if (probabilidad > 40 && probabilidad <= 60) {
            return 30;
        } else if (probabilidad > 60 && probabilidad <= 80) {
            return 40;
        } else {
            return 0;
        }
    }
}
