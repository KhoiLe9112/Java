/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ham;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class b4 {
    public static double giaiPt1(double a, double b){
        return (-b)/a ;};
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scan.nextDouble();
        System.out.println("Enter b: ");
        double b = scan.nextDouble();
        double x = giaiPt1(a,b);
        System.out.println(x);   
    }
}
