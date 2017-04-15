package tw.org.iii;
public class Lsy76 {
	public static void main(String[] args) {
		Thread2 t2 = new Thread2("A");
		Thread tt2 = new Thread(t2);
		Thread2 t3 = new Thread2("B");
		Thread tt3 = new Thread(t3);
		
		tt2.start();
		tt3.start();
	}
}

class Thread1 extends Thread {
	@Override
	public void run() {
		super.run();
		for (int i=0; i<10; i++){
			System.out.println(i);
		}
	}
}
class Thread2 implements Runnable {
	String name;
	Thread2(String name){this.name = name;}
	public void run() {
		for (int i=0; i<10; i++){
			System.out.println(name+" : "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}