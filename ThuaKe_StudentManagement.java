/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThuaKe;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author USER
 */
public class ThuaKe_StudentManagement {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  
        System.out.println("Nhap so luong hoc sinh: ");
        int n = scan.nextInt();
        scan.nextLine();
        ThuaKe_Student[] st = new ThuaKe_Student[n];
        //Nhap thong tin sinh vinh
        for (int i = 0; i < n; i ++) {
            st[i] = new ThuaKe_Student();
            st[i].nhap();
        }
        //Xuat ra danh sach sinh vien
        for (int i = 0; i < n; i++) {
            System.out.println(st[i].toString() + "\n");
        }
        
        //Tim kiem sinh vien co cung nam
        System.out.println("Nhap so nam can tim kiem: ");
        int nam = scan.nextInt();
        //xuat ra cac sinh vien co nam vua tim kiem duoc
        Vector<ThuaKe_Student> stVector1 = timKiemNam(st, n, nam);
        for (int i = 0; i < stVector1.size(); i++) {
            stVector1.get(i).toString();
        }
        
        //Tim kiem sinh vien co cung ten
        System.out.println("Nhap ten can tim kiem: ");
        String ten = scan.nextLine();
        //xuat ra cac sinh vien co nam vua tim kiem duoc
        Vector<ThuaKe_Student> stVector2 = timKiemTen(st, n, ten);
        for (int i = 0; i < stVector2.size(); i++) {
            stVector2.get(i).toString();
        }
        
    }  
    
    public static Vector timKiemNam(ThuaKe_Student arr[], int n, int nam) {
        Vector<ThuaKe_Student> vector = new Vector<>();
        for (int i = 0; i < n; i++) {
            if (arr[i].birth_year == nam) {
                vector.add(arr[i]);
            }
        }
        return vector;
    }
    
    public static Vector timKiemTen(ThuaKe_Student arr[], int n, String ten) {
        Vector<ThuaKe_Student> vector = new Vector<>();
        for (int i = 0; i < n; i++) {
            if (arr[i].name.equals(ten)) {
                vector.add(arr[i]);
            }
        }
        return vector;
    }
}
