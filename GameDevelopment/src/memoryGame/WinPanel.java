package memoryGame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WinPanel extends JFrame {

	ImageIcon fireworks;
	JLabel winIcon, winText;
	JPanel panel;
	
	public WinPanel() {
		fireworks = new ImageIcon("fireworks.jpeg");
		
		winIcon = new JLabel(fireworks);
		winIcon.setSize(500,500);
		
		winText = new JLabel("CONGRATS! YOU WON!");
		winText.setFont(new Font("Texas Tango BOLD PERSONAL USE", Font.BOLD, 35));
		winText.setForeground(Color.WHITE);
		winText.setHorizontalAlignment(JLabel.CENTER);
		
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(winText,BorderLayout.SOUTH);
		panel.add(winIcon,BorderLayout.NORTH);

		this.setTitle("YOU WON!!!");
		this.setBounds(400,100,500,500);
		this.add(panel);
		this.setVisible(true);
				
	}
	
}
	
