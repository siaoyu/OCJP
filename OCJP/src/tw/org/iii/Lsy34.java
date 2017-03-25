package tw.org.iii;
// exception 例外處理
public class Lsy34 {
	public static void main(String[] args) {
		int a =10, b = 2;
		int[] c = {1, 2, 3, 4};
		try{
			System.out.println(a / b);
			System.out.println(c[4]);
		}catch(ArithmeticException ae){
			System.out.println("----error----");
			
		}catch(ArrayIndexOutOfBoundsException aiooe){
			System.out.println("----error2----");
		}catch(RuntimeException re){
			System.out.println("OK");
		}
		System.out.println("Hello, world");
	}
}
