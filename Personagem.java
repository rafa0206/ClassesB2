/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.usjt_ccp1an_pla_jogo;

/**
 *
 * @author JFernandes
 */
// instancia = objeto
public class Personagem {
    
    //variáveis de instância
    String nome;
    private int energia = 10;
    private int fome = 0;
    private int sono = 0;
    
    private int idade;
    
    void setIdade (int idade){
        if (idade >= 18)
            this.idade = idade;
    }
    
    
    
    //tipo de retorno
    //nome
    //lista de parametros
    //corpo
    void cacar (){
        if (energia >= 2){
            System.out.println(nome + " caçando");
            energia -= 2;
        }else{
            System.out.println(nome  + " sem energia para cacar");
        }
        fome = Math.min (fome + 1, 10);
        sono = Math.min (sono + 1, 10);
    }
    
    void comer (){
        if (fome >= 1){
            System.out.println(nome + " comendo");
            energia = Math.min (energia + 1, 10);
            fome -= 1;
        }
        else{
            System.out.println(nome + " sem fome");
        }
        
    }

    void dormir (){
        if (sono >= 1){
            System.out.println(nome + " dormindo");
            sono--;
            //operador ternário
            energia = energia + 1  <= 10 ? energia + 1 : 10;
        }
        
    }
}

// operador de auto referência: this

    
    
    

