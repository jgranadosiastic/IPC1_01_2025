/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.intermedios.juegoaccionaventura.armas;

import com.jgranados.ipc1_2025.poo.intermedios.juegoaccionaventura.personajes.enemigos.Enemigo;

/**
 *
 * @author jose
 */
public abstract class Arma {
    protected int puntosDaño;
    
    
    public abstract int hacerDaño(Enemigo enemigo);
}
