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
public class CF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double f;
        System.out.println("Nhap do F ");
        f= input.nextDouble();
        System.out.println(f +" degree Fahrenheit is equal to " +((f-32)/1.8)+" in Celsius");
    }
}
