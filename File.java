/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HuongDoiTuong;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
/**
 *
 * @author USER
 */
public class File {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\USER\\Documents\\NetBeansProjects\\Buoi3\\src\\main\\java\\testout.txt"));
            System.out.println("Enter string: ");
            String s = scan.nextLine();
            oos.writeObject(s);
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
            String s2 = (String) ois.readObject();
            System.out.println(s2);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            ois.close();
        }
    }
}
