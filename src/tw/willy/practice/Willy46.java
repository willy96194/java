package tw.willy.practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Willy46 {

	public static void main(String[] args) {
		String mesg = "Hello Willy\nabcdefg\n1234567\n7654321";
		byte[] buf = mesg.getBytes();
		try {
			FileOutputStream fout = new FileOutputStream("dir1/file1.txt");
			fout.write(buf);
			fout.flush();
			fout.close();
			System.out.println("OK");
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			System.out.println(e);
		}

	}

}
