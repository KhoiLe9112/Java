
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Lap9 {
    public static void main(String[] args)   {  
        int reverse = 0; 
        Scanner input = new Scanner(System.in);
        int a;
        System.out.println("a= ");
        a = input.nextInt();
        while(a != 0)   
        {  
            int du = a % 10;  
            reverse = reverse * 10 + du;  
            a = a/10;  }  
            System.out.println("So dao nguoc la: " + reverse);  
    }  
}
