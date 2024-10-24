/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao10;

/**
 *
 * @author franq
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.*;
public class Lista_revisao10 {

    public static void main(String[] args) {
      
        int numCliente = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos clientes paticiparão da pesquisa?"));
        
        String[] respostas = new String[numCliente];
        String[] generos = {"Ação", "Comédia","Drama","Terror", "Romance"};
        
        int[] contadores = new int[generos.length]; 
        
        for(int i=0; i< numCliente; i++){
           String resposta = JOptionPane.showInputDialog("Cliente"+(i+1)+": Qual e o seu genero de filme favorito?(Ação, Comédia, Drama, Terror, Romance)");
           respostas[i] = resposta;
           
           for(int j =0; j < generos.length; j++){
               if(resposta.equalsIgnoreCase(generos[j])){
                  contadores[j]++;
                  break;
               }
               
           }
        }           
        StringBuilder resultado = new StringBuilder("Resultado da pesquisaa:\n");
        for(int i=0; i<generos.length; i++){
            resultado.append(generos[i]).append(": ").append(contadores[i]).append(" votos\n");
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
        
        try(PrintWriter writer = new PrintWriter("resultado_pesquisa_filmes.txt")){
           writer.println(resultado.toString());
           JOptionPane.showMessageDialog(null, "Resultado salvo com sucesso!");
        }
        catch(IOException e){
           JOptionPane.showMessageDialog(null, "Erro ao salvar o arquivo.");
        }
    }
    
}
