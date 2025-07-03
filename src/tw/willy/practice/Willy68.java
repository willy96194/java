package tw.willy.practice;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONArray;
import org.json.JSONObject;

public class Willy68 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://data.moa.gov.tw/Service/OpenData/ODwsv/ODwsvTravelStay.aspx");
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
			
			parseJSON(sb.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static void parseJSON(String json) {
		JSONArray root = new JSONArray(json);
		System.out.println(root.length());
		for(int i=0; i<root.length();i++) {
			JSONObject row = root.getJSONObject(i);
			String name = row.getString("Name");
			String city = row.getString("City");
			String town = row.getString("Town");
			String addr = row.getString("Address");
			String tel = row.getString("Tel");
			System.out.printf("%s :%s%s %s : %s\n",name, city, town, addr, tel);
		}
	}
}

