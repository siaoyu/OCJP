package tw.org.iii;
import java.io.*;
public class Lsy38 {
	public static void main(String[] args) {
		File file = new File("./dir1/file1.txt");
		try {
			FileInputStream fin = new FileInputStream(file);
			int temp;
			while ( (temp = fin.read()) != -1){
				System.out.print((char)temp);
			}
			fin.close();
		}catch(IOException ee){
			System.out.println(ee.toString());
		}
	}
}
