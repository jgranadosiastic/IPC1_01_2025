/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.swing.basico.usandoide.calculadora.backend;

/**
 *
 * @author jose
 */
public class Calculadora {
    
    public double sumar(double numero1, double numero2) {
        return numero1 + numero2;
    }
    
    public double restar(double numero1, double numero2) {
        return numero1 - numero2;
    }
    
    public double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }
    
    public double dividir(double numero1, double numero2) throws DividirEntreCeroException {
        if (numero2 == 0) {
            throw new DividirEntreCeroException("No se puede dividir entre cero");
        }
        return numero1 / numero2;
    }
}
