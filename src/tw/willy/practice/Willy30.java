package tw.willy.practice;

public class Willy30 {

	public static void main(String[] args) {
//		Willy301 obj1 = new Willy301();
        Willy301 obj1 = new Willy302();
        Willy301 obj2 = new Willy303();
        obj1.m3();
        obj2.m3();
        
        Willy301 obj3 = new Willy301() {
        	void m3() {
        		System.out.println("Willy301:m3()");
        	}
        };
        obj3.m3();
	}

}
abstract class Willy301{
	Willy301(){System.out.println("Willy301()");}
	void m1() {}
	void m2() {}
	abstract void m3();
}
class Willy302 extends Willy301{
	void m3() {System.out.println("Willy302:m3()");}
}
class Willy303 extends Willy301{
	void m3() {System.out.println("Willy303:m3()");}
}