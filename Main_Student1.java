/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HuongDoiTuong;
import java.io.*;

/**
 *
 * @author USER
 */
public class Main_Student1 {
     public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
       
        Student1 a = new Student1("Khoi Le", "09/11/2002", "Male", 1, 1);
        Student1 b = (Student1)a.clone();
        System.out.println("Thong tin hoc sinh b");
        System.out.println(b.toString());
       
        System.out.println("So sanh 2 diem trung binh cua 2 hoc sinh");
        System.out.println(a.compareTo(b));
        
        System.out.println("Dua du lieu hoc sinh a vao file");
        FileOutputStream fos
            = new FileOutputStream("C:\\Users\\USER\\Documents\\NetBeansProjects\\Buoi3\\src\\main\\java\\text_student1.txt");
        ObjectOutputStream oos
            = new ObjectOutputStream(fos);
        oos.writeObject(a);
        
        System.out.println("Lay du lieu tu file");
        // De-serializing 'a'
        FileInputStream fis
            = new FileInputStream("C:\\Users\\USER\\Documents\\NetBeansProjects\\Buoi3\\src\\main\\java\\text_student1.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student c = (Student)ois.readObject(); // 
        System.out.println(c.toString());
        oos.close();
        ois.close();
    }   
}
