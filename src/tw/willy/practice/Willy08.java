package tw.willy.practice;

public class Willy08 {

	public static void main(String[] args) {
		int month = 12;
		int days;
		switch (month) {
		case 4,6,9,11:
			days = 30;
			break;
		case 2:
			days = 28;
			break;
		default:
			days = 31;
		}
	    System.out.printf("%d月有%d天",month,days);
	}

}
