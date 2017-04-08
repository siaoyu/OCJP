package tw.org.iii;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Lsy55 {
//UDP 接收端
	public static void main(String[] args) {
		while(true){
			byte[] buf = new byte[1024];
			try {
				DatagramSocket socket = new DatagramSocket(8888);
				DatagramPacket packet = new DatagramPacket(buf, buf.length);
				socket.receive(packet);
				socket.close();
				int len = packet.getLength();
				byte[] rdata = packet.getData();
				String urip = packet.getAddress().getHostAddress();
				System.out.println(urip+" => "+ new String(rdata, 0, len));
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
	}
}
