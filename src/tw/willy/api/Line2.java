package tw.willy.api;

import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class Line2 implements Serializable{
	private ArrayList<HashMap<String, Integer>> points;
	private Color color;
	public Line2(Color color) {
		points = new ArrayList<>();
		this.color = color;
	}

	public void addPoint(HashMap<String, Integer> p) {
		points.add(p);
	}
	public HashMap<String, Integer> getPoint(int index) {
		return points.get(index);
		
		
	}
	public int numberOfPoint() {return points.size();}
    public Color getColor() {return color;}
}
