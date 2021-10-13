/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ham;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class b3 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        String s = "LMK"; 
        System.out.println("Enter n: ");
        boolean check = true;
        while (check) {
            n = input.nextInt();
            if (n > 0) {
                check = false;
            } else {
                System.out.println("Nhap lai; ");
            }
        }
        for (int i = 0; i < n; i++) {
            b3.Output(s);
        }
    }
    public static void Output(String s) {
        System.out.printf("%S\n", s);
    }
}
