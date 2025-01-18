package memoryGame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class StartupPanel extends JFrame implements ActionListener{
	
	/*creates startup/instructions panel
	 * allows user to select difficulty of cards using radio buttons
	 */
	
	JPanel titlePanel = new JPanel();
	
	JRadioButton easyButton, normalButton, hardButton;
	JButton impossibleRound;
	
	/* StartupPanel constructor
	 * creates title panel with title text
	 */
	StartupPanel() {
		JLabel title = new JLabel("~MEMORY GAME~");
		title.setFont(new Font("Texas Tango BOLD PERSONAL USE", Font.BOLD, 95));
		title.setForeground(Color.white);
		title.setHorizontalAlignment(JLabel.CENTER);
		
		titlePanel.setBackground(new Color(139, 50, 19));
		titlePanel.setSize(1000,250);
		titlePanel.setLayout(new BorderLayout());
		titlePanel.add(title);
		
		easyButton = new JRadioButton("  Easy");
		easyButton.setBackground(new Color(222,170,135));
		easyButton.setFont(new Font("Texas Tango BOLD PERSONAL USE", Font.BOLD, 45));
		easyButton.setBounds(0, 250, 333, 200);
		
		normalButton = new JRadioButton("  Normal");
		normalButton.setBackground(new Color(153, 121, 80));
		normalButton.setFont(new Font("Texas Tango BOLD PERSONAL USE", Font.BOLD, 45));
		normalButton.setBounds(333, 250, 333, 200);
		
		hardButton = new JRadioButton("  Hard");
		hardButton.setBackground(new Color(121, 92, 50));
		hardButton.setFont(new Font("Texas Tango BOLD PERSONAL USE", Font.BOLD, 45));
		hardButton.setBounds(666, 250, 333, 200);
		
		impossibleRound = new JButton("Impossible");
		impossibleRound.setBackground(new Color(164,116,73));
		impossibleRound.setFont(new Font("Texas Tango BOLD PERSONAL USE", Font.BOLD, 40));
		impossibleRound.setBounds(333,500,333,150);
		
		ButtonGroup group = new ButtonGroup();
		group.add(easyButton);
		group.add(normalButton);
		group.add(hardButton);
		
		easyButton.addActionListener(this);
		normalButton.addActionListener(this);
		hardButton.addActionListener(this);
		impossibleRound.addActionListener(this);
		
		this.setTitle("Memory Game Startup");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000,800);
		this.setBackground(Color.yellow);
		this.setLayout(null);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.add(titlePanel,"North");
		this.add(easyButton);
		this.add(normalButton);
		this.add(hardButton);
		this.add(impossibleRound);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==easyButton) {
			this.dispose();
			new GamePanel(3);
		} else if(e.getSource()==normalButton) {
			this.dispose();
			new GamePanel(4);
		} else if(e.getSource()==hardButton) {
			this.dispose();
			new GamePanel(5);
		} else if(e.getSource()==impossibleRound) {
			this.dispose();
			new GamePanel(3);
		}
	} 

}
