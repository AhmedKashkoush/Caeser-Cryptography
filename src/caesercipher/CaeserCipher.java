/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caesercipher;

import java.util.Scanner;

/**
 *
 * @author Osama
 */
public class CaeserCipher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        System.out.print("Enter Plain: ");
        Scanner input = new Scanner(System.in);
        CaeserED c = new CaeserED();
        c.encrypt(input.next(), 1);
        System.out.print("Cipher: ");
        System.out.println(c.getCipher());       
        c.decrypt();
        System.out.print("Plain: ");
        System.out.println(c.getPlain());
    }
    
}
