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
public class greatest {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a, b, c;
    System.out.println("Nhap vao a ");
    a= input.nextInt();
    System.out.println("Nhap vao b ");
    b= input.nextInt();
    System.out.println("Nhap vao c ");
    c= input.nextInt();
    if (a>=b && a>=c){
       System.out.println(a); }
    else if (b>=a && b>=c){
       System.out.println(b); }
    else if (c>=a && c>=b){
       System.out.println(c); }
    }
}
