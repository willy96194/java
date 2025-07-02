package tw.willy.practice;

public class Willy07 {

	public static void main(String[] args) {
		int year = 2028;
		boolean isLeap;
		if ((year % 4 == 0   && year % 100 != 0) || year % 400 == 0) {
			isLeap = true;
		}else {
			isLeap = false;
		}
		System.out.printf("%d年是%s年",year,isLeap?"潤":"平");

	}

}
