package tw.willy.practice;

public class Willy29 {

	public static void main(String[] args) {
		Willy291 obj1 = new Willy291();
		Willy291 obj2 = new Willy292();
		Willy291 obj3 = new Willy293();
        
		obj1.m1();
		obj2.m1();
		obj3.m1();
		Willy292 obj4 = (Willy292)obj2;
		obj4.m2();
		
		System.out.println(obj2==obj4);
		System.out.println(obj4 instanceof Willy291);
	}

}
class Willy291{
	void m1() {
		System.out.println("Willy291:m1()");
	}
}
class Willy292 extends Willy291{
	void m1() {
		System.out.println("Willy292:m1()");
	}
	void m2() {
		System.out.println("Willy292:m2()");
	}
}
class Willy293 extends Willy291{
	void m1() {
		System.out.println("Willy293:m1()");
	}
}