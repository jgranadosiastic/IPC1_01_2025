/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.intermedios.arreglosobjetos.busqueda;

import com.jgranados.ipc1_2025.poo.basicos.alumno.Alumno;
import com.jgranados.ipc1_2025.poo.intermedios.exceptions.ElementoNoEncontradoException;

/**
 *
 * @author jose
 */
public class BuscadorBinario {
    
    public Alumno buscarAlumno(String cui, Alumno[] alumnos) throws ElementoNoEncontradoException {
        int inicio = 0;
        int fin = alumnos.length - 1;
        int puntoMedio;
        
        while (fin >= 0 && inicio < alumnos.length) {
            puntoMedio = inicio + (fin - inicio) / 2;
            
            Alumno alumnoMedio = alumnos[puntoMedio];
            if (alumnoMedio.esCUIIgual(cui)) {
                return alumnoMedio;
            } else if (cui.compareToIgnoreCase(alumnoMedio.obtenerCui()) < 0) {
                fin = puntoMedio - 1;
            } else {
                inicio = puntoMedio + 1;
            }
        }
        
        throw new ElementoNoEncontradoException("Alumno con cui no encontrado");
    }
}
