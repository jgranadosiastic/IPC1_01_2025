/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.avanzado.abstractas;

/**
 *
 * @author jose
 */
public abstract class FiguraGeometrica {
    
    protected int color;
    
    public abstract float calcularArea();
    
    public abstract float calcularPerimetro();
    
    public void mostrarColor() {
        System.out.println("el color es:" + color);
    }
}
