/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.basicos.articulo;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Main {

    public static void main(String[] args) {
        float costoBase;
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            System.out.println("Ingrese costo base del articulo:");
            costoBase = Float.parseFloat(scanner.nextLine());

            Articulo articulo = new Articulo(costoBase);
            //articulo.costoBase = costoBase;

            articulo.imprimirPrecios();
            System.out.println("Desea continuar? S/N");
            continuar = scanner.nextLine();
        } while (continuar.equals("S"));
    }
}
