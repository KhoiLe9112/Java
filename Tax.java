/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HuongDoiTuong;

/**
 *
 * @author USER
 */
public interface Tax {
    public abstract double payTax(double income, String start_time,String end_time);
}
