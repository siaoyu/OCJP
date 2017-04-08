package tw.org.iii;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Lsy49 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		File readFile = new File("./dir1/001.jpg");
		File saveFile = new File("./dir2/001.jpg");
		
		try{
			byte[] b = new byte[(int)readFile.length()];		
			FileInputStream fin = new FileInputStream(readFile);
			fin.read(b);
			fin.close();
			
			FileOutputStream fout = new FileOutputStream(saveFile);
			fout.write(b);
			fout.flush();
			fout.close();
			System.out.println("END");
		}catch(Exception e){
			System.out.println(e.toString());
		}
		System.out.println(System.currentTimeMillis() - start);
	}
}
