package tw.willy.practice;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Willy58 {

	public static void main(String[] args) {
		try {
			InetAddress[] ips = InetAddress.getAllByName("www.hinet.net");
			for (InetAddress ip : ips) {
				System.out.println(ip.getHostAddress());
				
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
