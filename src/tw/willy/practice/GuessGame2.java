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
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class GuessGame2 extends JFrame implements ActionListener{
	private JButton guess;
	private JTextField input;
	private JTextPane log;
	private int answer;
	static int b=100;
	static int s=0;
	
	public GuessGame2() {
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
		new GuessGame2();

	}
	public void initGame() {
		answer = createAnswer();
		s=0;
		b=100;
		log.setText("");
	}
	
	private static int createAnswer() {
		int r = (int)(Math.random()*100+1);
		return r;
	}
	
	private static String checkAnswer(int a , int g ) {
		
		if(g>=b || g<=s) {
			return String.format("不在範圍內！請輸入 %d ～ %d 之間的數字", s + 1, b - 1);
		}else if(g < a) {
			s=g;
			return String.format("%d-%d",g,b);
		}else if(g>a){
			b=g;
			return String.format("%d-%d",s,g);
		}else {
			return "";
		}
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String g = input.getText();
		int num = Integer.parseInt(g);
		String result = checkAnswer(answer, num);
		if(answer == num) {
			JOptionPane.showMessageDialog(null, "BOOM!!!");
			initGame();
		}
		log.setFont(new Font(null, Font.PLAIN, 24));
		StyledDocument style = log.getStyledDocument();
		
		Style s3 = style.addStyle("s3", null);
		StyleConstants.setForeground(s3, Color.BLUE);
		
		try {
		style.insertString(style.getLength(),result+"\n",s3);
		}catch(Exception ee) {
			
		}
		input.setText("");
		
	}

}
