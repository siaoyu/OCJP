package tw.org.iii;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Lsy53 {

	public static void main(String[] args) {

		try {
			InetAddress[] ips = InetAddress.getAllByName("10.2.1.104");
			for (InetAddress ip : ips){
				System.out.println(ip.getHostAddress());
			}
		} catch (UnknownHostException e) {
			System.out.println(e.toString());
		}
	}

}
