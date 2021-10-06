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
public class Lap17 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, sum = 0;
        System.out.println("Enter n: ");
        n = scan.nextInt();
        while(n > 0) {
            sum += n%10;
            n = n/10;
        }
        System.out.println("The total number of digits is: " + sum);
    }
}
