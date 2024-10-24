/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao1;

import java.util.Scanner;

/**
 *
 * @author f.oliveira
 */
public class Lista_revisao1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1,num2, somar;
        
        System.out.println("Digite um numero:");
           num1 = sc.nextInt();
        System.out.println("Digite outro numero:");
           num2 = sc.nextInt();
           
          somar = num1 + num2;
          
        System.out.println("O valor da somar e:"+ somar);
    }
}
