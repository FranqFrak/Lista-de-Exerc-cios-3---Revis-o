/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao2;

import java.util.Scanner;

/**
 *
 * @author f.oliveira
 */
public class Lista_revisao2 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
       int numero;
        
        System.out.println("Digite um numero:");
          numero = sc.nextInt();
          
      if(numero % 2 == 0){
        System.out.println("Par");
      }   
      else{
        System.out.println("Impar");
      }    
    }
}
