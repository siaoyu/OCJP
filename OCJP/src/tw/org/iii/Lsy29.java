package tw.org.iii;

public class Lsy29 {

	public static void main(String[] args) {

	}
}
interface Lsy291{
	void m1();
	void m2();	//沒有實作的方法,定義的方法都是抽象方法
}
class Lsy292 implements Lsy291{	//介面是用來實作的, 若要成為介面, 則要實作此介面
	public void m1(){}
	public void m2(){}
}
abstract class Lsy293 implements Lsy291{
	public void m1(){}	//少做一個m2不行, 可以先加abstract, 便成抽象後, 由子類別去完成m2

}