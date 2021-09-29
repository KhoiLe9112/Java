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
public class SumAverage {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a, b, c, d, e;
    System.out.println("Nhap 5 so ");
    a= input.nextInt();
    b= input.nextInt();
    c= input.nextInt();
    d= input.nextInt();
    e= input.nextInt();
    int s=a+b+c+d+e;
    System.out.println("tong la " +s);
    double av=s/5;
    System.out.println("trung binh la " +av);
    }
}
