package practice;

import java.awt.Color;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	MyFrame() {
		this.setSize(420,420); 
		this.setTitle("JFrame title goes here");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //EXIT OUT
		this.setResizable(false); //prevent frame from being resized
		
		this.getContentPane().setBackground(new Color(0x123456)); //change color of background
		
		this.setVisible(true);
	}
	

}
