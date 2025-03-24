/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_2025.swing.basico;

import com.jgranados.ipc1_2025.poo.intermedios.archivostexto.MainArchivosTexto;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author jose
 */
public class FrameBasicoMain {
    
    
    public static void main(String[] args) {
        FrameBasicoMain frameBasicoMain = new FrameBasicoMain();
        frameBasicoMain.crearFrameBasico();
    }
    
    public void crearFrameBasico() {
        JFrame primerFrame = new JFrame("Titulo del frame basico");
        primerFrame.setSize(400, 400);
        primerFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        FlowLayout flowLayout = new FlowLayout();
        primerFrame.getContentPane().setLayout(flowLayout);
        
        JLabel etiquetaNombre = new JLabel("Ingrese un nombre:");
        etiquetaNombre.setSize(100, 50);
        
        primerFrame.add(etiquetaNombre);
        
        JTextField textoNombre = new JTextField();
        textoNombre.setSize(200, 50);
        textoNombre.setPreferredSize(new Dimension(200, 50));
        
        primerFrame.add(textoNombre);
        
        JButton botonGuardar = new JButton("Guardar");
        botonGuardar.setSize(50, 50);
        
        //ActionListenerBotonGuardar listener = new ActionListenerBotonGuardar();
        //botonGuardar.addActionListener(listener);
        
        botonGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = textoNombre.getText();
                escribirConPrinter(nombre);
                System.out.println("el nombre guardado es:" + nombre);
            }
            
        });
        
        primerFrame.add(botonGuardar);
        
        primerFrame.setVisible(true);
    }
    
    private void escribirConPrinter(String texto) {
        File miArchivo = new File(MainArchivosTexto.PATH_COMPLETO);
        try (FileWriter fileWriter = new FileWriter(miArchivo);
                PrintWriter writer = new PrintWriter(fileWriter)) {
            writer.println(texto);
        } catch (Exception e) {
        }
    }
}
