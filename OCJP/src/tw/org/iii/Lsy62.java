package tw.org.iii;

import java.util.HashSet;

public class Lsy62 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		HashSet set2 = new HashSet();
//		while (set.size() < 6){
//			set.add((int)(Math.random()*49+1));
//			i++;
//		}
		set.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set.addAll(set2);
		System.out.println(set);


	}

}
