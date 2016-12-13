package player.view.game;

import java.awt.Color;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;

import player.models.Level;

public class InfoPanel extends JPanel {
	
	Level level;
	JLabel highScore;
	JLabel currentScore;
	JLabel thisHighScore;
	JLabel thisScore;

	StarPanel star1;
	StarPanel star2;
	StarPanel star3;
	
	WordPanel wordsFound;
	
	JButton removeWord;
	JButton reset;
	JButton undo;
	JButton quit;
	
	public InfoPanel(Level l){
		initialize();
	}
	
	private void initialize(){
		
		 setBounds(660, 170, 260, 510);
		 //setBackground(Color.lightGray);
		 
		 highScore = new JLabel("High score");
		 highScore.setFont(highScore.getFont().deriveFont(18.0f));
		 
		 //TO DO: FETCH HIGH SCORE FROM TEXT FILE
		 thisHighScore = new JLabel("0");
		 thisHighScore.setFont(thisHighScore.getFont().deriveFont(18.0f));
		 currentScore = new JLabel("Score");
		 currentScore.setFont(highScore.getFont().deriveFont(18.0f));
		 thisScore = new JLabel("0");
		 thisScore.setFont(thisScore.getFont().deriveFont(18.0f));

		 star1 = new StarPanel(1, 0);
		 star1.toggleStar();
		 star2 = new StarPanel(2, 0);
		 star3 = new StarPanel(3, 0);
		 
		 wordsFound = new WordPanel();
		 
		 removeWord = new JButton("Choose");
		 reset = new JButton("Reset");
		 undo = new JButton("Undo");
		 quit = new JButton ("Skip");
		 
		 //progressbar.setStringPainted(true);
		 
		 
		 
		 
		 GroupLayout groupLayout = new GroupLayout(this);
		 
		 groupLayout.setVerticalGroup(
				 groupLayout.createSequentialGroup()
				 .addGroup(groupLayout.createSequentialGroup()
						 .addGroup(groupLayout.createParallelGroup()
								 .addComponent(highScore, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								 .addComponent(thisHighScore, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						 //.addGap(18)
						 .addGroup(groupLayout.createParallelGroup()
								 .addComponent(currentScore, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								 .addComponent(thisScore, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						 //.addComponent(currentScore, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						 .addComponent(star1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						 .addComponent(star2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						 .addComponent(star3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						 //.addComponent(progressbar, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
						 //.addPreferredGap(ComponentPlacement.RELATED)
						 .addContainerGap(0, 0))
				 .addComponent(wordsFound, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
				 .addGap(65)
				 .addGroup(groupLayout.createParallelGroup()
						 .addComponent(removeWord, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						 .addComponent(reset, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						 )
				 .addGap(10)
				 .addGroup(groupLayout.createParallelGroup()
						 .addComponent(undo, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						 .addComponent(quit, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)));
		 
		 groupLayout.setHorizontalGroup(
				 
				 groupLayout.createParallelGroup()
				 .addGroup(groupLayout.createSequentialGroup()
						 .addComponent(highScore, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
						 .addComponent(thisHighScore, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
				 .addGroup(groupLayout.createSequentialGroup()
						 .addComponent(currentScore, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
						 .addComponent(thisScore, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
				 //.addComponent(currentScore, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
				 //.addComponent(progressbar, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
				 .addComponent(star1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
				 .addComponent(star2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
				 .addComponent(star3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
				 .addComponent(wordsFound, GroupLayout.PREFERRED_SIZE, this.getWidth(), GroupLayout.PREFERRED_SIZE)
				 .addGroup(groupLayout.createSequentialGroup()
						 .addComponent(removeWord, GroupLayout.PREFERRED_SIZE, this.getWidth()/2, GroupLayout.PREFERRED_SIZE)
						 .addComponent(reset, GroupLayout.PREFERRED_SIZE, this.getWidth()/2, GroupLayout.PREFERRED_SIZE))
				 .addGroup(groupLayout.createSequentialGroup()
						 .addComponent(undo, GroupLayout.PREFERRED_SIZE, this.getWidth()/2,GroupLayout.PREFERRED_SIZE)
						 .addComponent(quit, GroupLayout.PREFERRED_SIZE, this.getWidth()/2,GroupLayout.PREFERRED_SIZE)));
			
			setLayout(groupLayout);
	}
}
