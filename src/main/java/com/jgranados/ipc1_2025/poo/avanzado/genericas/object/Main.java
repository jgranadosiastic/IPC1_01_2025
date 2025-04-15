/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.avanzado.genericas.object;

import com.jgranados.ipc1_2025.poo.avanzado.pilasycolas.cola.exceptions.ColaException;

/**
 *
 * @author jose
 */
public class Main {

    public static void main(String[] args) {
        ColaObjectos objects = new ColaObjectos(5);

        Libro libro1 = new Libro("IPC1", "Jose Granados");
        Libro libro2 = new Libro("IPC2", "Autor");
        try {

            objects.agregarACola("un libro");
            objects.agregarACola(libro1);
            objects.agregarACola(libro2);
        } catch (ColaException e) {
        }
        
        try {
            Libro libro = (Libro) objects.sacarDeCola();
            libro.imprimirDatos();
        } catch (ColaException e) {
        }
    }
}
