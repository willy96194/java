package tw.willy.practice;

import java.io.File;
import java.io.IOException;

public class Willy41 {

	public static void main(String[] args) {
		File f1 = new File("d:/Willy/dir1/file1");
//		if(!f1.exists()) {
			try {
				if(f1.createNewFile()) {
					
				}else {
					System.out.println("XX");
				}
			}catch(IOException e) {
				System.out.println(e);
			}
//		}

	}

}
