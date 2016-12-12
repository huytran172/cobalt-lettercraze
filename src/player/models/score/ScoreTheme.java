package player.models.score;

import player.models.Word;

public class ScoreTheme extends Score {
	
	public ScoreTheme(int threshold[], int highScore) {
		super(threshold, highScore);
	}

	@Override
	public void updateScore(Word w) {
		this.addScore(1);
		
	}

	@Override
	public void removeScore(Word w) {
		this.addScore(-1);
		
	}
	
}
