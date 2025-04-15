/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.avanzado.genericas;

import com.jgranados.ipc1_2025.poo.avanzado.genericas.object.Libro;
import com.jgranados.ipc1_2025.poo.avanzado.pilasycolas.cola.exceptions.ColaException;

/**
 *
 * @author jose
 */
public class Main {
    public static void main(String[] args) {
        ColaGenerica<Libro> colaLibros = new ColaGenerica<>(5);
        ColaGenerica<String> colaStrings = new ColaGenerica<>(5);
        
        Libro libro1 = new Libro("IPC1", "Jose Granados");
        Libro libro2 = new Libro("IPC2", "Autor");
        try {
            colaStrings.agregarACola("asdasdasdasd");
            
            colaLibros.agregarACola(libro1);
            colaLibros.agregarACola(libro2);
        } catch (ColaException e) {
        }
        
        try {
            Libro libro = colaLibros.sacarDeCola();
            libro.imprimirDatos();
            
            String elemento = colaStrings.sacarDeCola();
        } catch (ColaException e) {
        }
        
        
        /*clase parametrica o generica con multiples tipos parametrizados*/
        Hexadecimal colorHexa = new Hexadecimal("545245");
        
        Rectangulo<Double, Hexadecimal> rectanguloDoubleHexa =
                new Rectangulo<>(5.0, 5.0, colorHexa);
        
        Rectangulo<Integer, Hexadecimal> rectanguloIntHexa =
                new Rectangulo<>(3, 5, colorHexa);
        
        
        
    }
}
