package tw.willy.practice;

import tw.willy.api.Bike;

public class Willy23 {

	public static void main(String[] args) {
		String s1 = "Willy";
		String s2 = "Willy";
		String s3 = new String("Willy");
		String s4 = new String("Willy");
		
		int a = 10, b = 10;
		System.out.println(a == b);
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s2));

	}

}
