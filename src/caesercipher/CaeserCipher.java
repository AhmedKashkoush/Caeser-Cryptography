package caesercipher;

import java.util.Scanner;

public class CaeserCipher {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        CaeserED c = new CaeserED();
        System.out.print("Enter Plain: ");
        String plainT = input.nextLine();
        System.out.print("Enter Key: ");
        int key = input.nextInt();
        c.encrypt(plainT, key);
        System.out.print("Cipher: ");
        System.out.println(c.getCipher());
        c.decrypt();
        System.out.print("Plain: ");
        System.out.println(c.getPlain());
    }

}
