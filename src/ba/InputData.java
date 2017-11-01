/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ba;

import java.util.Scanner;

/**
 *
 * @author oscky
 */
public class InputData {
    private final String cipherText;
    private final String possibleWord;

    public InputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert cipher text:");
        this.cipherText = scanner.nextLine();
        System.out.println("Insert possible word:");
        this.possibleWord = scanner.nextLine();
        System.out.println("DONE.");
    }

    public String getCipherText() {
        return cipherText;
    }

    public String getPosibleWord() {
        return possibleWord;
    }
    
    
    
    
}
