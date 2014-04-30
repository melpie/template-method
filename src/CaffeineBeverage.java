/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pieter.mels
 */
public abstract class CaffeineBeverage {
    
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }
    
    abstract void brew();
    
    abstract void addCondiments();
    
    final void boilWater() {
        System.out.println("Kook water");
    }
    
    final void pourInCup() {
        System.out.println("Schenk in een kopje");
    }
    
    boolean customerWantsCondiments() {
        return true;
    }
    
}
