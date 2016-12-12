package player.models.score;

import player.models.Word;

public class ScoreLightning extends Score {
	
	public ScoreLightning(int threshold[], int highScore) {
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
