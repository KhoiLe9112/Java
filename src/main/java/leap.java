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
public class leap {
  
    public static void main(String[] args) {
        int y;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap nam ");
        y = scan.nextInt();
        boolean leap = false;
        if(y % 4 == 0)
        {
            if( y % 100 == 0)
            {
                if ( y % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else {
            leap = false;
        }
        if(leap==true)
            System.out.println("nhuan.");
        else
            System.out.println("khong nhuan.");
    }
} 

