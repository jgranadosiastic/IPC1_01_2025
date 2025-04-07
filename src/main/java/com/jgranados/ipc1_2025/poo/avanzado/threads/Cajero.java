/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.avanzado.threads;

/**
 *
 * @author jose
 */
public class Cajero {

    private int[] productos;
    private String nombre;

    public Cajero(int[] productos, String nombre) {
        this.productos = productos;
        this.nombre = nombre;
    }

    public void procesarProductos() {
        try {
            for (int i = 0; i < productos.length; i++) {
                int producto = productos[i];
                System.out.println(nombre + ": Iniciando producto en posicion: " + i);
                Thread.sleep(producto * 1000);
                System.out.println(nombre + ": Finalizado producto en posicion: " + i);
            }
        } catch (InterruptedException e) {
            // manejar correctamente el error
            e.printStackTrace();
        }

    }

}
