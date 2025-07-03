package tw.willy.practice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Willy65 {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(7777);
			Socket socket = server.accept();
			BufferedInputStream bin = new BufferedInputStream(socket.getInputStream());
			byte[] allData = bin.readAllBytes();
			bin.close();
			String urip = socket.getInetAddress().getHostAddress();
			BufferedOutputStream bout = new BufferedOutputStream(
					new FileOutputStream(String.format("upload/%s.jpg", urip)));
			bout.write(allData);
			bout.flush();
			bout.close();
			
			socket.close();
			server.close();
			System.out.println("OK");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
