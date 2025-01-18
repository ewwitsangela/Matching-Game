package memoryGame;
 
import java.util.ArrayList;
import java.util.Collections;
 
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
 
public class Deck {
 
/* adds images to original card deck
 * duplicates images to create matching game
 * shuffles images to randomize positions each game
 */
	
	int columnsRows;
	static int maximumScore;
	
	final ArrayList <String> DEFAULT_IMAGES;
	ArrayList <String> unshuffledDeck;
	ArrayList <String> shuffledDeck;
	JButton cardButtons[];
	
	public Deck(int columnsRows) {
		
		this.columnsRows = columnsRows;
		DEFAULT_IMAGES =  new ArrayList<String>();
		unshuffledDeck = new ArrayList<String>();
		shuffledDeck = new ArrayList <String>();
		int totalCards = (int) Math.pow(columnsRows, 2);
		int totalPairs = totalCards-(totalCards%2);
		
		if(columnsRows==3) {
			Collections.addAll(DEFAULT_IMAGES, "lion.jpg", "deer.jpg", "flamingo.jpg", "polarBear.jpg");
			maximumScore = 5;
		}
		else if(columnsRows==4) {
			Collections.addAll(DEFAULT_IMAGES, "lion.jpg", "deer.jpg", "flamingo.jpg", "polarBear.jpg", "jellyfish.jpg", "fish.jpg", "ladybug.png", "parrot.jpg");
			maximumScore = 8;
		}
		else if(columnsRows==5) {
			Collections.addAll(DEFAULT_IMAGES, "lion.jpg", "deer.jpg", "flamingo.jpg", "polarBear.jpg", "jellyfish.jpg", "fish.jpg", "ladybug.png", "parrot.jpg", "cat.png", "dog.jpg", "frog.png", "otter.jpg");
			maximumScore = 13;
		}
		
		for(int i = 0; i < totalPairs/2; i++) {
			Collections.addAll(unshuffledDeck, DEFAULT_IMAGES.get(i), DEFAULT_IMAGES.get(i));
		}	
		
		if (totalCards % 2 == 1) {
			unshuffledDeck.add("FREE_SPACE.png");
		}
		shuffle(unshuffledDeck);
	}
	
	public static int getMaximumScore() {
		return maximumScore;
	}
	
	//randomize positions of images
	public void shuffle(ArrayList <String> unshuffledDeck) {
		
		while(unshuffledDeck.size() > 0) {
			int random = (int) (Math.random() * unshuffledDeck.size());
			shuffledDeck.add(unshuffledDeck.remove(random));
		}
	}
	
	//create cards
	public void addCards(JPanel gridPanel) {
		cardButtons = new JButton[shuffledDeck.size()];
		
		for(int i = 0; i < cardButtons.length; i++) {
			cardButtons[i] = new Card(shuffledDeck.get(i));
			
			gridPanel.add(cardButtons[i]); 
		}
	}
	
}
