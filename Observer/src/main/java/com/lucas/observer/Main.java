/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lucas.observer;

/**
 *
 * @author Lucas
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Subject canonical = new Canonical();
        
        Observer ubuntu = new Ubuntu();
        Observer zorin = new Zorin();
        Observer pop = new PopOS();
         
        System.out.println("Distribuicoes disponiveis: 1-Ubuntu 2-ZorinOS 3-PopOS!");
        
        
        Scanner in = new Scanner(System.in);
        
        int op = in.nextInt();
        
        switch(op){
            case 1:
                canonical.addSubscriber(ubuntu);
                break;
                
            case 2:
                canonical.addSubscriber(zorin);
                break;
                
            case 3:
                canonical.addSubscriber(pop);
                break;
                
            default:
                System.out.println("Opcao invalida");
        }
        
        canonical.notifySubscribers();
    }
}
