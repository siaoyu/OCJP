package tw.org.iii;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Lsy79 extends JFrame{
	
	private MyClock myClock;
	private MyPool myPool;
	Lsy79(){
		setLayout(new BorderLayout());
		
		myClock = new MyClock();
		add(myClock, BorderLayout.NORTH);
		
		myPool = new MyPool();
		add(myPool, BorderLayout.NORTH);
		
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
