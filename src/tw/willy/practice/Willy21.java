package tw.willy.practice;

public class Willy21 {

	public static void main(String[] args) {
		Willy211 obj1 = new Willy211(0);
        Willy212 obj2 = new Willy212(); 
        Willy213 obj3 = new Willy213(1.0);
	}
}
class Willy211 extends Object{
	Willy211(int a) {
		//super();
		System.out.println("Willy211(int)");
		}
}

class Willy212 extends Willy211{
	Willy212(){
		// super();
		super(1);
		System.out.println("Willy212()");
	}
}
class Willy213 extends Willy212{
	Willy213(){
		System.out.println("Willy213()");
	}
	
	Willy213(int a){
		this();
		System.out.println("Willy213(int)");
	}
	
	Willy213(double a){
		this(2);
		System.out.println("Willy213(double)");
	}
}