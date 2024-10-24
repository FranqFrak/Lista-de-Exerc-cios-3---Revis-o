/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao7;

/**
 *
 * @author f.oliveira
 */
import java.util.Scanner;
public class Lista_revisao7 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
        
       String vetor[] = new String[3];
        
       vetor[0] = "ps5";
       vetor[1] = "Psp";
       vetor[2] = "pc";
       
      int indice = 0;
       
      for(int i=0; i<1; i++){
         System.out.println("Escolha um numero no indice de 0 ate 2:");
           indice = sc.nextInt();   
      }
    
          System.out.println("Voce escolheu isso do indice:"+vetor[indice]);
      
    }
}
