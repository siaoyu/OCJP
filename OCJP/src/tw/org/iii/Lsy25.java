package tw.org.iii;

public class Lsy25 {

	public static void main(String[] args) {
//		Lsy253 a1 = new Lsy253();
//		Lsy251 a2 = new Lsy251();
		Lsy253.m1();
	}

}

class Lsy251{
	static{
		System.out.println("s1");
	}
	Lsy251(){
		System.out.println("Lsy251()");
	}
	Lsy251(int i){
		System.out.println("Lsy251(int)");
	}
}

class Lsy252 extends Lsy251{
	static{
		System.out.println("s2");
	}
	Lsy252(String a){
//		super(1);
		System.out.println("Lsy252(String)");
	}
}

class Lsy253 extends Lsy252{
	static{
		System.out.println("s3");
	}
	Lsy253(){
		super("Lsy");
		System.out.println("Lsy253()");
	}
	static void m1(){
		System.out.println("m1()");
	}
}