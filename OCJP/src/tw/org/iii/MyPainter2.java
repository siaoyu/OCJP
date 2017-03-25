package tw.org.iii;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

public class MyPainter2 extends JPanel {
	private int x0, y0, x1, y1, x, y, w, h;
	private MyMouseAdapter myMouseAdapter;
	
	public MyPainter2(){
		setBackground(Color.GREEN);
		addMouseListener(new MouseAdapter() {
			
		});
		x0 = y0 = x1 = y1 = -1;
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		g2d.setStroke(new BasicStroke(4));
		g2d.setColor(Color.BLUE);
		g2d.drawLine(x0, y0, x1, y1);
//		g2d.drawOval(x, y, w, h);
	}
	
	private class MyMouseAdapter extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			super.mousePressed(e);
			x0 = e.getX();
			y0 = e.getY();
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {
			super.mouseReleased(e);
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
}
