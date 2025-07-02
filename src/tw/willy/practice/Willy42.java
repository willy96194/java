package tw.willy.practice;

public class Willy42 {

	public static void main(String[] args) {
		int a = 10, b = 0;
		int c;
		int[] d = {1,2,3,4};
		
		System.out.println("Hello World");
		try {
			c = a / b;
			System.out.println(c);
			System.out.println(d[2]);
			
//		}catch(ArithmeticException e) {
//			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch(RuntimeException e) {
			System.out.println("XXX");
		}
		System.out.println("finish");

	}

}
