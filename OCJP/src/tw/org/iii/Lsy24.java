package tw.org.iii;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Lsy24 extends JFrame{
	private JButton open, save, exit;
	private MyPainter myPainter;
	
	public Lsy24(){
		super("視窗程式");
		
		setLayout(new BorderLayout());
		
		open = new JButton("Open");
		save = new JButton("Save");
		exit = new JButton("Exit");
		myPainter = new MyPainter();
		
		
		JPanel top = new JPanel(new FlowLayout());
		top.add(open);
		top.add(save);
		top.add(exit);
		
		add(top, BorderLayout.NORTH);
		add(myPainter, BorderLayout.CENTER);
		
//		add(open, BorderLayout.NORTH);
//		add(save, BorderLayout.WEST);
//		add(exit, BorderLayout.CENTER);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {

		System.out.println("----");
		new Lsy24();
		
	}
}
