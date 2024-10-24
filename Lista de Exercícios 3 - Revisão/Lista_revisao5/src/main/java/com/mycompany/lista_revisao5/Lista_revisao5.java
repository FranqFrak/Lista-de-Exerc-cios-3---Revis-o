/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao5;

/**
 *
 * @author f.oliveira
 */
import java.util.Scanner;
public class Lista_revisao5 {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        
        int numero; 
        
        System.out.println("Digite um numero:");
        numero = sc.nextInt();
        
        while(true){
         Thread.sleep(1000);
         System.out.println(numero);
         
         if(numero == 0){
             numero = 60;
         }
         else{
           numero--;
         }
        }
    }
}
