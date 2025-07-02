package tw.willy.practice;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import tw.willy.api.Student;

public class Willy56 {

	public static void main(String[] args) {
		try(FileInputStream fin = new FileInputStream("dir1/willy.score");
				ObjectInputStream oin = new ObjectInputStream(fin)){
			Object obj = oin.readObject();
			Student s1 = (Student)obj;
			System.out.println(s1.sum());
			System.out.println(s1.avg());
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
