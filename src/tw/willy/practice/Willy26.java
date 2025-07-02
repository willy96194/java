package tw.willy.practice;

public class Willy26 {

	public static void main(String[] args) {
		Willy261.m2();
		Willy261.m2();
		Willy261.m2();
		
		Willy261 obj1 = new Willy261();
		Willy261 obj2 = new Willy261();

	}
}
class Willy261 {
	{
		System.out.println("Willy261{}");
		m1();
		m2();
	}
	static {
		System.out.println("Willy261():static{}");
		m2();
	}
	Willy261(){
		System.out.println("Willy261()");
	}
	void m1() {
		System.out.println("Willy261():m1()");
	}
	static void m2(){
		System.out.println("Willy261():static:m2()");
	}

}
