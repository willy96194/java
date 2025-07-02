package tw.willy.practice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class Guessgame extends JFrame implements ActionListener{
	private JButton guess;
	private JTextField input;
	private JTextPane log;
	private String answer;
	private int counter = 0;
	
	public Guessgame() {
		super("Guess Number Game");
		
		guess = new JButton("猜");
		input = new JTextField();
		input.setFont(new Font(null,Font.BOLD | Font.ITALIC,24));
		input.setForeground(Color.BLUE);
		
//		log = new JTextArea();
		log = new JTextPane();
		
		initGame();

		setLayout(new BorderLayout());
		add(log,BorderLayout.CENTER);
		
		JPanel top = new JPanel(new BorderLayout());
		top.add(guess,BorderLayout.EAST);
		top.add(input,BorderLayout.CENTER);
		
		add(top,BorderLayout.NORTH);
		
		guess.addActionListener(this);
		
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Guessgame();

	}

	private void initGame() {
		answer = createAnswer(3);
		log.setText("");
//		System.out.println(answer);
	}
	
	private static String createAnswer(int d) {
		final int nums = 10;
		int[] porker = new int[nums];
		for(int i=0; i<porker.length; i++)porker[i] = i;
		
		for(int i=nums-1;i>0; i--) {
			int r = (int)(Math.random()*(i+1));
			//porker[r] <=> porker[i]
			int temp = porker[r];
			porker[r] = porker[i];
			porker[i] = temp;
		}
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<3; i++) sb.append(porker[i]);
		
		return sb.toString();
	}
	
	private static String checkAB(String a, String g) {
		int A, B; A=B=0;
		for(int i=0; i<g.length(); i++) {
			if(a.charAt(i) == g.charAt(i)) {
				A++;
			}else if(a.indexOf(g.charAt(i)) != -1) {
				B++;
			}
		}
		return String.format("%dA%dB",A,B);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		counter ++;
		
		String g = input.getText();
		String result = checkAB(answer, g);
		
//		log.append(String.format("%d,%s => %s\n",counter, g, result));
		log.setFont(new Font(null, Font.PLAIN, 24));
		StyledDocument style = log.getStyledDocument();
		Style s1 = style.addStyle("s1", null);
		StyleConstants.setForeground(s1, Color.RED);
		
		Style s2 = style.addStyle("s2", null);
		StyleConstants.setForeground(s2, Color.BLACK);
		
		Style s3 = style.addStyle("s3", null);
		StyleConstants.setForeground(s3, Color.BLUE);
		
		try {
		style.insertString(style.getLength(),g,s1);
		style.insertString(style.getLength(),"=>",s2);
		style.insertString(style.getLength(),result+"\n",s3);
		}catch(Exception ee) {
			
		}
		input.setText("");
		
		if(result.equals("3A0B")) {
			JOptionPane.showMessageDialog(null, "WINNER");
			initGame();
			
		}else if (counter == 10) {
			JOptionPane.showMessageDialog(null, "LOSER: " + answer);
			initGame();
			counter = 0;
		}
	}
}
