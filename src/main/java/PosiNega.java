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
public class PosiNega {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a;
    System.out.println("Nhap vao 1 so ");
    a= input.nextInt();
    if (a>0) {
        System.out.println("Positive");}
    else if (a<0) {
        System.out.println("Negative");}
   }
}
