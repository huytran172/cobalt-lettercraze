package player.view.game;

import java.awt.Color;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;

public class InfoPanel extends JPanel {
	
	JLabel highScore;
	JLabel currentScore;
	
	CustomJProgressBar progressbar;
	
	WordPanel wordsFound;
	
	JButton reset;
	JButton undo;
	JButton quit;
	
	public InfoPanel(){
		initialize();
	}
	
	private void initialize(){
		
		 setBounds(660, 170, 260, 510);
		 //setBackground(Color.lightGray);
		 
		 highScore = new JLabel("High score");
		 highScore.setFont(highScore.getFont().deriveFont(18.0f));
		 currentScore = new JLabel("Score");
		 currentScore.setFont(highScore.getFont().deriveFont(18.0f));
		 
		 progressbar = new CustomJProgressBar();
		 
		 wordsFound = new WordPanel();
		 
		 reset = new JButton("reset");
		 undo = new JButton("undo");
		 quit = new JButton ("quit");
		 
		 progressbar.setStringPainted(true);
		 
		 
		 
		 
		 GroupLayout groupLayout = new GroupLayout(this);
		 
		 groupLayout.setVerticalGroup(
					groupLayout.createSequentialGroup()
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(highScore, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
							//.addGap(18)
							.addComponent(currentScore, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
							.addComponent(progressbar, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
							//.addPreferredGap(ComponentPlacement.RELATED)
							//.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(0, 0))
							.addComponent(wordsFound, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
							.addGap(65)
							.addGroup(groupLayout.createParallelGroup()
									.addComponent(reset, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
									.addComponent(undo, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
									.addComponent(quit, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
				));
		 
		 groupLayout.setHorizontalGroup(
				 
				 groupLayout.createParallelGroup()
				 .addComponent(highScore, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
				 .addComponent(currentScore, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
				 .addComponent(progressbar, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
				 .addComponent(wordsFound, GroupLayout.PREFERRED_SIZE, this.getWidth(), GroupLayout.PREFERRED_SIZE)
				 .addGroup(groupLayout.createSequentialGroup()
						 .addComponent(reset, GroupLayout.PREFERRED_SIZE, this.getWidth()/3, GroupLayout.PREFERRED_SIZE)
						 .addComponent(undo, GroupLayout.PREFERRED_SIZE, this.getWidth()/3,GroupLayout.PREFERRED_SIZE)
						 .addComponent(quit, GroupLayout.PREFERRED_SIZE, this.getWidth()/3,GroupLayout.PREFERRED_SIZE)
				 ));
			
			setLayout(groupLayout);
	}
}
