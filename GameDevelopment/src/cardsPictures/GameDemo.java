package cardsPictures;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class GameDemo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameDemo window = new GameDemo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GameDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 0));
		frame.setBounds(100, 100, 1004, 657);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton starterButton = new JButton("Start Game");
		starterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		starterButton.setBounds(314, 442, 376, 96);
		starterButton.setBackground(new Color(255, 255, 0));
		starterButton.setFont(new Font("SS Rosehip", Font.BOLD, 45));
		frame.getContentPane().add(starterButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(139, 69, 19));
		panel.setBounds(0, 0, 988, 198);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Matching Game");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(182, 26, 624, 127);
		lblNewLabel.setFont(new Font("Texas Tango BOLD PERSONAL USE", Font.PLAIN, 48));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("The game starts with all the cards face down and players take turns to turn over two cards. If the two cards have the same picture, then they keep the cards, otherwise they turn the cards face down again. ");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_1.setBounds(82, 125, 878, 103);
		panel.add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("     EASY");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		rdbtnNewRadioButton.setBackground(new Color(222,184,135));
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 32));
		rdbtnNewRadioButton.setBounds(0, 195, 330, 200);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNormal = new JRadioButton("     NORMAL");
		rdbtnNormal.setBackground(new Color(135, 206, 250));
		rdbtnNormal.setFont(new Font("Tahoma", Font.PLAIN, 32));
		rdbtnNormal.setBounds(331, 195, 330, 200);
		frame.getContentPane().add(rdbtnNormal);
		
		JRadioButton rdbtnHard = new JRadioButton("      HARD");
		rdbtnHard.setBackground(new Color(100, 149, 237));
		rdbtnHard.setFont(new Font("Tahoma", Font.PLAIN, 32));
		rdbtnHard.setBounds(660, 195, 328, 200);
		frame.getContentPane().add(rdbtnHard);
	}
}
