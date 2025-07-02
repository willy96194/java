package tw.willy.practice;

import tw.willy.api.Bike;

public class Willy17 {

	public static void main(String[] args) {
		Bike b1 = new Bike();
		Bike b2 = new Bike();
		
        while(b2.getSpeed() <= 20) {
        	b2.upSpeed();
        }
        System.out.println(b2.getSpeed());
        
        do {
        	b1.upSpeed();
        }while(b1.getSpeed() <= 20);
        System.out.println(b1.getSpeed());
        }

}
