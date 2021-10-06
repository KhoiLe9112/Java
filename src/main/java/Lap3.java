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
public class Lap3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a;
        System.out.println("a= ");
        a = input.nextInt();
        int sum=0;
        for (int i=0; i<=a; i++){
            sum=sum+i;
            }
        System.out.println("sum= "+sum);
    }
}
