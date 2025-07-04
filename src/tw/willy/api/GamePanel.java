package tw.willy.api;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GamePanel extends JPanel{
	private BufferedImage ballImg;
	private int ballX,ballY;
	private Timer timer;
	private int viewH;
	private int viewW;
	private int ballH;
	private int ballW;
	private int dx;
	private int dy;

	public GamePanel() {
		setBackground(Color.pink);
		
		dx=dy=4;
		ballX = ballY =10;
		
		try {
			ballImg = ImageIO.read(new File("dir3/ball.png"));
			ballW = ballImg.getWidth();ballH = ballImg.getHeight();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		timer = new Timer();
		timer.schedule(new BallTask(), 1000, 10);
		
		
	}
	
	private class BallTask extends TimerTask {
		@Override
		public void run() {
			if(ballX <= 0 || ballX + ballW >= viewW) {
				dx*=-1;
			}
			if(ballY <- 0 || ballY + ballH >= viewH) {
				dy*=-1;
			}
			
			ballX += dx;
			ballY += dy;
			repaint();
		}
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		viewW = getWidth(); viewH = getHeight();
		
		g.drawImage(ballImg,ballX,ballY,null);
		
	}
}
