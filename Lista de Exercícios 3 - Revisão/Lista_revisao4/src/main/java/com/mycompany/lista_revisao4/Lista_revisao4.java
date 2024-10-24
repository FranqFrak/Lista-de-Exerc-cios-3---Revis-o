/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao4;

/**
 *
 * @author f.oliveira
 */
import java.util.Scanner;
public class Lista_revisao4 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
       int numero;
       
        System.out.println("Digite um numero:");
        numero = sc.nextInt();
        
        for(int i = 0;i <= 10;i++){
             
          System.out.println(i * numero);
        }
    }
}
