/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.avanzado.genericas;

/**
 *
 * @author jose
 */
public class Rectangulo<TipoLado, Color> {
    private TipoLado ladoA;
    private TipoLado ladoB;
    
    private Color color;

    public Rectangulo(TipoLado ladoA, TipoLado ladoB, Color color) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.color = color;
    }
    
    
    
    
}
