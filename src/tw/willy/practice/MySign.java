package tw.willy.practice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import tw.willy.api.MyDrawer;
import tw.willy.api.MyDrawer2;

public class MySign extends JFrame{
	private MyDrawer2 myDrawer;
	private JButton clear, undo, redo, color,saveJpg,saveObject,loadObject;
	private JSlider slider;
	private int currentValue ;
	
	
	public MySign() {
		super("簽名 App");
		
		myDrawer = new MyDrawer2();
		setLayout(new BorderLayout());
		add(myDrawer);
		
		JPanel top = new JPanel(new FlowLayout());
		clear = new JButton("Clear");top.add(clear);
		undo = new JButton("Undo");top.add(undo);
		redo = new JButton("Redo");top.add(redo);
		color = new JButton("Color");top.add(color);
		saveJpg = new JButton("savejpg");top.add(saveJpg);
		saveObject = new JButton("saveobject");top.add(saveObject);
		loadObject = new JButton("loadobject");top.add(loadObject);
		
		slider = new JSlider(1,100,myDrawer.getSlide());
		slider.setMajorTickSpacing(10);
	    slider.setPaintTicks(true);
	    slider.setPaintLabels(true);
	    
	    
	    

		
		add (top,BorderLayout.NORTH);
		add(slider, BorderLayout.SOUTH);
		
		setSize(800,640);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initEvent();
	}
	private void initEvent() {
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.clear();
			}
		});
		
		
		undo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.undo();
				
			}
		});
		
		redo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.redo();
				
			}
		});
		
		color.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changeColor();
				
			}
		});
		
		saveJpg.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				saveJpg();
			}
		});
		
        saveObject.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				saveobj();
			}
		});
        loadObject.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				loadobj();
			}
		});
		
		
		
        slider.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				currentValue = slider.getValue();
				myDrawer.slideValue(currentValue); 
			}
		});
	}
	private void changeColor() {
		Color newColor = JColorChooser.showDialog(
				this, "Change Color", myDrawer.getColor());
	    if(newColor != null) {
	    	myDrawer.changeColor(newColor);
	    }
	  }
	
	private void saveJpg() {
		JFileChooser jfc = new JFileChooser();
		if (jfc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION){
			File saveFile = jfc.getSelectedFile();
			try {
				if(myDrawer.saveJPEG(saveFile)) {
					JOptionPane.showMessageDialog(this, "save sucess");
				}else {
					JOptionPane.showMessageDialog(this, "save failure");
				}
			}catch(Exception e) {
				JOptionPane.showMessageDialog(this, "save failure");
			}
		}
	}
	
	private void saveobj() {
		JFileChooser jfc = new JFileChooser();
		if (jfc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION){
			File saveFile = jfc.getSelectedFile();
			try {
				myDrawer.saveLines(saveFile);
				
			}catch(Exception e) {
				JOptionPane.showMessageDialog(this, "save failure");
			}
		}
	}

	private void loadobj() {
		JFileChooser jfc = new JFileChooser();
		if (jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
			File loadFile = jfc.getSelectedFile();
			try {
				myDrawer.loadLines(loadFile); 
				
			}catch(Exception e) {
				JOptionPane.showMessageDialog(this, "load failure");
			}
		}
	}
	
//	public int getSliderValue() {
//        return currentValue;
//    }
	
	public static void main(String[] args) {
		new MySign();
	}
	

}
