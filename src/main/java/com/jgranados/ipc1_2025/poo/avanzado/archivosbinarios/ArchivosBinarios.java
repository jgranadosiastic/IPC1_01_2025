/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.poo.avanzado.archivosbinarios;

import com.jgranados.ipc1_2025.poo.intermedios.target.Jugador;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;

/**
 *
 * @author jose
 */
public class ArchivosBinarios {

    public static final String PATH_ARCHIVO = "/home/jose/CUNOC/IPC1/2025 01/";
    public static final String NOMBRE_ARCHIVO = "primerbinario.bindat";
    public static final String PATH_COMPLETO = PATH_ARCHIVO + NOMBRE_ARCHIVO;
    public static final String PATH_COMPLETO_OBJ = 
            PATH_ARCHIVO + "primerobjeto.obj";

    public static void main(String[] args) {
        //guardarDatosBinarios();
        //leerDatosBinarios();
        //leerDatosVariosBinarios();
        Jugador jugador1 = new Jugador("Nombre");
        jugador1.setPuntos(500);
        guardarObjeto(jugador1);
        leerObjeto();
    }

    public static void guardarDatosBinarios() {
        Random random = new Random();
        int valor = random.nextInt(500);
        Jugador jugador = new Jugador("Jugador" + valor);
        jugador.setPuntos(valor);

        File file = new File(PATH_COMPLETO);
        try (FileOutputStream fileStream = new FileOutputStream(file, true); DataOutputStream dataStream = new DataOutputStream(fileStream);) {
            dataStream.writeUTF(jugador.obtenerNombre());
            dataStream.writeInt(jugador.obtenerPunteo());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void leerDatosBinarios() {
        File file = new File(PATH_COMPLETO);
        try (FileInputStream input = new FileInputStream(file); DataInputStream dataInput = new DataInputStream(input);) {
            String nombre = dataInput.readUTF();
            int punteo = dataInput.readInt();
            Jugador jugador = new Jugador(nombre);
            jugador.setPuntos(punteo);
            System.out.println("Jugador leido desde archivo: " + jugador);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void leerDatosVariosBinarios() {
        File file = new File(PATH_COMPLETO);
        try (FileInputStream input = new FileInputStream(file); DataInputStream dataInput = new DataInputStream(input);) {
            try {
                while (true) {
                    String nombre = dataInput.readUTF();
                    int punteo = dataInput.readInt();
                    Jugador jugador = new Jugador(nombre);
                    jugador.setPuntos(punteo);
                    System.out.println("Jugador leido desde archivo: " + jugador);
                }
            } catch (EOFException e) {
                // terminamos de leer archivo
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void guardarObjeto(Jugador jugador) {
        File file = new File(PATH_COMPLETO_OBJ);
        try (FileOutputStream out = new FileOutputStream(file);
                ObjectOutputStream objectStream = 
                new ObjectOutputStream(out)) {
            objectStream.writeObject(jugador);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void leerObjeto() {
        File file = new File(PATH_COMPLETO_OBJ);
        
        try (FileInputStream input = new FileInputStream(file);
                ObjectInputStream objStream = 
                        new ObjectInputStream(input)) {
            Jugador jugador =
                    (Jugador) objStream.readObject();
            System.out.println(jugador);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
