package DEMO;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
public class demo {
		
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(1000,1000);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		ArrayList <ImageIcon> icon = new ArrayList <ImageIcon>();
		//icon.addAll("lion2.jpg");
		ImageIcon lion = new ImageIcon("lion2.jpg");	
		JButton button = new JButton(lion);
		 
		button.setSize(200, 200);
		// button.setBackground(Color.BLACK);
		frame.add(button);
			
	}
	
}

