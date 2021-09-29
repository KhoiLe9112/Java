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
public class SoSanh {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double a, b;
    System.out.println("Nhap vao a ");
    a= input.nextDouble();
    System.out.println("Nhap vao b ");
    b= input.nextDouble();
    a=Math.round(a * 1000) / 1000;
    b=Math.round(b * 1000) / 1000;
    if (a==b){
        System.out.println("Similar");}
    else {
        System.out.println("Different");} 
    }
}
