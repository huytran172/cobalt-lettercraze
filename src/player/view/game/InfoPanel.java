package player.view.game;

import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import player.models.Level;
import player.models.QuickSaveState;
import player.models.score.Score;
import java.awt.*;
import java.io.File;

public class InfoPanel extends JPanel {
	protected Score score;
	protected Level level;
	protected JLabel highScore;
	protected JLabel highScoreNumLabel;
	protected int highScoreNum;
	protected JLabel currentScore;
	protected JLabel scoreNumLabel;
	protected int scoreNum;
	protected StarPanel star1;
	protected StarPanel star2;
	protected StarPanel star3;
	protected JLabel starLabel;
	protected int threshold[];
	protected WordPanel wordsFound;
	protected QuickSaveState saveState = new QuickSaveState();

	public InfoPanel(Level l){
		this.setLevel(l);
		initialize();
	}

	/**
	 * Initialize the info panel
	 */
	private void initialize() {
		 setBounds(660, 170, 260, 300);
		 //setBackground(Color.lightGray);
		this.score = level.getScore();
		this.threshold = score.getThreshold();
		this.starLabel = new JLabel();

		setHighScore(new JLabel("High score"));
		getHighScore().setFont(getHighScore().getFont().deriveFont(18.0f));
		highScoreNum = score.getHighScore();
		highScoreNumLabel = new JLabel();
		setHighScoreNum(highScoreNum);
		getHighScoreNumLabel().setFont(getHighScoreNumLabel().getFont().deriveFont(18.0f));

		setCurrentScore(new JLabel("Score"));
		getCurrentScore().setFont(getHighScore().getFont().deriveFont(18.0f));
		scoreNum = score.getScore();
		scoreNumLabel = new JLabel();
		setScoreNum(scoreNum);
		getScoreNumLabel().setFont(getScoreNumLabel().getFont().deriveFont(18.0f));

		 star1 = new StarPanel(1, threshold[0]);
		 star2 = new StarPanel(2, threshold[1]);
		 star3 = new StarPanel(3, threshold[2]);



		 setWordsFound(new WordPanel());

		 GroupLayout groupLayout = new GroupLayout(this);

		 groupLayout.setVerticalGroup(
				 groupLayout.createSequentialGroup()
				 .addGroup(groupLayout.createSequentialGroup()
						 .addGroup(groupLayout.createParallelGroup()
								 .addComponent(getHighScore(), GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								 .addComponent(getHighScoreNumLabel(), GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						 //.addGap(18)
						 .addGroup(groupLayout.createParallelGroup()
								 .addComponent(getCurrentScore(), GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								 .addComponent(getScoreNumLabel(), GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						 //.addComponent(currentScore, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						 .addComponent(getStar1(), GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						 .addComponent(getStar2(), GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						 .addComponent(getStar3(), GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						 .addComponent(starLabel, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						 //.addComponent(progressbar, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
						 //.addPreferredGap(ComponentPlacement.RELATED)
						 .addContainerGap(0, 0))
				 .addComponent(getWordsFound(), GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)

				 .addGap(8)

				 .addGroup(groupLayout.createParallelGroup()));

		 groupLayout.setHorizontalGroup(

				 groupLayout.createParallelGroup()
				 .addGroup(groupLayout.createSequentialGroup()
						 .addComponent(getHighScore(), GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
						 .addComponent(getHighScoreNumLabel(), GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
				 .addGroup(groupLayout.createSequentialGroup()
						 .addComponent(getCurrentScore(), GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
						 .addComponent(getScoreNumLabel(), GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
				 //.addComponent(currentScore, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
				 //.addComponent(progressbar, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
				 .addComponent(getStar1(), GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
				 .addComponent(getStar2(), GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
				 .addComponent(getStar3(), GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
				 .addComponent(starLabel, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
				 .addComponent(getWordsFound(), GroupLayout.PREFERRED_SIZE, this.getWidth(), GroupLayout.PREFERRED_SIZE)
				 .addGroup(groupLayout.createSequentialGroup()));

			setLayout(groupLayout);
	}

	public void drawStarsToInfoPanel() {
		try {
			if (score.getScore() >= threshold[0]) {
				Image img = ImageIO.read(new File("Images/star1.png"));
				starLabel.setIcon(new ImageIcon(img));
			}

			if (score.getScore() >= threshold[1]) {
				Image img = ImageIO.read(new File("Images/star2.png"));
				starLabel.setIcon(new ImageIcon(img));
			}

			if (score.getScore() >= threshold[2]) {
				Image img = ImageIO.read(new File("Images/star3.png"));
				starLabel.setIcon(new ImageIcon(img));
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public StarPanel getStar1() {
		return star1;
	}

	public StarPanel getStar2() {
		return star2;
	}

	public StarPanel getStar3() {
		return star3;
	}

	public WordPanel getWordsFound() {
		return wordsFound;
	}

	public Level getLevel() {
		return level;
	}

	public JLabel getHighScore() {
		return highScore;
	}

	public JLabel getCurrentScore() {
		return currentScore;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public void setStar1(StarPanel star1) {
		this.star1 = star1;
	}

	public void setStar2(StarPanel star2) {
		this.star2 = star2;
	}

	public void setStar3(StarPanel star3) {
		this.star3 = star3;
	}

	public void setWordsFound(WordPanel wordsFound) {
		this.wordsFound = wordsFound;
	}

	public JLabel getHighScoreNumLabel() {
		return highScoreNumLabel;
	}

	public JLabel getScoreNumLabel() {
		return scoreNumLabel;
	}

	public void setHighScore(JLabel highScore) {
		this.highScore = highScore;
	}

	public void setCurrentScore(JLabel currentScore) {
		this.currentScore = currentScore;
	}

	public void setHighScoreNum(int input) {
		this.highScoreNumLabel.setText("" + input);
	}

	public void setScoreNum(int input) {
		this.scoreNumLabel.setText("" + input);
	}

	public int getHighScoreNum() {
		return highScoreNum;
	}

	public void saveCurrentScore(int score) {
		saveState.addLastScore(score);
	}

	public int retrieveLastScore() {
		int lastScore = saveState.getLastScore();
		return lastScore;
	}

	public int getScoreNum() {
		return scoreNum;
	}
}
