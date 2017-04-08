package tw.org.iii;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Lsy52 {
	public static void main(String[] args) {
		Lsy523 obj = new Lsy523();
		// 序列
		 try {
			ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("./dir1/Lsy521"));
			oout.writeObject(obj);
			oout.flush();
			oout.close();
			System.out.println("END");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("------");
		// 解序
		try{
			ObjectInputStream oin = new ObjectInputStream(new FileInputStream("./dir1/Lsy521"));
			Lsy523 obj2 = (Lsy523)oin.readObject();
			oin.close();
		}catch(Exception ee){
			System.out.println(ee.toString());
		}
	}
}
class Lsy521{
	Lsy521(){System.out.println("Lsy521()");}
}
class Lsy522 extends Lsy521{
	Lsy522(){System.out.println("Lsy522()");}
}
class Lsy523 extends Lsy522 implements Serializable{
	Lsy523(){System.out.println("Lsy523()");}
}