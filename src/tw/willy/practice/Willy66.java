package tw.willy.practice;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Willy66 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.ispan.com.tw");
			HttpURLConnection conn =  (HttpURLConnection)url.openConnection();
			
			BufferedReader reader =
					new BufferedReader(
							new InputStreamReader(conn.getInputStream()));
			String line; StringBuffer sb = new StringBuffer();
			while((line = reader.readLine()) != null) {
				sb.append(line + "\n");
			}
			reader.close();
			conn.disconnect();
			
			FileOutputStream fout = new FileOutputStream("dir1/iii.html");
			fout.write(sb.toString().getBytes());
			fout.close();
			System.out.println("Finish");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
