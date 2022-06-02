/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lucas.observer;
/**
 *
 * @author Lucas
 */
 
import java.util.ArrayList;
import java.util.List;
 
public class Canonical implements Subject{
     private List<Observer> distros = new ArrayList<>();

    @Override
    public void addSubscriber(Observer distro) {
        distros.add(distro);
    }
    @Override
    public void removeSubscriber(Observer distro) {
        distros.remove(distro);
    }
    @Override
    public void notifySubscribers() {
        System.out.println("Uma nova atualizacao esta disponivel");
        for(Observer distro: distros) {
            distro.update("Atualizacao");
        }
    }
}

