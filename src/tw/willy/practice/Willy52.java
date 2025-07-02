package tw.willy.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Willy52 {
	public static void main(String[] args) {
	long start = System.currentTimeMillis();
	File source = new File("dir1/123.jpg");
	byte[] buf = new byte[(int)source.length()];
	try(FileInputStream fin = new FileInputStream(source);
			FileOutputStream fout = new FileOutputStream("dir2/123.jpg");){
//		fin.read(buf);
//		fout.write(buf);
//		fout.flush();
		int len;
		while((len = fin.read(buf))!=-1) {
			fout.write(buf,0,len);
		}
		System.out.println("finish");
		System.out.println(System.currentTimeMillis()-start);
	}catch(Exception e) {
		System.out.println(e);
	}
	}
}
