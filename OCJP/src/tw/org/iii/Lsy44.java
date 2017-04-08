package tw.org.iii;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Lsy44 {
	public static void main(String[] args) {
		String data = "Hello, Lsy!\nLine1\nLine2\n";
		File outFile = new File("./dir1/lsy.txt");
		try {
			FileOutputStream fout = new FileOutputStream(outFile, true);
			fout.write(data.getBytes());
			fout.flush();
			fout.close();
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}
}
