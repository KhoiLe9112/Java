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
public class pass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char username;
        int password;
        System.out.println("Username: ");
        username = (char) input.nextInt();
        System.out.println("Password: ");
        password = input.nextInt();
        if ((username == "HuyHoang") && password == 2021) {
            System.out.println("Ban da nhap sai username va password ");}
        else {
            System.out.println("Ban da nhap dung username va password ");}
        
    }
}*/

package Chapter_4;

import java.util.Scanner;
/**
 *
 * @author admin
 */
public class pass {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username;
        int password;
        System.out.println("Username: ");
        username = input.nextLine();
        System.out.println("Password: ");
        password = input.nextInt();
        if ((username == "HuyHoang") && (password == 2021)) {
            System.out.println("Ban da nhap sai username va password ");}
        else {
            System.out.println("Ban da nhap dung username va password ");}
        
    }
}