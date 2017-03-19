package tw.org.iii;

public class Lsy28 {

	public static void main(String[] args) {

	}
}
class Lsy281{
//	void m1(){}
	Lsy283 m1(){return new Lsy283();}
	String m2(){return "";}
}
class Lsy282 extends Lsy281{
	/*
	 * 存取修飾字, 由大到小
	 * public
	 * protected
	 * 沒有
	 * private
	 */
//	void m1(){}	//override m1方法, 基本型別要 = 父類別, 存取修飾字要 >= 父類別, 若父類別是private, 則已不是override
	Lsy284 m1(){return new Lsy284();}
}
class Lsy283{}
class Lsy284 extends Lsy283{}