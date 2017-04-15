package tw.org.iii;

public class Lsy77 {
	public static void main(String[] args) {
		Lsy771 obj1 = new Lsy771();
		obj1.setDaemon(true);
		obj1.start();
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("OK");
		return;
	}

}
class Lsy771 extends Thread {
	private void rub() {
		for (int i=0; i<10; i++){
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}
}