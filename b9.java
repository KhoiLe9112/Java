/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ham;

import java.util.Random;
/**
 *
 * @author USER
 */
public class b9 {
     public static void main(String[] args) {
        int[] a = new int[5];
        b9.getRandValues(a);
        float avg = b9.Average(a);
        System.out.print("Average of above Array: " + avg);
    }
   
    public static void getRandValues(int[] a) {
        System.out.println("Enter values: ");
        for (int i = 0; i < a.length; i++) {
            Random rand = new Random();
            a[i] = rand.nextInt(100)+1;
        }
        System.out.println("Array: ");
        for(int i = 0; i < a.length; i++)               
        System.out.println(a[i]);
    }
    
    public static float Average(int[] a) {
        float avg = 0;
        for (int i = 0; i < a.length; i++) {
            avg += a[i];
        }
        avg /= (float)(a.length);
        return avg;
    }
}
