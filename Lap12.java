/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Lap12 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter n: ");
        n = scan.nextInt();
        if (n >= 0) {
            int fact = 1;
            for(int i = 1; i <= n; i++)
            {
                fact = fact * i;
            }
            System.out.println("Factorial of " + n + " is: " + fact);
        } else {
            System.out.println("Math ERROR!");
        }
    }
}
