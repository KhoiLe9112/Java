/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HuongDoiTuong;
import java.util.Date;
/**
 *
 * @author USER
 */
public class Student extends Person implements Tax{
    String name;
    String studentID;
    String phone;
    String email;

    public Student() {
    }

    public Student(String name, String studentID, String phone, String email) {
        this.name = name;
        this.studentID = studentID;
        this.phone = phone;
        this.email = email;
    }

    public Student(String name, String studentID, String phone, String email, String birthday, String gender, String blood_type) {
        super(birthday, gender, blood_type);
        this.name = name;
        this.studentID = studentID;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public double payTax(double income, String start_time, String end_time) {
        double percent = 0;
        if (income > 11000000) {
           percent = 0.5;
       }
        return percent;
    }
}
