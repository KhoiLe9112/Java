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
public class Day {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a;
    do {
            System.out.println("Nhap vao 1 so ");
            a= input.nextInt(); } while (a<1 && a>7);
    if (a==1){
        System.out.println("Monday ");};
    if (a==2){
        System.out.println("Tuesday ");};
    if (a==3){
        System.out.println("Wednesday ");};
    if (a==4){
        System.out.println("Thursday ");};
    if (a==5){
        System.out.println("Friday ");};
    if (a==6){
        System.out.println("Saturday ");};
    if (a==7){
        System.out.println("Sunday ");};
    }
}
