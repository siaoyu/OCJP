package tw.org.iii;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class Lsy60 {
//從網路上取得圖片下載至本機
	public static void main(String[] args) {
		try{
			URL url = new URL("https://seoservicesnewyork.org/wp-content/uploads/2015/08/Google.jpg");
			URLConnection conn = url.openConnection();
			conn.connect();
			InputStream in = conn.getInputStream();
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("./dir2/iii.jpg"));
			BufferedInputStream bin = new BufferedInputStream(in);
			byte[] buf = new byte[4096];
			int len;
			while ((len = bin.read(buf)) != -1){
				bout.write(buf, 0, len);
			}
			bin.close();
			bout.flush();
			bout.close();
			System.out.println("OK");
		}catch(Exception ee){
			System.out.println(ee.toString());
		}
	}

}
