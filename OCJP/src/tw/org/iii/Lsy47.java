package tw.org.iii;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Lsy47 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		File readFile = new File("./dir1/001.jpg");
		File saveFile = new File("./dir2/001.jpg");
		
		try{
			FileOutputStream fout = new FileOutputStream(saveFile);
			FileInputStream fin = new FileInputStream(readFile);
			int b;
			while((b = fin.read()) != -1){
				fout.write(b);
			}
			fin.close();
			fout.flush();
			fout.close();
			System.out.println("END");
		}catch(Exception e){
			System.out.println(e.toString());
		}
		System.out.println(System.currentTimeMillis() - start);
	}
}
