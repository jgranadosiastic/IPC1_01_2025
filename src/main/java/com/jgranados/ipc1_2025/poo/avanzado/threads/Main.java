/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.avanzado.threads;

/**
 *
 * @author jose
 */
public class Main {
    
    public static void main(String[] args) throws InterruptedException {
        /*int[] productosCajero = new int[] {1, 3, 2};
        Cajero cajero = new Cajero(productosCajero, "cajero1");
        cajero.procesarProductos();
        
        int[] productosCajero2 = new int[] {2, 4, 1, 7};
        Cajero cajero2 = new Cajero(productosCajero2, "cajero2");
        cajero2.procesarProductos();
        
        int[] productosCajero3 = new int[] {3, 10};
        Cajero cajero3 = new Cajero(productosCajero3, "cajero3");
        cajero3.procesarProductos();*/
        
        int[] productosCajero = new int[] {1, 3, 2};
        CajeroThread cajero = new CajeroThread(productosCajero, "cajero1");
        cajero.start();
        
        int[] productosCajero2 = new int[] {2, 4, 1, 7};
        CajeroThread cajero2 = new CajeroThread(productosCajero2, "cajero2");
        cajero2.start();
        
        int[] productosCajero3 = new int[] {3, 10};
        CajeroThread cajero3 = new CajeroThread(productosCajero3, "cajero3");
        cajero3.start();
        
        
        while (cajero.isAlive() || cajero2.isAlive() || cajero3.isAlive()) {
            System.out.println("algun hilo aun esta vivo!");
            
            Thread.sleep(1500);
            if (cajero.isAlive()) {
                cajero.interrupt();
            }
        }
 
        System.out.println("Ya se terminaronn todos los hilos");
        
        
        
        System.out.println("Hasta aqui llega el codigo del programa principal");
        
    }
}
