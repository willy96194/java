package tw.willy.api;

public class Scooter extends Bike{
	private int gear;
	private String color;
	
	public Scooter() {
		System.out.println("Scooter()");
	    color = "red";
	}
	
	public String getColor() {
		return color;
	}
	
	@Override
	public Scooter upSpeed() {
		if(gear >0) {
			speed = speed < 1 ? 1 : speed*1.8*gear;
		}
		return this;
	}

	public int changeGear(int gear) {
		if(gear >=0 && gear <=4) {
			this.gear = gear;
		}
		
		return this.gear;
	}
}
