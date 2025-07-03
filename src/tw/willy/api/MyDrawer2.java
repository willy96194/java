package tw.willy.api;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

import javax.imageio.ImageIO;
import javax.swing.DebugGraphics;
import javax.swing.JPanel;

public class MyDrawer2 extends JPanel{
//	private ArrayList<Point> line;
	private ArrayList<Line2> lines ,recycler;
	private Color defaultColor;
	private int currentValue = 1;
	
	public MyDrawer2() {
		lines = new ArrayList<>();
		recycler = new ArrayList<>();
		defaultColor = Color.BLACK;
		
		setBackground(Color.white);
		MyMouseAdapter adapter = new MyMouseAdapter();
		addMouseListener(adapter);
		addMouseMotionListener(adapter);
		
//		MyMouseAdapter2 adapter = new MyMouseAdapter2(lines, recycler,this);
//		addMouseListener(adapter);
//		addMouseMotionListener(adapter);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		
        Graphics2D g2d = (Graphics2D)g;
		
		
		
		for( Line2 line:lines) {
			g2d.setStroke(new BasicStroke(line.slideValue()));
			g2d.setColor(line.getColor());
			for(int i=1;i<line.numberOfPoint();i++) {
				HashMap<String, Integer> p1 = line.getPoint(i-1);
				HashMap<String, Integer> p2 = line.getPoint(i);
				g2d.drawLine(p1.get("x"),p1.get("y") ,p2.get("x") ,p2.get("y") );
			}
		}
		
		
	}
	
	private class MyMouseAdapter extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			Line2 line = new Line2(defaultColor,currentValue);
			HashMap<String, Integer> point = new HashMap<>();
			point.put("x",e.getX());point.put("y",e.getY());
			line.addPoint(point);
			lines.add(line);
			recycler.clear();
		}
		@Override
		public void mouseDragged(MouseEvent e) {
			HashMap<String, Integer> point = new HashMap<>();
			point.put("x",e.getX());point.put("y",e.getY());
			lines.getLast().addPoint(point);
			repaint();
		}
	}
	
	public void clear() {
		lines.clear();
		repaint();
	}
	
	public void undo() {
		if(lines.size() > 0) {
			recycler.add(lines.removeLast());
			repaint();
          			
		}
	}
	public void redo() {
		if(recycler.size() > 0) {
			lines.add(recycler.removeLast());
			repaint();
          			
		}
	}
	
	public Color getColor() {
	   return defaultColor;
	}
	
	public void changeColor(Color newColor) {
		defaultColor = newColor;
	}
	public int getSlide() {
		return currentValue;
	}
	
	public void slideValue(int newSlide) {
		currentValue = newSlide;
	}
	
	public boolean saveJPEG(File savefile) throws Exception {
		BufferedImage img = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
		Graphics2D g2d = img.createGraphics();
		paint(g2d);
		
		return ImageIO.write(img, "jpg", savefile);
			
		
	}
	
	public void saveLines(File savefile) throws Exception{
		ObjectOutputStream oout = new ObjectOutputStream (new FileOutputStream(savefile));
		
		oout.writeObject(lines);
		oout.flush();
		oout.close();
	}
	public void loadLines(File loadfile) throws Exception{
		try(ObjectInputStream oin = 
				new ObjectInputStream(new FileInputStream(loadfile));){
			    Object obj = oin.readObject();
			    if(obj instanceof ArrayList) {
			    	lines = (ArrayList<Line2>) obj;
			    	
			    	repaint();
			    }
		}
		
	}
	
}