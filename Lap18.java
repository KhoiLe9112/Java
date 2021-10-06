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
public class Lap18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scan.nextInt();
        if (prime(n)) {
            int num1 = 0, num2 = 1;
            System.out.println("Fibonacci series: ");
            for (int i = 1; i <= n; ++i) {
                System.out.print(num1 + ", ");
                int next = num1 + num2;
                num1 = num2;
                num2 = next;
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
