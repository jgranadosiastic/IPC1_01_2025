/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.intermedios.archivostexto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.NoSuchElementException;
import java.util.Scanner;

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
        
        //escribirBytes("esto es un texto nuevo\nesta es una linea nueva");
        //escribirConWriter("esto es un texto nuevo\nesta es una linea nueva");
        escribirConPrinter("esto es un texto nuevo\nesta es una linea nueva");
        
        System.out.println("leer en bytes");
        leerTextoEnBytes();
        System.out.println("Leer con buffer");
        leerTextoConBufferReader();
        System.out.println("Leer con scanner");
        leerTextoConScanner();
    }
    
    public static void leerTextoEnBytes() {
        File miArchivo = new File(PATH_COMPLETO);
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(miArchivo);
            int byteEnArchivo = inputStream.read();
            while (byteEnArchivo != -1) {
                char caracter = (char) byteEnArchivo;
                System.out.print(caracter);
                byteEnArchivo = inputStream.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try{
                inputStream.close();
                } catch(IOException e) {
                    e.printStackTrace();
                }
            }
        }
        
        
        try (InputStream inputStream2 = Files.newInputStream(Path.of(PATH_COMPLETO))) {
            int byteEnArchivo = inputStream2.read();
            while (byteEnArchivo != -1) {
                char caracter = (char) byteEnArchivo;
                System.out.print(caracter);
                byteEnArchivo = inputStream2.read();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public static void leerTextoConBufferReader() {
        File miArchivo = new File(PATH_COMPLETO);
        try (FileReader reader = new FileReader(miArchivo);) {
            BufferedReader buffer = new BufferedReader(reader);
            String linea = buffer.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = buffer.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void leerTextoConScanner() {
        try (InputStream inputStream = Files.newInputStream(Path.of(PATH_COMPLETO))) {
            Scanner scanner = new Scanner(inputStream);
            String linea = scanner.nextLine();
            while (true) {
                System.out.println(linea);
                linea = scanner.nextLine();
            }
        } catch (NoSuchElementException e) {
            System.out.println("Llegamos al fin del archivo");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void escribirBytes(String texto) {
        File miArchivo = new File(PATH_COMPLETO);
        try (FileOutputStream outputStream = new FileOutputStream(miArchivo)) {
            outputStream.write(texto.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void escribirConWriter(String texto) {
        File miArchivo = new File(PATH_COMPLETO);
        try (FileWriter writer = new FileWriter(miArchivo)) {
            writer.append(texto);
            writer.write(texto);
        } catch (Exception e) {
        }
    }
    
    public static void escribirConPrinter(String texto) {
        File miArchivo = new File(PATH_COMPLETO);
        try (FileWriter fileWriter = new FileWriter(miArchivo, true);
                PrintWriter writer = new PrintWriter(fileWriter)) {
            writer.println(texto);
            writer.println(texto);
        } catch (Exception e) {
        }
    }
}
