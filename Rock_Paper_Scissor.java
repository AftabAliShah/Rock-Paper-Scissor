package game_screen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Rock_Paper_Scissor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JLabel finalAnsLabel;
	JLabel rockIcnLabel;
	JLabel scissorIcnLabel;
	JLabel paperIcnLabel;
	JLabel rockIcnLabel_1;
	JLabel scissorIcnLabel_1;
	JLabel paperIcnLabel_1;
	JLabel rSelectionLbl;
	JLabel scoreLabel;
	JLabel playerLabel;
	JLabel robotLabel;
	JLabel pSelectionLbl;
	int pScore = 0;
	int cScore = 0;
	String res = "";

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rock_Paper_Scissor frame = new Rock_Paper_Scissor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Rock_Paper_Scissor() {
		setTitle("ROCK PAPER SCISSOR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 783, 498);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		scoreLabel = new JLabel("Score");
		scoreLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		scoreLabel.setBounds(26, 11, 37, 27);
		contentPane.add(scoreLabel);

		playerLabel = new JLabel("Player :  0");
		playerLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		playerLabel.setBounds(26, 42, 80, 14);
		contentPane.add(playerLabel);

		robotLabel = new JLabel("Robot :  0");
		robotLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		robotLabel.setBounds(26, 68, 80, 14);
		contentPane.add(robotLabel);

		finalAnsLabel = new JLabel("");
		finalAnsLabel.setForeground(new Color(0, 0, 0));
		finalAnsLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		finalAnsLabel.setBounds(198, 384, 210, 33);
		finalAnsLabel.setVisible(false);

		contentPane.add(finalAnsLabel);

		rockIcnLabel = new JLabel("");
		rockIcnLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				calculate("Rock");
				res = "ROCK";
				pSelectionLbl.setText(res);
				pSelectionLbl.setVisible(true);
			}
		});
		rockIcnLabel.setIcon(new ImageIcon(Rock_Paper_Scissor.class.getResource("/icon/rock.png")));
		rockIcnLabel.setForeground(new Color(0, 0, 0));
		rockIcnLabel.setBackground(new Color(0, 0, 0));
		rockIcnLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		rockIcnLabel.setBounds(74, 140, 103, 103);
		contentPane.add(rockIcnLabel);

		paperIcnLabel = new JLabel("");
		paperIcnLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				calculate("Paper");
				res = "PAPER";
				pSelectionLbl.setText(res);
				pSelectionLbl.setVisible(true);
			}
		});
		paperIcnLabel.setIcon(new ImageIcon(Rock_Paper_Scissor.class.getResource("/icon/paper.png")));
		paperIcnLabel.setBounds(233, 140, 103, 103);
		contentPane.add(paperIcnLabel);

		scissorIcnLabel = new JLabel("");
		scissorIcnLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				calculate("Scissor");
				res = "SCISSOR";
				pSelectionLbl.setText(res);
				pSelectionLbl.setVisible(true);
			
			}
		});
		scissorIcnLabel.setHorizontalAlignment(SwingConstants.CENTER);
		scissorIcnLabel.setIcon(new ImageIcon(Rock_Paper_Scissor.class.getResource("/icon/scissor1.png")));
		scissorIcnLabel.setBounds(392, 140, 103, 103);
		contentPane.add(scissorIcnLabel);

		JLabel rockLabel = new JLabel("ROCK");
		rockLabel.setForeground(new Color(0, 0, 0));
		rockLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		rockLabel.setBounds(108, 264, 46, 14);
		contentPane.add(rockLabel);

		JLabel paperLabel = new JLabel("PAPER");
		paperLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		paperLabel.setForeground(new Color(0, 0, 0));
		paperLabel.setBounds(263, 267, 57, 14);
		contentPane.add(paperLabel);

		JLabel scissorLabel = new JLabel("SCISSOR");
		scissorLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		scissorLabel.setForeground(new Color(0, 0, 0));
		scissorLabel.setBounds(413, 264, 71, 14);
		contentPane.add(scissorLabel);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Rock_Paper_Scissor.class.getResource("/icon/line2.png")));
		lblNewLabel.setBounds(505, 83, 18, 300);
		contentPane.add(lblNewLabel);

		JLabel playerLabel2 = new JLabel("PLAYER");
		playerLabel2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		playerLabel2.setBounds(233, 83, 71, 19);
		contentPane.add(playerLabel2);

		JLabel robotLabel1 = new JLabel("ROBOT");
		robotLabel1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		robotLabel1.setBounds(613, 79, 80, 27);
		contentPane.add(robotLabel1);

		rockIcnLabel_1 = new JLabel("");
		rockIcnLabel_1.setIcon(new ImageIcon(Rock_Paper_Scissor.class.getResource("/icon/rock.png")));
		rockIcnLabel_1.setForeground(Color.BLACK);
		rockIcnLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		rockIcnLabel_1.setBackground(Color.BLACK);
		rockIcnLabel_1.setBounds(590, 140, 103, 103);
		rockIcnLabel_1.setVisible(false);
		contentPane.add(rockIcnLabel_1);

		scissorIcnLabel_1 = new JLabel("");
		scissorIcnLabel_1.setIcon(new ImageIcon(Rock_Paper_Scissor.class.getResource("/icon/scissor1.png")));
		scissorIcnLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		scissorIcnLabel_1.setBounds(590, 140, 103, 103);
		scissorIcnLabel_1.setVisible(false);
		contentPane.add(scissorIcnLabel_1);

		paperIcnLabel_1 = new JLabel("");
		paperIcnLabel_1.setIcon(new ImageIcon(Rock_Paper_Scissor.class.getResource("/icon/paper.png")));
		paperIcnLabel_1.setBounds(590, 140, 103, 103);
		paperIcnLabel_1.setVisible(false);
		contentPane.add(paperIcnLabel_1);

		rSelectionLbl = new JLabel("");
		rSelectionLbl.setForeground(Color.BLACK);
		rSelectionLbl.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		rSelectionLbl.setBounds(608, 264, 71, 14);
		rSelectionLbl.setVisible(false);
		contentPane.add(rSelectionLbl);

		pSelectionLbl = new JLabel("ROCK");
		pSelectionLbl.setForeground(Color.BLACK);
		pSelectionLbl.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		pSelectionLbl.setBounds(285, 331, 71, 14);
		pSelectionLbl.setVisible(false);
		contentPane.add(pSelectionLbl);
		
		JLabel lblNewLabel_1 = new JLabel("YOU CHOOSE :");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblNewLabel_1.setBounds(167, 331, 117, 14);
		contentPane.add(lblNewLabel_1);

	}

	public void calculate(String player) {
		String []list = { "Rock", "Paper", "Scissor" };
		int ran = (int) ((Math.random() * 10) % 3);
		String computer = list[ran];
		if (ran == 0) {
			//ROCK
			rockIcnLabel_1.setVisible(true);
			
			paperIcnLabel_1.setVisible(false);
			scissorIcnLabel_1.setVisible(false);
			res = "ROCK";
			rSelectionLbl.setText(res);
			rSelectionLbl.setVisible(true);
			

		} else if (ran == 1) {
			//PAPER
			paperIcnLabel_1.setVisible(true);
			rockIcnLabel_1.setVisible(false);
			scissorIcnLabel_1.setVisible(false);
			res = "PAPER";
			rSelectionLbl.setText(res);
			rSelectionLbl.setVisible(true);

		} else {
			//SCISSORS
			scissorIcnLabel_1.setVisible(true);
			res = "SCISSOR";
			rSelectionLbl.setText(res);
			rSelectionLbl.setVisible(true);
			rockIcnLabel_1.setVisible(false);
			paperIcnLabel_1.setVisible(false);
			
			
		}
		// Logic
		if ( player.equalsIgnoreCase("Paper") && computer.equalsIgnoreCase("Rock")
				|| player.equalsIgnoreCase("Scissor") && computer.equalsIgnoreCase("Paper") 
				|| player.equalsIgnoreCase("Rock") && computer.equalsIgnoreCase("Scissor")) {
			
				res = "You Win!";
				finalAnsLabel.setText(res);
				finalAnsLabel.setVisible(true);
				pScore++;

		}  else if (computer.equalsIgnoreCase("Paper") && player.equalsIgnoreCase("Rock")
				|| computer.equalsIgnoreCase("Paper") && player.equalsIgnoreCase("Rock") 
				|| computer.equalsIgnoreCase("Rock") && player.equalsIgnoreCase("Scissor")) {
			
				res = "You Loose!";
				finalAnsLabel.setText(res);
				finalAnsLabel.setVisible(true);
				cScore++;
			
		} else if(player.equalsIgnoreCase("Rock") && computer.equalsIgnoreCase("Rock")
				|| player.equalsIgnoreCase("Scissor") && computer.equalsIgnoreCase("Scissor") 
				|| player.equalsIgnoreCase("Paper") && computer.equalsIgnoreCase("Paper")) {
			res = "Game Draw!";
			finalAnsLabel.setText(res);
			finalAnsLabel.setVisible(true);
			
		}
		playerLabel.setText("Player : " + pScore);
		robotLabel.setText("Robot : " + cScore);
	}
}
