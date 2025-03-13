/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.intermedios.archivostexto;

import java.io.File;
import java.io.FileInputStream;

/**
 *
 * @author jose
 */
public class MainArchivosTexto {
    
    private static final String PATH_ARCHIVO = "/home/jose/CUNOC/IPC1/2025 01/";
    private static final String NOMBRE_ARCHIVO = "primertexto.txt";
    private static final String PATH_COMPLETO = PATH_ARCHIVO + NOMBRE_ARCHIVO;
    
    public static void main(String[] args) {
        File miArchivo = new File(PATH_ARCHIVO);
        System.out.println("El archivo existe?" + miArchivo.exists());
        System.out.println("Path:" + miArchivo.getAbsolutePath());
        System.out.println("es dir:" + miArchivo.isDirectory());
        
        if (miArchivo.isDirectory()) {
            System.out.println("cantidad de archivos?" + miArchivo.listFiles().length);
        }
        
        leerTextoEnBytes();
    }
    
    public static void leerTextoEnBytes() {
        File miArchivo = new File(PATH_COMPLETO);
        try {
            FileInputStream inputStream = new FileInputStream(miArchivo);
            int byteEnArchivo = inputStream.read();
            while (byteEnArchivo != -1) {
                char caracter = (char) byteEnArchivo;
                System.out.print(caracter);
                byteEnArchivo = inputStream.read();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
