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
public class FactorialRecursivo {
    
    // comentario de una linea
    
    /* esto es
    un comentario
    de bloque
    */
    
    public static void main(String[] args) {
        
        int numero;
        int factorial;
        Scanner scanner = new Scanner(System.in);
	
	System.out.println("Ingrese un numero");
        
	numero = Integer.valueOf(scanner.nextLine());
	
	factorial = factorial(numero);
	
	/*System.out.println("El factorial de ");
	System.out.println(numero);
	System.out.println(" es: ");
	System.out.println(factorial);*/
        
        // System.out.println("El factorial de " + numero + " es: " + factorial);
        System.out.printf("El factorial de %d es %d\n", numero, factorial);
        
    }
    
    public static int factorial(int numero) {
        if (numero == 1 || numero == 0) {
		return 1;
        }

	return numero * factorial(numero - 1);
    }
    
}
