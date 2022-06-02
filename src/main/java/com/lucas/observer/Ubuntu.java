/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lucas.observer;

/**
 *
 * @author Lucas
 */
public class Ubuntu implements Observer{
    @Override
    public void update(String message){
        ProcessarMensagem(message);
    }
    
    public void ProcessarMensagem(String message){
        System.out.println("Ubuntu recebeu a atualizacao");
    }
}
