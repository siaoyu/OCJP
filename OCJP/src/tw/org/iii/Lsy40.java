package tw.org.iii;
import java.io.*;
public class Lsy40 {
	public static void main(String[] args) {
		File file = new File("./dir1/file1.txt");
		try {
			FileInputStream fin = new FileInputStream(file);
			byte[] buf = new byte[(int)file.length()];	//強制轉型long->int, 只能讀取2GB以下的檔案
			int len = fin.read(buf);
			System.out.print(new String(buf, 0, len));
//			while ( (len = fin.read(buf)) != -1){
//				System.out.print(new String(buf, 0, len));
//			}
			fin.close();
		}catch(IOException ee){
			System.out.println(ee.toString());
		}
	}
}
