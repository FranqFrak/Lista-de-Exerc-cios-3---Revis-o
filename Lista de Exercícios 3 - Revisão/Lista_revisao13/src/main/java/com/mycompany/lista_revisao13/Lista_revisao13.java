/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao13;

/**
 *
 * @author franq
 */
import javax.swing.*;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Lista_revisao13 {

    public static void main(String[] args) {
       int qtdProdutos = Integer.parseInt(JOptionPane.showInputDialog("Quantos produtos você deseja cadastrar?"));
       
       String[] produtos = new String[qtdProdutos];
       double[] precos = new double[qtdProdutos];
       
       for(int i=0; i<qtdProdutos; i++){
           produtos[i] = JOptionPane.showInputDialog("Digite o nome do produto"+(i+1)+ ":");
           precos[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto" + produtos[i] + ":"));
       }
       StringBuilder listaProdutos = new StringBuilder("Lista de Produtos:\n");
       for(int i=0; i<qtdProdutos;i++){
           listaProdutos.append(produtos[i]).append(" -R$").append(precos[i]).append("\n");
       }
       JOptionPane.showMessageDialog(null, listaProdutos.toString());
        
       try (PrintWriter writer = new PrintWriter(new FileWriter("cadastro_produto.txt"))){
           writer.println(listaProdutos.toString());
           JOptionPane.showMessageDialog(null," Cadastro salvo com sucesso!");
       }
       catch (IOException e){
           JOptionPane.showMessageDialog(null, "Erro ao salvar");
       }
         
    }
}
