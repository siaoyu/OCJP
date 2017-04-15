package tw.org.iii;
public class Lsy75 {
	public static void main(String[] args) {
		MyThread mt1 = new MyThread("A");
		MyThread mt2 = new MyThread("B");
		
		mt1.start();
		mt2.start();
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {}
		System.out.println("Hello, World!");
		
	}
}

class MyThread extends Thread {
	private String name;
	MyThread(String name){
		this.name = name;
	}
	@Override
	public void run() {
		super.run();
		for (int i=0; i<10; i++){
			System.out.println(name+" MyThread:" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
		}
	}
}