/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.intermedios.arreglosobjetos.busqueda.secuencial;

import com.jgranados.ipc1_2025.poo.basicos.alumno.Alumno;
import com.jgranados.ipc1_2025.poo.intermedios.arreglosobjetos.busqueda.BuscadorSecuencial;
import com.jgranados.ipc1_2025.poo.intermedios.exceptions.ElementoNoEncontradoException;
import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.ejecutar();

    }

    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        int cantidadAlumnos = 0;
        boolean hayError = false;

        do {
            try {
                System.out.println("Ingrese cantidad de alumnos a procesar:");
                cantidadAlumnos = Integer.valueOf(scanner.nextLine());
                hayError = false;
            } catch (NumberFormatException e) {
                System.out.println("El valor ingresado no es un entero, intente otra vez");
                hayError = true;
            }
        } while (hayError);

        Alumno[] alumnos = new Alumno[cantidadAlumnos];

        for (int i = 0; i < cantidadAlumnos; i++) {
            alumnos[i] = capturarAlumno();
        }

        System.out.println("Cual es el cui del alumno a buscar");
        String cui = scanner.nextLine();

        
        
        BuscadorSecuencial secuencial = new BuscadorSecuencial();
        
        try {
            Alumno alumno = secuencial.buscarAlumno(cui, alumnos);
            alumno.mostrarDatosSinNotas();
        } catch (ElementoNoEncontradoException ex) {
            System.out.println(ex.getMessage());
        }
            }

    public Alumno capturarAlumno() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CIU");
        String cui = scanner.nextLine();
        System.out.println("Nombre");
        String Nombre = scanner.nextLine();

        return new Alumno(cui, Nombre, null);

    }
}
