package player.models.score;

import java.util.Stack;

import player.models.Word;

public abstract class Score {
	
	protected int score = 0;
	protected int highScore;
	protected int threshold[] = new int[3];
	protected int star;
	protected Stack<Integer> highScoreList;

	public int[] getThreshold() {
		return threshold;
	}

	public void setThreshold(int[] threshold) {
		this.threshold = threshold;
	}

	
	public Stack<Integer> getHighScoreList() {
		return highScoreList;
	}

	public Score(int threshold[], int highScore) {
		this.threshold = threshold;
		this.highScoreList = new Stack<Integer>();
		this.highScoreList.push(highScore);
		this.highScore = highScore;
	}
	
	/**
	 * Calculate the star
	 */
	public int calculateStar() {
		if (highScore < threshold[0]) {
			star = 0;
		}
		else if (highScore >= threshold[0] && highScore < threshold[1]) {
			star = 1;
		}
		else if (highScore >= threshold[1] && highScore < threshold[2]) {
			star = 2;
		}
		else {
			star = 3;
		}
		
		return star;
	}
	
	/**
	 * 
	 * @return score
	 */
	
	public int getScore(){
		return this.score;
	}
	
	/**
	 * 
	 * @return high score
	 */
	
	public int getHighScore(){
		return this.highScore;
	}
	
	/**
	 * 
	 * @return score
	 */
	
	public void setScore(int s){
		this.score = s;
	}
	
	/**
	 * 
	 * @return high score
	 */
	
	public void setHighScore(int hs){
		this.highScore = hs;
	}
	
	abstract public void updateScore(Word w);
	
	abstract public void removeScore(Word w);
	
	public void addScore(int s) {
		score += s;
	}
	
	public boolean updateHighScore() {
		if (this.score > this.highScore) {
			highScoreList.push(this.highScore); 
			this.highScore = this.score;
			return true;
		}
		
		return false;
	}

}
