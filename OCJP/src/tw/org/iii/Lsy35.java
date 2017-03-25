package tw.org.iii;
public class Lsy35 {
	public static void main(String[] args) {
		Bird b1 = new Bird();
		int n = 2;
		try{
			b1.setLeg(n);
//		}catch(MyException ee){
//			System.out.println(ee.toString());
//		}catch(MyException2 ee){
//			System.out.println(ee.toString());
		}catch(Exception ee){
			
		}
		System.out.println("END");
	}
}
class Bird {
	private int leg;
//	void setLeg (int n) throws MyException, MyException2{
	void setLeg (int n) throws Exception{
		if (n > 2){
			throw new MyException2();
		}else if(n < 0){
			throw new MyException();
		}
		leg = n;
	}
}
class MyException extends Exception {
	public String toString(){
		return "ERROR_01:缺腳";
	}
}
class MyException2 extends Exception {
	public String toString(){
		return "ERROR_02:變種";
	}
}