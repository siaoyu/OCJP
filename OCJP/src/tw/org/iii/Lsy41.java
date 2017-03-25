package tw.org.iii;
import java.io.*;
public class Lsy41 {
	public static void main(String[] args) {
		File file = new File("./dir1/file1.txt");
		try {
			FileReader reader = new FileReader(file);
			int temp;
			while((temp = reader.read()) != -1){
				System.out.print((char)temp);
			}
			reader.close();
		}catch(IOException ee){
			System.out.println(ee.toString());
		}
	}
}
