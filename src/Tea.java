
import java.io.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pieter.mels
 */
public class Tea extends CaffeineBeverage {
    
    public void brew() {
        System.out.println("Laat de thee trekken");
    }
    
    public void addCondiments() {
        System.out.println("Voeg citroen toe");
    }
    
    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        
        if(answer.toLowerCase().startsWith("j")) {
            return true;
        } else {
            return false;
        }
    }
    
    private String getUserInput() {
        String answer = null;
        System.out.print("Wil je citroen in je thee (j/n)?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO error bij het lezen van je antwoord");
        }
        if (answer == null) {
            return "nee";
        }
        return answer;        
    }
    
}
