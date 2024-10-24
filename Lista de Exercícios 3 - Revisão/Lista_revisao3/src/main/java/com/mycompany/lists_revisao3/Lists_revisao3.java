/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lists_revisao3;

/**
 *
 * @author f.oliveira
 */
import java.util.Scanner;
public class Lists_revisao3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1,num2;
        
        System.out.println("Digite um numero jogador 1:");
        num1 = sc.nextInt();
        
        System.out.println("Digite um numero jogador 2:");
        num2 = sc.nextInt();
        
        if(num1 > num2){
         System.out.println("Seu numero e Maior jagador 1");   
        }
        else if(num2 > num1){
         System.out.println("Seu numero e Maior jagador 2");
        }
    }
}
