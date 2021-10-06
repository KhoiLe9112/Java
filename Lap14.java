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
public class Lap14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = 0, num2 = 1;
        System.out.println("Enter the number of Fibonance: ");
        int n = scan.nextInt();
        System.out.println("Fibonacci series: ");
        for (int i = 1; i <= n; ++i) {
            System.out.print(num1 + ", ");
            int next = num1 + num2;
            num1 = num2;
            num2 = next;
        }
  }
}
