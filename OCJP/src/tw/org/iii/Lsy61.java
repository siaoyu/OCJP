package tw.org.iii;

import java.util.HashSet;
import java.util.Iterator;

public class Lsy61 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		int i1 = 12;
		Integer i2 = new Integer(34);
		set.add(i2);
		set.add(i1);	//i1 => auto-boxing => new Integer(i1)
		
		System.out.println(set);
		System.out.println("-----");
//		舊的寫法
//		Iterator it = set.iterator();
//		while (it.hasNext()){
//			Object obj = it.next();
//			Integer i = (Integer)obj;
//			System.out.println(i);
//		}
		
//		現在方便的寫法 is-a Collection => for-each
		for (Object obj : set){
			System.out.println((Integer)obj);
		}
	}
}
class Bike61 {
	@Override
	public String toString() {
		return "Lsy";
	}
}