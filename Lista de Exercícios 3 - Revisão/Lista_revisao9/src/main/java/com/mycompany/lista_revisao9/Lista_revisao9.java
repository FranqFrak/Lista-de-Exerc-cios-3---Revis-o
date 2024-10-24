/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao9;

/**
 *
 * @author franq
 */
import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
public class Lista_revisao9 {

    public static void main(String[] args) {
      
      String nomeCliente =JOptionPane.showInputDialog("Digite o seu nome:");
       
      int qtdItens = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos Itens você Deseja:")); 
      
      String[] itens = new String[qtdItens];
      int[] quantidade = new int[qtdItens];
      double[] precos = new double[qtdItens];
      
      double totalPedido =0.0;
      
      for(int i=0; i< qtdItens; i++){
         itens[i] = JOptionPane.showInputDialog("Digite o nome do Iten" + (i+1) +":");
         quantidade[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de"+ itens[i] +":"));
         precos[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco de"+ itens[i] + ":"));
         
         totalPedido += quantidade[i]*precos[i];
      }
      StringBuilder resumoPedido = new StringBuilder("Resumo do pedido de"+nomeCliente+ ":\n");
      for(int i=0; i<qtdItens; i++){
         resumoPedido.append(quantidade[i]).append("x").append(itens[i]).append("- R$").append(precos[i]).append("\n");
      }
      resumoPedido.append("Total: R$").append(totalPedido);
      
      JOptionPane.showMessageDialog(null, resumoPedido.toString());
      
      try(FileWriter writer = new FileWriter("pedido_"+nomeCliente+".txt")){
       writer.write(resumoPedido.toString());
       JOptionPane.showMessageDialog(null, "Pedido salvo em arquivo com sucesso!");
      }
      catch(IOException e){
         JOptionPane.showMessageDialog(null, "Erro ao salvar o arquivo:"+ e.getMessage());
      }
    }
    
}
