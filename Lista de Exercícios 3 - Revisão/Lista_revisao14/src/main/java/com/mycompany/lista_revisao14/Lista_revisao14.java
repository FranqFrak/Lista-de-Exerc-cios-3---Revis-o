/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao14;

/**
 *
 * @author franq
 */
import javax.swing.*;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Lista_revisao14 {

    public static void main(String[] args) {
        int qtdFuncionario = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos funcionários deseja cadastrar?"));
        
        String[] nome = new String[qtdFuncionario];
        double[] salario = new double[qtdFuncionario];
        
        for(int i=0; i<qtdFuncionario; i++){
            nome[i] = JOptionPane.showInputDialog("Digite o nome funcionário " + (i+1) + ":");
            salario[i] = Double.parseDouble(JOptionPane.showInputDialog(""));
        }
    }
}
