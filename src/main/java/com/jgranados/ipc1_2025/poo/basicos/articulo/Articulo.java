/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.basicos.articulo;

/**
 *
 * @author jose
 */
public class Articulo {
    
    public static final float PORCENTAJE_VENTA_AL_DETALLE = 0.3f;
    public static final float PORCENTAJE_VENTA_AL_MAYOR = 0.15f;
    
    float costoBase;
    
    float calcularPrecioVentaAlDetalle() {
        float subtotal = costoBase * PORCENTAJE_VENTA_AL_DETALLE;
        
        return costoBase + subtotal;
    }
    
    float calcularPrecioVentaAlMayor() {
        float subtotal = costoBase * PORCENTAJE_VENTA_AL_MAYOR;
        
        return costoBase + subtotal;
    }
    
    void imprimirPrecios() {
        float alDetalle = calcularPrecioVentaAlDetalle();
        float alMayor = calcularPrecioVentaAlMayor();
        System.out.println("Precio de venta al detalle: Q" + alDetalle);
        System.out.println("Precio de venta al mayor: Q" + alMayor);
    }
}
