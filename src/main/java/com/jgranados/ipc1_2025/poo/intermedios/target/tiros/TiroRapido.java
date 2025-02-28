/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.intermedios.target.tiros;

import java.util.Random;

/**
 *
 * @author jose
 */
public class TiroRapido extends Tiro {
    
    @Override
    public int calcularPuntos() {
        Random random = new Random();
        int probabilidad = random.nextInt(100);
        
        if (probabilidad <= 50) {
            return 40;
        } else {
            return 0;
        }
    }
}
