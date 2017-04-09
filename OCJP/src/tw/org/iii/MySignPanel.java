package tw.org.iii;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.JPanel;
import javax.xml.crypto.dsig.spec.HMACParameterSpec;

public class MySignPanel extends JPanel{
	private LinkedList<LinkedList<HashMap<String,Integer>>> lines, recycle;
	
	public MySignPanel(){
		setBackground(Color.LIGHT_GRAY);
		
		MyMouseListener listener = new MyMouseListener();
		addMouseListener(listener);
		addMouseMotionListener(listener);
		
		lines = new LinkedList<>(); 
		recycle = new LinkedList<>(); 
	}
	//1. 偵側滑鼠事件  2. 放到資料結構  3. 畫圖
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.setColor(Color.BLACK);
		g2d.setStroke(new BasicStroke(4));
		
		for(LinkedList<HashMap<String,Integer>> line : lines){
			for (int i = 1; i < line.size(); i++){
				HashMap<String, Integer> p0 = line.get(i-1);
				HashMap<String, Integer> p1 = line.get(i);
				int x0 = p0.get("x"), y0 = p0.get("y");;
				int x1 = p1.get("x"), y1 = p1.get("y");
				g2d.drawLine(x0, y0, x1, y1);
			}
		}
	}
	
	public void clear(){
		lines.clear();
		repaint();
	}
	public void undo(){
		if (lines.size() > 0){
			recycle.add(lines.removeLast());
			repaint();
		}
	}
	public void redo(){
		lines.add(recycle.removeLast());
		repaint();
	}
	
	
	
	
	private class MyMouseListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			super.mousePressed(e);
			
			recycle.clear();
			
			LinkedList<HashMap<String,Integer>> line = new LinkedList<>();
			
			HashMap<String, Integer> point = new HashMap<>();
			point.put("x", e.getX());
			point.put("y", e.getY());
			line.add(point);
			
			lines.add(line);
		}
		@Override
		public void mouseDragged(MouseEvent e) {
			super.mouseDragged(e);
			HashMap<String, Integer> point = new HashMap<>();
			point.put("x", e.getX());
			point.put("y", e.getY());
			lines.getLast().add(point);
			repaint();
		}
	}
}
