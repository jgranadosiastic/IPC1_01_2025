/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.avanzado.abstractas;

import com.jgranados.ipc1_2025.poo.avanzado.interfaces.Imagen;
import com.jgranados.ipc1_2025.poo.avanzado.interfaces.Movible;

/**
 *
 * @author jose
 */
public class Main {
    
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        Imagen imagen = new Imagen();
        Rectangulo rec = new Rectangulo();
        
        Movible[] movibles = new Movible[2];
        
        movibles[0] = imagen;
        movibles[1] = rec;
        
        for (Movible movible : movibles) {
            movible.mover(0);
        }
        
    }
    
}
