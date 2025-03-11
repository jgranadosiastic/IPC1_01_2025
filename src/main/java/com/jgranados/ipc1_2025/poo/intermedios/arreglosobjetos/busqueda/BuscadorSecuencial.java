/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.intermedios.arreglosobjetos.busqueda;

import com.jgranados.ipc1_2025.poo.basicos.alumno.Alumno;
import com.jgranados.ipc1_2025.poo.intermedios.exceptions.ElementoNoEncontradoException;
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

        /*Alumno alumno = buscarAlumno(cui, alumnos);

        if (alumno == null) {
            System.out.println("No se encuentra ese alumno.");
        } else {
            alumno.mostrarDatosSinNotas();
        }*/
        
        try {
            Alumno alumno = buscarAlumno(cui, alumnos);
            alumno.mostrarDatosSinNotas();
        } catch (ElementoNoEncontradoException ex) {
            System.out.println(ex.getMessage());
        }
        

        /*
        try {
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
        } catch (NumberFormatException e) {
            System.out.println("El valor no es un numero.");
        }
        */
    }

    public Alumno capturarAlumno() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CIU");
        String cui = scanner.nextLine();
        System.out.println("Nombre");
        String Nombre = scanner.nextLine();

        return new Alumno(cui, Nombre, null);

    }

    public Alumno buscarAlumno(String cui, Alumno[] alumnos) throws ElementoNoEncontradoException {
        /*for (int i = 0; i < alumnos.length; i++) {
            Alumno alumno = alumnos[i];
            if (alumno.esCUIIgual(cui)) {
                return alumno;
            }
        }*/
        //alumnos[0] = null;
        for (Alumno alumno : alumnos) {
            if (alumno != null && alumno.esCUIIgual(cui)) {
                return alumno;
            }
        }

        throw new ElementoNoEncontradoException("El alumno con cui: " + cui + " no se encuentra.");
    }

}
