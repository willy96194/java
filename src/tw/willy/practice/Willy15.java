package tw.willy.practice;

public class Willy15 {

	public static void main(String[] args) {
		int a = 10, b = 3;
		
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
			
		System.out.printf("a=%d, b=%d",a,b);

	}

}
