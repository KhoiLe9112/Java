/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HuongDoiTuong;
import java.lang.Cloneable;
import java.io.Serializable;
/**
 *
 * @author USER
 */
public class Student1 implements Cloneable, Comparable, Serializable{
    String fullname;
    String birthdate;
    String gender;
    double gpa;
    int social_activities;

    public Student1() {
    }

    public Student1(String fullname, String birthdate, String gender, double gpa, int social_activities) {
        this.fullname = fullname;
        this.birthdate = birthdate;
        this.gender = gender;
        this.gpa = gpa;
        this.social_activities = social_activities;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getSocial_activities() {
        return social_activities;
    }

    public void setSocial_activities(int social_activities) {
        this.social_activities = social_activities;
    }

    @Override
    public String toString() {
        return "Student{" + "fullname=" + fullname + ", birthdate=" + birthdate + ", gender=" + gender + ", gpa=" + gpa + ", social_activities=" + social_activities + '}';
    }
   
    @Override
    protected Object clone()
        throws CloneNotSupportedException
    {
        return super.clone();
    }
    
    @Override
    public int compareTo(Student1 st) {
        if (gpa == st.gpa && social_activities == st.social_activities) {
            return 0;
        } 
        if (gpa == st.gpa && social_activities > st.social_activities) {
            return 1;
        }
        if (gpa > st.gpa) {
            return 1;
        }
        return -1;
    }  
}
