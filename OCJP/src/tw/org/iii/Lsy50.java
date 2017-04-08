package tw.org.iii;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Lsy50 {
	public static void main(String[] args) {
		Student s1 = new Student("Lsy", 50, 30, 24);
		System.out.println(s1.sum());
		System.out.println(s1.avg());
		
		try{
			ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("./dir1/lsy.object"));
			oout.writeObject(s1);
			oout.flush();
			oout.close();
			System.out.println("END");
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}

}
