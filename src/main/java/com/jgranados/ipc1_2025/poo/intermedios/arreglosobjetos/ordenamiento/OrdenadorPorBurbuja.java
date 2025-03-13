/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.intermedios.arreglosobjetos.ordenamiento;

import com.jgranados.ipc1_2025.poo.basicos.alumno.Alumno;

/**
 *
 * @author jose
 */
public class OrdenadorPorBurbuja {

    public static void main(String[] args) {
        int[] valores = new int[]{15, 5, 14, 85, 50, 12};
        
        OrdenadorPorBurbuja ordenador = new OrdenadorPorBurbuja();
        ordenador.ordenar(valores);
        
        for (int i = 0; i < valores.length; i++) {
            
            System.out.println(valores[i]);
        }
        
    }

    public int[] ordenar(int[] valores) {
        if (valores.length == 1) {
            return valores;
        }

        int inicio = 0;
        int fin = valores.length - 1;

        boolean hayCambio;
        do {
            hayCambio = false;
            for (int i = inicio; i < fin; i++) {
                int elemento1 = valores[i];
                int elemento2 = valores[i + 1];
                if (elemento1 > elemento2) {
                    valores[i] = elemento2;
                    valores[i + 1] = elemento1;
                    hayCambio = true;
                }
            }
        } while (hayCambio);

        return valores;
    }

}
