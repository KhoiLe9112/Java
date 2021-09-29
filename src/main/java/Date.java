/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
/*import java.util.Scanner;
public class Date {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, y, d;
        System.out.println("Nhap thang ");
        m= input.nextInt();
        System.out.println("Nhap nam ");
        y= input.nextInt();
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
            if(leap==true){
                if (m==2){
                    d=29;}
                else if ((m==1) || (m==3) ||(m==5) || (m==7) || (m==8) || (m==10) || (m== 12))
                    d=31;
                else if ((m==4) || (m==6) ||(m==9) || (m==11))
                    d=30;
             }    
            else{
                if (m==2){
                    d=28;}
                else if ((m==1) || (m==3) ||(m==5) || (m==7) || (m==8) || (m==10) || (m== 12))
                    d=31;
                else if ((m==4) || (m==6) ||(m==9) || (m==11))
                    d=30;}
            System.out.println(d);
       }       
    
}*/
import java.util.Scanner;


public class Date {
    static boolean checkYear(int year)
    {
        return (((year % 4 == 0) && (year % 100 != 0)) ||
            (year % 400 == 0));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month, year, day = 28;
        System.out.println("Enter a month number:");
        month = input.nextInt();
        System.out.println("Enter a year number:");
        year = input.nextInt();
        switch (month) {
            case 1: day = 31;
                break;
            case 2: if (checkYear(year)) day = 29;
                break;
            case 3: day = 31;
                break;
            case 4: day = 30;
                break;   
            case 5: day = 31;
                break;
            case 6: day = 30;
                break;
            case 7: day = 31;
                break;   
            case 8: day = 31;
                break;   
            case 9: day = 30;
                break;    
            case 10: day = 31;
                break;   
            case 11: day = 30;
                break; 
            case 12: day = 31;
                break;       
        }
        System.out.println(day + "days");
    }
}

