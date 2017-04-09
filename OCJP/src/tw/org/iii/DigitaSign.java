package tw.org.iii;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DigitaSign extends JFrame{

	private JButton clear, undo, redo, color, save, open;
	private MySignPanel msp;
	
	public DigitaSign(){
		super("Digita Sign");
		setLayout(new BorderLayout());
		clear = new JButton("Clear");
		undo = new JButton("Undo");
		redo = new JButton("Redo");
		color = new JButton("Color");
		
		JPanel top = new JPanel(new FlowLayout());
		top.add(clear);
		top.add(undo);
		top.add(redo);
		top.add(color);
		add(top, BorderLayout.NORTH);
		
		msp = new MySignPanel();
		add(msp, BorderLayout.CENTER);
		
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				msp.clear();
			}
		});
		undo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				msp.undo();
			}
		});
		redo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				msp.redo();
			}
		});
		color.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Color newColor = JColorChooser.showDialog(DigitaSign.this, "選顏色", Color.BLACK);
			}
		});
		
		
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new DigitaSign();
	}

}
