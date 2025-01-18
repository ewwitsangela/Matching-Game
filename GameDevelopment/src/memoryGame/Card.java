package memoryGame;

import java.awt.Color;
import javax.swing.JButton;

public class Card extends JButton {
	
	String cardValue;
	CardImage cardFront, cardBack;
	
	public Card(String cardValue) {
		this.cardValue = cardValue;
		
		this.setBackground(Color.BLACK);
		this.setFocusable(false);
		this.addActionListener(new MouseListener());
		this.faceDown(true);
	}
	
	public void faceUp(boolean x) {
		if (x = true) {
			cardFront = new CardImage(cardValue);
			this.setIcon(cardFront.getIcon());
		}
	}
	
	public void faceDown(boolean x) {
		if (x = true) {
			cardBack = new CardImage("cardback.png");
			this.setIcon(cardBack.getIcon());
		}
	}
	
	public String getCardValue() {
		return cardValue;
	}

}

	

