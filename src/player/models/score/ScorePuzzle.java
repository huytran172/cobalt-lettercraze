package player.models.score;

import player.models.Word;

public class ScorePuzzle extends Score {
	
	public ScorePuzzle(int threshold[], int highScore) {
		super(threshold, highScore);
	}

	@Override
	public void updateScore(Word w) {
		this.addScore(w.calcWordScore());
		
	}

	@Override
	public void removeScore(Word w) {
		this.addScore(0-w.calcWordScore());
	}
	
	
}
