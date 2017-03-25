package tw.org.iii;
public class Lsy33 {
	public static void main(String[] args) {
		Lsy331 obj1 = new Lsy331();
		Lsy331.Lsy3311 obj2 = obj1.new Lsy3311();
		obj2.m1();
		Lsy331.m3();
		Lsy331.Lsy3312 obj3 = new Lsy331.Lsy3312();
		obj3.m1();
	}
}
class Lsy331 {
	Lsy331(){System.out.println("Lsy331()");}
	void m1(){System.out.println("Lsy331:m1()");}
	void m2(){System.out.println("Lsy331:m2()");}
	static void m3(){}
	
	class Lsy3311{
		Lsy3311(){System.out.println("Lsy3311()");}
		void m1(){
			System.out.println("Lsy3311():m1");
			Lsy331.this.m1();
			m2();
		}
	}
	
	static class Lsy3312{
		Lsy3312(){System.out.println("Lsy3312()");}
		void m1(){
			System.out.println("Lsy3312():m1");

		}
	}
}