package tw.willy.practice;

public class Willy73 {

	public static void main(String[] args) {
		Willy731 b1 = new Willy731("A",10); 
		Willy731 b2 = new Willy731("B",20); 
		b1.start();
        b2.start(); 
        System.out.println("main start");
        try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}
        try {
			b1.join();
		} catch (InterruptedException e) {
		}
		System.out.println("main finish");
	}
}
class Willy731 extends Thread{
	private String name;
	private int count;
	Willy731(String name,int count){this.name = name;this.count = count;}
	@Override
	public void run() {
		for(int i=0; i<count; i++) {
			System.out.printf("%s:%d\n",name,i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}