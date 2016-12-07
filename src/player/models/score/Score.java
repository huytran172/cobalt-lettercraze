package player.models.score;

import player.models.Word;

public abstract class Score {
	
	protected int score;
	protected int highScore;
	protected int threshold[] = new int[3];
	protected int star;
	
	public Score(int threshold[]) {
		this.threshold = threshold;
	}
	
	/**
	 * Calculate the star
	 */
	public void calculateStar() {
		if (score < threshold[0]){
			star = 0;
		}
		
		else if (score >= threshold[0] && score < threshold[1]) {
			star = 1;
		}
		else if (score >= threshold[1] && score < threshold[2]) {
			star = 2;
		}
		else {
			star = 3;
		}
	}
	
	abstract public void updateScore(Word w);
	
	public void addScore(int s) {
		score += s;
	}
	
	public void updateHighScore() {
		if (this.score > this.highScore) {
			this.highScore = this.score;
		}
	}

}
