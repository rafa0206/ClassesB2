/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.usjt_ccp1an_pla_jogo;

import javax.swing.JOptionPane;
/**
 *
 * @author JFernandes
 */

class Pessoa{
    String nome;
    int idade;
}

public class Jogo {
    
    public static void main(String [] args) throws InterruptedException {
        Personagem cacador = new Personagem();
        Personagem soneca = new Personagem();
        cacador.nome = JOptionPane.showInputDialog("Qual o nome do seu personagem 1?");
        soneca.nome = JOptionPane.showInputDialog("Qual o nome do seu personagem 2");
        while (true){
            soneca.dormir(); 
            cacador.cacar();
            soneca.cacar();
            cacador.comer();
            soneca.dormir();
            cacador.dormir();
            soneca.cacar();      
            cacador.comer();
            cacador.dormir();
            cacador.cacar();
            System.out.println("============================");
            Thread.sleep(3000);
        }
                                           
    }
    
}

    

