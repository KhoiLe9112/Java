/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HuongDoiTuong;
import java.io.Serializable;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Car {
    String name;
    String engine;
    String seats;
    String production_date;

    public Car() {
    }

    public Car(String name, String engine, String seats, String production_date) {
        this.name = name;
        this.engine = engine;
        this.seats = seats;
        this.production_date = production_date;
    }

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    public String getSeats() {
        return seats;
    }

    public String getProduction_date() {
        return production_date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public void setProduction_date(String production_date) {
        this.production_date = production_date;
    }
    
     @Override
    public String toString() {
        return "Car{" + "name=" + name + ", engine=" + engine + ", seats=" + seats + ", production_date=" + production_date + '}';
    }
    
    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = scan.nextLine();
        System.out.println("Enter engine: ");
        engine = scan.nextLine();
        System.out.println("Enter the number of seats: ");
        seats = scan.nextLine();
        System.out.println("Enter production date: ");
        production_date = scan.nextLine();
    }
}
