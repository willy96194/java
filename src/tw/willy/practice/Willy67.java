package tw.willy.practice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Willy67 {

	public static void main(String[] args) {
		String target = "https://www.gamer.com.tw";
		try {
			URL url = new URL(String.format("https://pdfmyurl.com/index.php?url=%s",target ));
			HttpURLConnection conn =  (HttpURLConnection)url.openConnection();
			
			conn.setRequestMethod("POST");
			conn.setConnectTimeout(3*1000);
			conn.setReadTimeout(10*1000);
			
			BufferedInputStream bin =
					new BufferedInputStream(conn.getInputStream());
			BufferedOutputStream bout =
					new BufferedOutputStream(new FileOutputStream("dir2/momo.pdf"));
			byte[] buf = new byte[4*1024]; int len;
			while((len = bin.read(buf))!= -1) {
				bout.write(buf,0,len);
			}
			bout.flush();
			bout.close();
			bin.close();
			
			System.out.println("Finish");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
