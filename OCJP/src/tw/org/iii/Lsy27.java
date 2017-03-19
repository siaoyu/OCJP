package tw.org.iii;

public class Lsy27 {

	public static void main(String[] args) {
		Lsy271 b1 = new Lsy272();
		b1.m1();
		System.out.println("----");
		b1.m2();
	}

}
abstract class Lsy271{
	Lsy271(){System.out.println("Lsy271()");}
	void m1(){System.out.println("Lsy271:m1()");}
//	void m2(){System.out.println("LSy271:m2()");}
	abstract void m2();	//抽象方法
}
class Lsy272 extends Lsy271{
	void m2(){System.out.println("Lsy272:m2()");}
}
class Lsy273 extends Lsy271{
	void m2(){System.out.println("Lsy273:m2()");}
}
abstract class Lsy274 extends Lsy271{
//	void m2(){System.out.println("Lsy274:m2()");}
}
abstract class Lsy275{	//抽象類別
	void m1(){}
}