/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao6;

/**
 *
 * @author f.oliveira
 */
import java.util.Scanner;
public class Lista_revisao6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double num1, num2, num3, media;
        
        System.out.println("Digite o primeiro numero:");
         num1 = sc.nextDouble();
        System.out.println("Digite o segundo numero:");
         num2 = sc.nextDouble(); 
        System.out.println("Digite o terceiro numero:");
         num3 = sc.nextDouble();
         
         media =(num1+num2+num3)/3;
         
         System.out.println("A media do e:"+media );
         
    }
}
