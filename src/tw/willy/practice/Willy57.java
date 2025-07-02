package tw.willy.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Willy57 {

	public static void main(String[] args) {
		Willy573 obj = new Willy573();
		try {
			ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("dir1/Willy571.obj"));
			oout.writeObject(obj);
			oout.flush();
			oout.close();
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("------");
		try {
			ObjectInputStream oin = new ObjectInputStream(
					new FileInputStream("dir1/Willy571.obj"));
			Object obj2 = oin.readObject();
			oin.close();
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
class Willy571 implements Serializable{
	Willy571(){
		System.out.println("Willy571");
	}
	
}
class Willy572 extends Willy571 {
	Willy572(){System.out.println("Willy572");}
}
class Willy573 extends Willy572 {
	Willy573(){System.out.println("Willy573");}
}