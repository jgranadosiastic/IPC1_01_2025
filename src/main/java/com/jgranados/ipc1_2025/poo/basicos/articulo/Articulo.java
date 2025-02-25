/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.basicos.articulo;

/**
 *
 * @author jose
 * modificadores de visibilidad:
 * private: solo puede ser accesado desde dentro de la misma clase
 * protected: puede ser accesado por la misma clase, por clases hijas 
 * y por clases del mismo paquete
 * por defecto: puede ser accesado por la misma clase y por clases del mismo paquete
 * public: puede ser accesado por cualquier otra clase
 */
public class Articulo {
    
    public static final float PORCENTAJE_VENTA_AL_DETALLE = 0.3f;
    public static final float PORCENTAJE_VENTA_AL_MAYOR = 0.15f;
    
    private float costoBase;
    
    /*public Articulo() {
        
    }*/
    
    public Articulo(float costoBaseParametro) {
        costoBase = costoBaseParametro;
    }
    
    private float calcularPrecioVentaAlDetalle() {
        float subtotal = costoBase * PORCENTAJE_VENTA_AL_DETALLE;
        
        return costoBase + subtotal;
    }
    
    private float calcularPrecioVentaAlMayor() {
        float subtotal = costoBase * PORCENTAJE_VENTA_AL_MAYOR;
        
        return costoBase + subtotal;
    }
    
    public void imprimirPrecios() {
        float alDetalle = calcularPrecioVentaAlDetalle();
        float alMayor = calcularPrecioVentaAlMayor();
        System.out.println("Precio de venta al detalle: Q" + alDetalle);
        System.out.println("Precio de venta al mayor: Q" + alMayor);
    }
}
