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
public class solution {
     public static void main(String[] args) {
       
        System.out.println("a= ");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        System.out.println("b= ");
        double b = input.nextDouble();
        System.out.println("x=  " + (-b/a));
    }
}
