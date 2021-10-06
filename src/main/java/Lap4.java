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
public class Lap4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a;
        System.out.println("a= ");
        a = input.nextInt();
        int count=1;
        for (int i=0; i<a; i++){
            a=a/10;
            count++;}
        System.out.println("so chu so cua a la "+count);
    }
}
