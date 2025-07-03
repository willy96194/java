package tw.willy.practice;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Willy59 {

	public static void main(String[] args) {
		String mesg = "Hello World";
		byte[] data = mesg.getBytes();
		try {
			DatagramSocket socket = new DatagramSocket();
			DatagramPacket pocket = new DatagramPacket(data, data.length,
					InetAddress.getByName("10.0.101.65"),8888);
			socket.send(pocket);
			socket.close();
			System.out.println("Send OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
