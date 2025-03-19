/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.avanzado.abstractas;

/**
 *
 * @author jose
 */
public class Rectangulo extends FiguraGeometrica {
    
    private float ladoA;
    private float ladoB;
    
    @Override
    public float calcularArea() {
        return ladoA * ladoB;
    }
    
    @Override
    public float calcularPerimetro() {
        return 2 * ladoA + 2* ladoB;
    }
}
