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

/**
 *
 * @author admin
 */
public class math {
    public static void main(String[] args) {
        System.out.println("What is 9 - 2?");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the question: ");
        int x = input.nextInt();
        if (x == 7) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
