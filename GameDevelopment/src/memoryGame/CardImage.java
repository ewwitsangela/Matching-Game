package memoryGame;

import javax.swing.ImageIcon;

public class CardImage extends ImageIcon {
	
	private static String value;
	private ImageIcon icon;
	
	public CardImage(String value) { 
		this.setValue(value);
		icon = new ImageIcon(value);
	}

	public ImageIcon getIcon() {
		return icon;
	}
	
	public static String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}

