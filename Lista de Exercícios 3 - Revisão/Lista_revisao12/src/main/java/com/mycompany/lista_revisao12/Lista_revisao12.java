/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao12;

/**
 *
 * @author franq
 */
import javax.swing.*;
public class Lista_revisao12 {

    public static void main(String[] args) {
       int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
        
       boolean primo = true;
       if(numero <= 1){
          primo = false;
       }
       else{
          for(int i=2; i< numero; i++){
             if(numero % i == 0){
               primo = false;
               break; 
             }
          }
       
       } 
        String mensagem;
        if (primo) {
            mensagem = numero + " é primo!";
        } else {
            mensagem = numero + " não é primo.";
        }

        JOptionPane.showMessageDialog(null, mensagem); 
    }
}
