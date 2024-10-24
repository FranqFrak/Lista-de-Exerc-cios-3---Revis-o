/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao11;

/**
 *
 * @author franq
 */
import javax.swing.*;
public class Lista_revisao11 {

    public static void main(String[] args) {
        
        int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos valores você deseja inserir?"));
        int[] valores = new int[qtd];
        
        for(int i=0;i < qtd; i++){
            valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"+(i+1)+ ":"));
        }
        int maior = valores[0], menor = valores[0];
        
        for(int i=0; i<valores.length; i++){
            if(valores[i] > maior){
               maior = valores[i]; 
          }
            else if(valores[i] < menor){
               menor = valores[i];
            
            }
        }
    
        JOptionPane.showMessageDialog(null, "Mair valor:" +maior + "\nMenor valor:" + menor);
    }
    
}
