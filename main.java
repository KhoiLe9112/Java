/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HuongDoiTuong;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class main {
     public static void main(String[] args) throws IOException {
        
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\USER\\Documents\\NetBeansProjects\\Buoi3\\src\\main\\java\\testout.txt"));
            Car car_1 = new Car();
            car_1.input();
            oos.writeObject(car_1);
            System.out.println("Success...");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            oos.close();
        }
        
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("C:\\Users\\USER\\Documents\\NetBeansProjects\\Buoi3\\src\\main\\java\\testout.txt"));
            // read student
            Car car_1 = (Car) ois.readObject();
            System.out.println(car_1.toString());
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            ois.close();
        }
    }
}
    
