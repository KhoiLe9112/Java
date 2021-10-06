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
public class Lap7 {
    public static void main(String[] args) {
        int so1 = 0, so2 = 1;
        System.out.println("10 so Fibonacci dau tien la: ");
        for (int i = 1; i <= 10; ++i) {
          System.out.print(so1 + ", ");
          int sotieptheo = so1 + so2;
          so1 = so2;
          so2 = sotieptheo;
        }
  }
}
