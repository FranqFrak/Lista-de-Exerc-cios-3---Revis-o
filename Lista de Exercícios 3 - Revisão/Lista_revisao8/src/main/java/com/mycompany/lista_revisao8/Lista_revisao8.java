/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao8;

/**
 *
 * @author f.oliveira
 */
import java.util.Scanner;
public class Lista_revisao8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       double num1,num2,media; 
        
        System.out.println("Digite sua primeira nota:");
          num1 = sc.nextDouble();
        System.out.println("Digite sua segunda nota:");
          num2 = sc.nextDouble();
          
          media = (num1+num2)/2;
          
        if(media >= 6){
          System.out.println("Aprovado");
        }
        else{
          System.out.println("Reprovado");
        }
    
    
    }
}
