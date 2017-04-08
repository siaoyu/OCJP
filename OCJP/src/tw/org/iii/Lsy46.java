package tw.org.iii;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Lsy46 {
	public static void main(String[] args) {
		try{
		DataInputStream din = new DataInputStream(new FileInputStream("./dir1/data1.dat"));

		int a = din.readInt();
		int b = din.readInt();
		String c = din.readUTF();
		String d = din.readUTF();
//		char c1 = din.readChar();
//		char c2 = din.readChar();
//		char c3 = din.readChar();
//		char c4 = din.readChar();
//		char c5 = din.readChar();
		din.close();
		System.out.println("=> "+a+":"+b+":"+c+":"+d);
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}
}
