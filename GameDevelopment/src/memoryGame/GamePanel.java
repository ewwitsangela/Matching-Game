package memoryGame;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GamePanel extends JFrame implements ActionListener {
	
	/*creates the game 
	 * sets number of grids (buttons) based off difficulty
	 * adds available pictures based off difficulty
	 * EASY:3x3(8 cards) NORMAL:4x4(16 cards) HARD:5x5(24 cards)
	 * creates new original card deck
	 */
	
	int columnsRows;
	ScorePanel score;
	
	GamePanel(int columnsRows) {
		this.columnsRows = columnsRows;
		
		this.setTitle("Matching Game");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setLayout(new BorderLayout());
		this.setResizable(false); 
		this.setSize(1000,900); 
		this.setVisible(true);
		
		JPanel gridPanel = new JPanel();
		gridPanel.setLayout(new GridLayout(columnsRows, columnsRows));
		gridPanel.setPreferredSize(new Dimension(800,500));
		
		Deck cardDeck = new Deck(columnsRows);
		cardDeck.addCards(gridPanel);
		this.add(gridPanel, BorderLayout.CENTER);

        score = new ScorePanel();
        score.replayButton.addActionListener(this);
        this.add(score, BorderLayout.EAST);
			
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == score.replayButton) {
			this.dispose();
			new StartupPanel();
		}
		else if(e.getSource() == score.quitButton) {
			this.dispose();
		}
		
	}
		
}
	

