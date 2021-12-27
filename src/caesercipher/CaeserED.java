/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caesercipher;

/**
 *
 * @author Osama
 */
public class CaeserED {

    private boolean encrypted = false;
    private int key;
    private String plainText = "";
    private String cipherText = "";

    public void encrypt(String plainText, int key) throws Exception {
        if (encrypted) {
            decrypt();
            System.out.println(this.plainText);
            encrypted = false;
        }
        char cipherLetter;
        this.key = Math.abs(key);
        for (int i = 0; i < plainText.length(); i++) {
            cipherLetter = (char) (shift(plainText.charAt(i), this.key));
            cipherText += cipherLetter;
        }
        this.plainText = "";
        encrypted = true;
    }

    public void decrypt() throws Exception {
        if (encrypted) {
            char plainLetter;
            for (int i = 0; i < this.cipherText.length(); i++) {
                plainLetter = (char) (shift(this.cipherText.charAt(i), -this.key));
                this.plainText += plainLetter;
            }
            this.cipherText = "";
            encrypted = false;
        }
        else throw new Exception("There is no encrypted text,use encrypt() method to encrypt new one");
    }

    private int shift(char letter, int key) {
        int newLetter = (int) letter;
        return newLetter + key;
    }
    
    public String getPlain() throws Exception{
        if (!this.plainText.isEmpty()) return this.plainText;
        else throw new Exception("There is no plain text");
    }
    
    public String getCipher() throws Exception{
        if (!this.cipherText.isEmpty()) return this.cipherText;
        else throw new Exception("There is no cipher text");
    }    
}
