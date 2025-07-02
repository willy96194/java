package tw.willy.practice;

import java.util.Scanner;

public class Willy03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("X = ");
		int x = scanner.nextInt();
		System.out.println("Y = ");
		int y = scanner.nextInt();
		int r1 = x + y ;
		int r2 = x - y ;
		int r3 = x * y ;
		int r4 = x / y ;
		int r5 = x % y ;
		
		System.out.printf("%d + %d = %d\n",x ,y , r1);
		System.out.printf("%d - %d = %d\n",x ,y , r2);
		System.out.printf("%d * %d = %d\n",x ,y , r3);
		System.out.printf("%d / %d = %d......%d\n",x, y, r4, r5);
	}

}
