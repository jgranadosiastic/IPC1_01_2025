/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.intermedios.arreglosobjetos.busqueda;

import com.jgranados.ipc1_2025.poo.basicos.alumno.Alumno;
import java.util.Scanner;

/**
 *
 * @author jose
 */
public class BuscadorSecuencial {
    
    public static void main(String[] args) {
        BuscadorSecuencial buscador = new BuscadorSecuencial();
        buscador.ejecutar();
        
    }
    
    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        int cantidadAlumnos;
        System.out.println("Ingrese cantidad de alumnos a procesar:");
        cantidadAlumnos = Integer.valueOf(scanner.nextLine());
        
        Alumno[] alumnos = new Alumno[cantidadAlumnos];
        
        for (int i = 0; i < cantidadAlumnos; i++) {
            alumnos[i] = capturarAlumno();
        }
        
        
        System.out.println("Cual es el cui del alumno a buscar");
        String cui = scanner.nextLine();
        
        Alumno alumno = buscarAlumno(cui, alumnos);
        
        if (alumno == null) {
            System.out.println("No se encuentra ese alumno.");
        } else {
            alumno.mostrarDatosSinNotas();
        }
        
    }
    
    public Alumno capturarAlumno() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CIU");
        String cui  = scanner.nextLine();
        System.out.println("Nombre");
        String Nombre  = scanner.nextLine();
        
        return new Alumno(cui, Nombre, null);
        
    }
    
    public Alumno buscarAlumno(String cui, Alumno[] alumnos) {
        /*for (int i = 0; i < alumnos.length; i++) {
            Alumno alumno = alumnos[i];
            if (alumno.esCUIIgual(cui)) {
                return alumno;
            }
        }*/
        alumnos[0] = null;
        for (Alumno alumno : alumnos) {
            if (alumno != null && alumno.esCUIIgual(cui)) {
                return alumno;
            }
        }
        
        return null;
    }
    
}
