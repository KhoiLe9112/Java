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
public class YearsFromMinutes {
    public static void main(String[] Strings) {
        System.out.println("Nhap so phut ");
        double minutesInYear = 60 * 24 * 365;
        Scanner input = new Scanner(System.in);
        double min = input.nextDouble();
        long years = (long) (min / minutesInYear);
        int days = (int) (min / 60 / 24) % 365;
        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
    }
}


