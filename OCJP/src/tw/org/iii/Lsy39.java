package tw.org.iii;
import java.io.*;
public class Lsy39 {
	public static void main(String[] args) {
		File file = new File("./dir1/file1.txt");
		try {
			FileInputStream fin = new FileInputStream(file);
			byte[] buf = new byte[3];
			int len;
			while ( (len = fin.read(buf)) != -1){
				System.out.print(new String(buf, 0, len));
			}
			fin.close();
		}catch(IOException ee){
			System.out.println(ee.toString());
		}
	}
}
