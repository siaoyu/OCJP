package tw.org.iii;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Lsy57 {
//TCP 接收端
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9999);
			Socket socket = server.accept();	//願意接收
			
			System.out.println(socket.getInetAddress().getHostAddress());
			
			InputStream in = socket.getInputStream();
			int i;
			while ((i = in.read()) != -1){
				System.out.print((char)i);
			}
			in.close();
			
			server.close();
		} catch (IOException e) {
			System.out.println(e.toString());
		}
		
	}

}
