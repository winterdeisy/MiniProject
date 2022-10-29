package practice;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Label {

	public static void main(String[] args) {
		//JLabel = a GUI display area for a string of text, an image, or both
		
		JLabel label = new JLabel();
		ImageIcon pinksea = new ImageIcon("pinksea.png");
		label.setIcon(pinksea);
		label.setText("Bro, do you even code?");
		label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER, RIGHT of ImageIcon
//		label.setVerticalTextPosition(JLabel.TOP); //set text TOP, CENTER, BOTTOM of ImageIcon
		label.setForeground(Color.pink); //set font color of text
		label.setFont(new Font("MV Boli",Font.PLAIN, 20)); //set font of text
		label.setIconTextGap(-25); //set gap of text to image
		label.setBackground(Color.black);
		label.setOpaque(true); //display background color
		
		Border border = BorderFactory.createLineBorder(Color.pink, 10); //border
		label.setBorder(border);
		label.setHorizontalAlignment(JLabel.CENTER); 
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);

		frame.setVisible(true);

		
		frame.add(label); //set component

	}

}
