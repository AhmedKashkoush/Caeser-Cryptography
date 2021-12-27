package caesercipher;

import java.util.Scanner;

public class CaeserCipher {

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
