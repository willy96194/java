package tw.willy.practice;

public class Willy71 {

	public static void main(String[] args) {
		Willy711 obj1 = new Willy711();
		Willy712 obj2 = new Willy712();
		obj1.start();
//		obj2.run();
		Thread t1 = new Thread(obj2);
		t1.start();

	}

}
class Willy711 extends Thread{
	@Override
	public void run() {
		System.out.println("Willy711 : run thread");
	}
}

class Willy712 implements Runnable {
	@Override
	public void run() {
		System.out.println("Willy712 : run");
		
	}
}