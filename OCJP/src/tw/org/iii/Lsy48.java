package tw.org.iii;

public class Lsy48 {

	public static void main(String[] args) {
		int[] x = {1,2,3};
		int y[] = {4,5,6};
		
	}
	void go(int[] ... z){
		for (int[] a : z){
			System.out.println(a[0]);
		}
	}
//		sayYa("andy","eric");
//	}
//	static void sayYa(String name){
//		System.out.println("Ya, "+name);
//	}
//	static void sayYa(String name1, String name2){
//		System.out.println("Ya, "+name1);
//		System.out.println("Ya, "+name2);
//	}
	static void sayYa(String... names){
		//names => String[] => {"andy","eric"}
		for(String name : names){
			System.out.println("Ya, "+name);
		}
	}
}