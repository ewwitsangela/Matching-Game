package memoryGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;

public class MouseListener implements ActionListener {
	
	static int disabledButtonCount = 0;
	static int scoreCount = 0;
	static Card firstCard, secondCard;
	ImageIcon temp;
	
	public void actionPerformed(ActionEvent event) {
		disabledButtonCount++;
		
		if (disabledButtonCount==1) {
			firstCard = (Card) event.getSource();
			
			firstCard.faceUp(true);
			firstCard.setEnabled(false);
			temp = new ImageIcon(CardImage.getValue());
			firstCard.setDisabledIcon(temp);
			
			if (firstCard.getCardValue() == "FREE_SPACE.png") {
				scoreCount++;
				ScorePanel.scoreButton.setText("Score: " + scoreCount);
				disabledButtonCount = 0;
			}
		}
		else if (disabledButtonCount==2) {
			secondCard = (Card) event.getSource();
			secondCard.faceUp(true);
			
			temp = new ImageIcon(CardImage.getValue());
			secondCard.setEnabled(false);
			secondCard.setDisabledIcon(temp);
			
			boolean isPair = firstCard.getCardValue().equals(secondCard.getCardValue());
			
			if (isPair==false) {
				Timer timer = new Timer();
				TimerTask task = new TimerTask() {
					public void run() {
						firstCard.faceDown(true);
						secondCard.faceDown(true);
						firstCard.setEnabled(true);
						secondCard.setEnabled(true);
					}
				};
				
				timer.schedule(task, 500);
			} else {
				scoreCount++;
				ScorePanel.scoreButton.setText("Score: " + scoreCount);
			}
			
			disabledButtonCount=0;
			
			if (scoreCount == Deck.getMaximumScore()) {
				new WinPanel();
			}
		
		}
	
	}
	
}
	

