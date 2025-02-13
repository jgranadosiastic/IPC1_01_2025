/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.basicos;

import java.util.Scanner;

/**
 *
 *
 * Inicio CalculoMunicipal
 *
 * Const COSTO_BASE = 10
 *
 * Var opcion Hacer Llamar RealizarOperacion()
 *
 *
 * Escribir "Desea realizar otro calculo? [S|N]" Leer opcion Mientras(opcion ==
 * "S")
 *
 *
 * Fin
 *
 * Inicio subprograma CalcularAgua(Var metrosCubicos) // Calculo Var total Var
 * subtotal Si (metrosCubicos <= 10) total = COSTO_BASE sino si (metrosCubicos <= 100)
 * subtotal = metrosCubicos - 10
 * total = subtotal * 1.1 + COSTO_BASE
 * sino
 * subtotal = metrosCubicos - 100
 * total = COSTO_BASE + 90 * 1.1 + subtotal * 2
 * finsi
 *
 * retornar total
 * Fin
 *
 * Inicio subprograma CalcularEnergia(Var kwh, Var zona)
 *
 * Var tarifa
 * si (zona == 1) entonces
 * tarifa =  0.75
 * sino si (zona >= 4 && zona <=8) tarifa = 1.15 sino tarifa = 1.75 finsi
 *
 * retornar kwh * tarifa Fin
 *
 * Inicio subprograma RealizarOperacion()
 *
 * Var metrosCubicos Var totalDeAgua Var totalDeEnergia Var zona Var kwh Var
 * sumaTotal Var opcion
 *
 * Escribir "Ingrese M3" Leer metrosCubicos
 *
 * Escribir "Ingrese Zona" Leer zona
 *
 * Escribir "Ingrese Kw/H" Leer kwh
 *
 * totalDeAgua = Llamar CalcularAgua(metrosCubicos)
 *
 * totalDeEnergia = Llamar CalcularEnergia(kwh, zona)
 *
 * sumaTotal = totalDeAgua + totalDeEnergia
 *
 * Escribir "El total gastado es: Q." Escribir sumaTotal Fin @author jose
 */
public class CalculoMunicipal {

    public static final int COSTO_BASE = 10;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String hola = "Hola";
        String opcion;
        do {
            realizarOperacion();

            System.out.println("Desea realizar otro calculo? [S|N]");
            opcion = scanner.nextLine();

        } while (opcion.equals("S"));
    }

    public static void realizarOperacion() {
        int metrosCubicos;
        float totalDeAgua;
        float totalDeEnergia;
        int zona;
        int kwh;
        float sumaTotal;
        int opcion;

        System.out.println("Ingrese M3");
        metrosCubicos = Integer.valueOf(scanner.nextLine());

        System.out.println("Ingrese Zona");
        zona = Integer.valueOf(scanner.nextLine());

        System.out.println("Ingrese Kw/H");
        kwh = Integer.valueOf(scanner.nextLine());

        totalDeAgua = calcularAgua(metrosCubicos);

        totalDeEnergia = calcularEnergia(kwh, zona);

        sumaTotal = totalDeAgua + totalDeEnergia;

        System.out.println("El total gastado es: Q." + sumaTotal);
    }

    private static float calcularAgua(int metrosCubicos) {
        // Calculo
        float total;
        int subtotal;
        if (metrosCubicos <= 10) {
            total = COSTO_BASE;
        }
        if (metrosCubicos <= 100) {
            subtotal = metrosCubicos - 10;
            total = subtotal * 1.1f + COSTO_BASE;
        } else {
            subtotal = metrosCubicos - 100;
            total = COSTO_BASE + 90 * 1.1f + subtotal * 2;
        }

        return total;
    }

    private static float calcularEnergia(int kwh, int zona) {
        float tarifa;
        if (zona == 1) {
            tarifa = 0.75f;
        } else if (zona >= 4 && zona <= 8) {
            tarifa = 1.15f;
        } else {
            tarifa = 1.75f;
        }

        return kwh * tarifa;
    }

}
