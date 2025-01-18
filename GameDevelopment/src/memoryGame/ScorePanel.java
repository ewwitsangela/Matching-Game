package memoryGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ScorePanel extends JPanel {

	static JButton scoreButton; 
	JButton replayButton, quitButton;
	int score;
	
	public ScorePanel() {
		
		this.setPreferredSize(new Dimension(200,500));
		this.setBackground(Color.BLACK);
		this.setLayout(null);
		
		replayButton = new JButton("Replay");
		replayButton.setBounds(25,500,150,75);
		replayButton.setFont(new Font("Arial", Font.BOLD, 30));
		this.add(replayButton);
		
		scoreButton = new JButton("Score: ");
		scoreButton.setBounds(25,75,150,100);
		scoreButton.setFont(new Font("Arial", Font.BOLD, 25));
		this.add(scoreButton);
		
		quitButton = new JButton("Quit");
		quitButton.setBounds(25,600,150,75);
		quitButton.setFont(new Font("Arial", Font.BOLD, 30));
		this.add(quitButton);
	}
	
}
