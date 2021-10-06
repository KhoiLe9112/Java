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
public class Lap8 {
    public static void main(String[] args) {
        int i,fact=1;  
        Scanner input = new Scanner(System.in);
        int a;
        System.out.println("a= ");
        a = input.nextInt();
        for(i=1;i<=a;i++){    
            fact=fact*i;}    
        System.out.println(a+"! = "+fact);    
  
    }
}
