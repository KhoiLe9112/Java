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
public class speed {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		float timeSeconds;
		float mps,kph, mph;
		float distance = scanner.nextFloat();
		float hr = scanner.nextFloat();
		float min = scanner.nextFloat();
		float sec = scanner.nextFloat();
		timeSeconds = (hr*3600) + (min*60) + sec;
		mps = distance / timeSeconds;
		kph = ( distance/1000.0f ) / ( timeSeconds/3600.0f );
		mph = kph / 1.609f;
		System.out.println("Your speed in meters/second is "+mps);
		System.out.println("Your speed in km/h is "+kph);
		System.out.println("Your speed in miles/h is "+mph);
		

		scanner.close();
	}
}
