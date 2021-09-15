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


public class status {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        if (s == 0) {
            System.out.println("Compute tax for single filers.");
        } else if (s == 1) {
            System.out.println("Compute tax for married file jointly or or qualifying widow(er).");
        } else if (s == 2) {
            System.out.println("Compute tax for married file separately.");
        } else if (s == 3) {
            System.out.println("Compute tax for head of household.");
        } else {
            System.out.println("Wrong Status Code");
        }
    }
}
