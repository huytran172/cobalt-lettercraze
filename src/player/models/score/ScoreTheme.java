package player.models.score;

import player.models.Word;

public class ScoreTheme extends Score {
	
	public ScoreTheme(int threshold[]) {
		super(threshold);

	}

	@Override
	public void updateScore(Word w) {
		this.addScore(1);
		
	}
	
}
