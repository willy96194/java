package tw.willy.practice;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import tw.willy.api.GamePanel;
import tw.willy.api.GamePanel2;

public class BallGame extends JFrame{
	private GamePanel2 panel;
	
	public BallGame() {
		setLayout(new BorderLayout());
		
		panel = new GamePanel2();
		add(panel,BorderLayout.CENTER);
		
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new BallGame();
	}

}
