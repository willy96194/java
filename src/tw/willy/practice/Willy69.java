package tw.willy.practice;

public class Willy69 {

	public static void main(String[] args) {
		MyThread mt1 = new MyThread("A");
		mt1.setDaemon(true);
        mt1.start();
        
        System.out.println("main");
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		System.out.println("---------");
		mt1.interrupt();
	}
}
class MyThread extends Thread {
	private String name;
	
	MyThread(String name){this.name = name;}
	@Override
	public void run() {
		for (int i=0; i<20; i++) {
			System.out.printf("%s:%d\n",name,i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println(e);
				break;
			}
		}
	}
}