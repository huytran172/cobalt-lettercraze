package player.models.score;

import player.models.Word;

public class ScoreLightning extends Score {
	
	public ScoreLightning(int threshold[]) {
		super(threshold);

	}

	@Override
	public void updateScore(Word w) {
		this.addScore(1);
		
	}

}
