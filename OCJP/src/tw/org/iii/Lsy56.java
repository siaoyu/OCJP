package tw.org.iii;

import java.net.InetAddress;
import java.net.Socket;
import java.io.IOException;
import java.io.OutputStream;

public class Lsy56 {
//TCP 傳送端
	public static void main(String[] args) {
			try {
				Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 9999);
				OutputStream out = socket.getOutputStream();
				out.write("Hello, 安迪!".getBytes());
				out.flush();
				out.close();
				
				socket.close();
			} catch (Exception e) {
				System.out.println(e.toString());
			}
	}

}
