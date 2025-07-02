package tw.willy.practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import tw.willy.api.Student;

public class Willy55 {

	public static void main(String[] args) {
		Student s1 = new Student("Willy", 76, 87, 100);
		System.out.println(s1.sum());
		System.out.println(s1.avg());
		System.out.println(s1.getBike().upSpeed().upSpeed().upSpeed().upSpeed().getSpeed());
		
		try {
			FileOutputStream fout = new FileOutputStream("dir1/Willy.score");
		    ObjectOutputStream oout = new ObjectOutputStream(fout);
		    oout.writeObject(s1);
			fout.flush();
			fout.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e);
		}
		

	}

}
