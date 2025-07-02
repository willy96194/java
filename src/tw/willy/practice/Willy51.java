package tw.willy.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Willy51 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try(FileInputStream fin = new FileInputStream("dir1/123.jpg");
				FileOutputStream fout = new FileOutputStream("dir2/123.jpg");) {
			int b;
			while( (b = fin.read()) != -1 ) {
				
			}
			System.out.println("Finish");
			System.out.println(System.currentTimeMillis()-start);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
