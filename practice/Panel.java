package practice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel {

	public static void main(String[] args) {
		
		//JPanel = a GUI component that functions as a container to hold other components
		
		//other components
		JLabel label1 = new JLabel("HI");
		JLabel label2 = new JLabel("HELLO");
		ImageIcon image = new ImageIcon("pinksea.png");
		JLabel label3 = new JLabel(image);
		label1.setVerticalAlignment(JLabel.BOTTOM);
		label1.setHorizontalAlignment(JLabel.RIGHT);
		label1.setBounds(0, 0, 75, 75);
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 250, 250);
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250, 0, 250, 250);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 250, 500, 250);

		redPanel.setLayout(null); 
		bluePanel.setLayout(null); 
		greenPanel.setLayout(new BorderLayout()); //image의 위치 수정
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750,750);

		redPanel.add(label1);
		bluePanel.add(label2);
		greenPanel.add(label3);
		
		
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);
		
		frame.setVisible(true);
	}

}
