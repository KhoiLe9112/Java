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
public class InchMet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double i;
        System.out.println("Nhap inch ");
        i= input.nextDouble();
        System.out.println(i+" inch is " +(i*0.0254)+" meters");
    }
}
