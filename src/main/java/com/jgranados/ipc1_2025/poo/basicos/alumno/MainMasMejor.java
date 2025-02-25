/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.basicos.alumno;

/**
 *
 * @author jose
 */
public class MainMasMejor {
    public static void main(String[] args) {
        
        RecolectorDeDatos recolector = new RecolectorDeDatos();
        
        
        String cui = recolector.recolectarCui();
        String nombre = recolector.recolectarNombre();
        int[] notas = recolector.capturarNotas();
        
        Alumno alumno = new Alumno(cui, nombre, notas);
        /*alumno.cui = recolector.recolectarCui();
        alumno.nombre = recolector.recolectarNombre();
        alumno.notas = recolector.capturarNotas();*/
        
        alumno.cambiarNombre("nuevo nombre");
        
        alumno.mostrarDatos();
        
        System.out.println("Nombre desde fuera del alumno: " + alumno.obtenerNombre());
        
        
        
    }
}
