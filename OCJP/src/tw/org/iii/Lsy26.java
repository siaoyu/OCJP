package tw.org.iii;

public class Lsy26 {

	public static void main(String[] args) {
		Lsy261 b1 = new Lsy261();
		Lsy261 b2 = new Lsy262();	//b2還是Lsy261的物件,所以方法只能取用Lsy261的
		Lsy263 b3 = new Lsy263();
		System.out.println("-----");
//		b2.m1();
//		System.out.println(b2.a);
		myf1(b1);
		System.out.println("-----");
		myf1(b2);
		System.out.println("-----");
		myf1(b3);
		System.out.println("-----");
	}
	static void myf1(Lsy261 b){
		b.m1();
	}

}
class Lsy261{
//	int a;	//a = 0
	Lsy261(){
//		a++;
		System.out.println("Lsy261()");
	}
	void m1(){
		System.out.println("Lsy261:m1()");
	}
}
class Lsy262 extends Lsy261{
//	int b;
	Lsy262(){
//		a++;
		System.out.println("Lsy262()");
	}
	void m2(){
		System.out.println("Lsy262:m2()");
	}
}
class Lsy263 extends Lsy261{
	Lsy263(){
		System.out.println("Lsy263()");
	}
}