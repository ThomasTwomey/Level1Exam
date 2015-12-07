package Level1Exam;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Level1Exam implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton yellow;
	JButton red;
	JButton blue;
	JButton green;
	
	public static void main(String[] args) {
		new Level1Exam();
	}
	
	Level1Exam()
	{
		frame = new JFrame("Color Teacher");
		panel = new JPanel();
		yellow = new JButton();
		red = new JButton();
		blue = new JButton();
		green = new JButton();
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
		panel.add(yellow);
		panel.add(red);
		panel.add(blue);
		panel.add(green);
		
		yellow.addActionListener(this);
		red.addActionListener(this);
		blue.addActionListener(this);
		green.addActionListener(this);
		
		yellow.setBackground(Color.YELLOW);
		red.setBackground(Color.RED);
		blue.setBackground(Color.BLUE);
		green.setBackground(Color.GREEN);
		
		yellow.setOpaque(true);
		red.setOpaque(true);
		blue.setOpaque(true);
		green.setOpaque(true);
		
		
		frame.setSize(400, 80);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == yellow)
		{
			speak("yellow");
		}
		else if(e.getSource() == red)
		{
			speak("red");
		}
		else if(e.getSource() == blue)
		{
			speak("blue");
		}
		else if(e.getSource() == green)
		{
			speak("green");
		}
		
	}
	
	void speak(String words) {
		try{
			Runtime.getRuntime().exec("say " + words);
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}