package tw.org.iii;

public class Lsy32 {

	public static void main(String[] args) {
		Lsy321 b1 = new Lsy321();
		b1.m1();
		Lsy322 b2 = (Lsy322)b1;
		Lsy321 b3 = new Lsy323();
		Lsy322 b4 = (Lsy322)b3;

	}

}
class Lsy321{
	void m1(){System.out.println("Lsy321:m1()");}
}
class Lsy322 extends Lsy321{
	void m1(){System.out.println("Lsy322:m1()");}
	void m2(){System.out.println("Lsy322:m2()");}
}
class Lsy323 extends Lsy321{
	void m1(){System.out.println("Lsy323:m1()");}
}