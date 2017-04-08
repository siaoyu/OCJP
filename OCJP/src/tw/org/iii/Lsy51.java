package tw.org.iii;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Lsy51 {

	public static void main(String[] args) {
		try {
			ObjectInputStream oin = new ObjectInputStream(new FileInputStream("./dir1/lsy.object"));
			Object obj1 = oin.readObject();
			oin.close();
			Student s1 = (Student)obj1;
			System.out.println(s1.sum());
			System.out.println(s1.avg());
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}

}
