package player.models.score;

import player.models.Word;

public class ScorePuzzle extends Score {
	
	public ScorePuzzle(int threshold[]){
		super(threshold);
	}

	@Override
	public void updateScore(Word w) {
		this.addScore(w.calcWordScore());
		
	}
	
	
}
