package tw.willy.practice;

import java.io.File;

public class Willy40 {

	public static void main(String[] args) {
		File f1 = new File("d:\\Willy\\dir2");
		if(f1.exists()) {
			System.out.println("Ok");
		}else {
			System.out.println("XX");
			f1.mkdir();
		}

	}

}
