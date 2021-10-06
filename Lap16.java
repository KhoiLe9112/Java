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
public class Lap16 {
     public static void main(String[] args) {
        System.out.println("All primes in the range are: ");
            for (int i = 10000; i < 99999; i+=2) {
                if (prime(i)) {
                    System.out.print(" " + i);
                }
            }
    }
    public static boolean prime(int n) { 
        if (n < 2) {
            return false;
        }
        int x = (int) Math.sqrt(n);
        for (int i = 2; i <= x; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }    
}
