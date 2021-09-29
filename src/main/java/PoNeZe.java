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
public class PoNeZe {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double a;
    System.out.println("Nhap vao a ");
    a= input.nextDouble();   
    if (a==0) {
       System.out.println("Zero"); }
    else if (a>0 && a<1) {
       System.out.println("Small positive"); }
    else if (a>1000000) {
       System.out.println("Large positive"); }
    else if (a>1 && a<1000000) {
       System.out.println("Positive"); }
    else if (a<0) {
       System.out.println("Negative"); }
    }
}
