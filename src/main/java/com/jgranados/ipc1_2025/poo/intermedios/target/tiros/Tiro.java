/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.intermedios.target.tiros;

/**
 *
 * @author jose
 */
public abstract class Tiro {
    
    
    public abstract int calcularPuntos();
    
    public final void mostrarMensaje() {
        System.out.println("ese es un mensaje que no se puede sobreescribir");
    }
}
