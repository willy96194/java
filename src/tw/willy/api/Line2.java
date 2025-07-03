package tw.willy.api;

import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class Line2 implements Serializable{
	private ArrayList<HashMap<String, Integer>> points;
	private Color color;
	private int currentValue;
	public Line2(Color color, int currentValue) {
		points = new ArrayList<>();
		this.color = color;
		this.currentValue = currentValue;
	}

	public void addPoint(HashMap<String, Integer> p) {
		points.add(p);
	}
	public HashMap<String, Integer> getPoint(int index) {
		return points.get(index);
		
		
	}
	public int numberOfPoint() {return points.size();}
    public Color getColor() {return color;}
    public int slideValue() {return currentValue;}
}
