package tw.org.iii;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class MyPainter extends JPanel implements MouseListener{
	private int x0, y0, x1, y1, x, y, w, h;
	
	public MyPainter(){
		setBackground(Color.GREEN);
		addMouseListener(this);
		x0 = y0 = x1 = y1 = -1;
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);	//留下父的
		
		Graphics2D g2d = (Graphics2D)g;
		g2d.setStroke(new BasicStroke(4));
//		g2d.setColor(Color.BLUE);
//		g2d.drawLine(0, 0, 200, 200);
		

//		g2d.setColor(Color.BLUE);
//		g2d.drawLine(x0, y0, x1, y1);
//		System.out.println("paint");
		g2d.setColor(Color.BLUE);
		g2d.drawOval(x, y, w, h);
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Clicked");
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {

		
	}
	@Override
	public void mouseExited(MouseEvent e) {

		
	}
	@Override
	public void mousePressed(MouseEvent e) {
//		System.out.println("Pressed:"+ e.getX() +"X"+ e.getY());
		x0 = e.getX();
		y0 = e.getY();
	}
	@Override
	public void mouseReleased(MouseEvent e) {
//		System.out.println("Released");
		x1 = e.getX();
		y1 = e.getY();
		int r = Math.abs(x1-x0);
		w = 2*r;
		h = w;
		x = x0 - r;
		y = y0 - r;
		repaint();
	}
}
