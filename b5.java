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
public class b5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a , b, c;
        System.out.println("Enter a, b and c: ");
        a = input.nextFloat();
        b = input.nextFloat();
        c = input.nextFloat();
        b5.giaiPt2(a, b, c);
    }
    
    public static void giaiPt2(float a, float b, float c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Vo nghiem");
            } else {
                System.out.println("pt co nghiem "
                        + "x = " + (-c / b));
            }
            return;
        }
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("pt co 2 nghiem "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("pt co nghiem kep "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("vo nghiem");
        }
    }
}
