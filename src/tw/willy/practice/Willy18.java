package tw.willy.practice;

import tw.willy.api.Bike;
import tw.willy.api.Scooter;

public class Willy18 {

	public static void main(String[] args) {
		Scooter s1 = new Scooter();
		s1.changeGear(4);
		s1.upSpeed(); s1.upSpeed();
		s1.upSpeed(); s1.downSpeed();
		System.out.println(s1.getSpeed());
		
		Bike b1 = new Bike();
		b1.upSpeed(); b1.upSpeed();
		System.out.println(b1.getSpeed());

	}

}
