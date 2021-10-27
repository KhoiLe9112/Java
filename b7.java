/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class b7 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String storageS = "";
        char ch;
        System.out.println("Enter string: ");
        String s = scan.nextLine();
        for (int i = 0; i < s.length(); i++) {
            ch= s.charAt(i);
            storageS = ch + storageS;
        }
        System.out.println("Reversed string: " + storageS);
    }
}
