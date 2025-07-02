package tw.willy.practice;

public class Willy31 {
	public static void main(String[] args) {
		Willy311 obj1 = new Willy312();
		Willy311 obj2 = new Willy313();
		Willy314 obj3 = new Willy312();
		obj1.m1();
		obj3.m3();
	}
}
interface Willy311{
	void m1();
	void m2();
}
class Willy312 extends Object implements Willy311,Willy314{
	public void m1() {}
	public void m2() {}
	public void m3() {}
	public void m4() {}
}
class Willy313 implements Willy311{
	public void m1() {}
	public void m2() {}
}
interface Willy314{
	void m3();
	void m4();
}
interface Willy315 extends Willy311, Willy314 {
	void m5();
	void m6();
}
class Willy316 implements Willy315{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m6() {
		// TODO Auto-generated method stub
		
	}
	
}