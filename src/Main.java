/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pieter.mels
 */
public class Main {

    public static void main (String[] args) {
        
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        
        System.out.println("\nMaak thee...");
        tea.prepareRecipe();
        
        System.out.println("\nMaak koffie...");
        coffee.prepareRecipe();
        
    }
    
}
