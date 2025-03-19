/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.avanzado.abstractas;

/**
 *
 * @author jose
 */
public class Triangulo extends FiguraGeometrica {
    
    private float base;
    private float altura;
    private float lado1;
    private float lado2;
    
    @Override
    public float calcularArea() {
        return base * altura * 0.5f;
    }
    
    @Override
    public float calcularPerimetro() {
        return base + lado1 + lado2;
    }
}
