/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.recursividad;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class PotenciaRecursiva {
    
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int base;
	int exponente;
	int total;
	
	System.out.println("Ingrese la base");
	base = Integer.valueOf(scanner.nextLine());
	
	System.out.println("Ingrese el exponente");
	exponente = Integer.valueOf(scanner.nextLine());
	
	total = potencia(base, exponente);
	
	System.out.println("El total es " + total);
    }
    
    public static int potencia(int base, int exponente) {
        if (exponente == 1) {
		return base;
        }
	
	return base * potencia(base, exponente - 1);
    }
}
