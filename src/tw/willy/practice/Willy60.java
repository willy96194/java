package tw.willy.practice;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Willy60 {

	public static void main(String[] args) {
		byte[] buf = new byte[4096];
		try {
			DatagramSocket socket = new DatagramSocket(8888);
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			System.out.println("wait...");
			socket.receive(packet);
			socket.close();
			System.out.println("Receiver OK");
			String urip = packet.getAddress().getHostAddress();
			int len = packet.getLength();
			byte[] data = packet.getData();
			System.out.printf("%s:%s\n",urip,new String(data,0,len));
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
