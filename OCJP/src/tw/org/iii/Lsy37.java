package tw.org.iii;
public class Lsy37 {
	public static void main(String[] args) {
		new Lsy371().m1();
	}
}
class Lsy371{
	void m1(){
		try{
			System.out.println("do");
//			throw new Exception();
		}catch(Exception ee){
			System.out.println("catch");
			return;
		}finally{
			System.out.println("fin");
		}
		System.out.println("end");
	}
}