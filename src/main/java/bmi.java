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
public class bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bmi = sc.nextInt();
        if (bmi<18.5){
            System.out.println("Underweight");
        }
        if ((bmi>=18.5) && (bmi<25)){
            System.out.println("Normal");
        }
        if ((bmi>=25) && (bmi<30)){
            System.out.println("Overweight");
        }
        if (bmi > 30){
            System.out.println("Obese");
        }}
}
