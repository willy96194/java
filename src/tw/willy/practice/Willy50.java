package tw.willy.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Willy50 {

	public static void main(String[] args) {
		File f1 = new File("dir1/file1.txt");
		byte[] buf = new byte[(int)(f1.length())];
		try {
			FileInputStream fin = new FileInputStream(f1);
			fin.read(buf);
			System.out.println(new String(buf));
			
			fin.close();
			System.out.println("OK");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
