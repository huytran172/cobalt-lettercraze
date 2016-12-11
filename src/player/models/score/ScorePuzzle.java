package player.models.score;

import java.util.Stack;

import player.models.Word;

public class ScorePuzzle extends Score {
	
	public ScorePuzzle(int threshold[], Stack<Integer> highScoreList) {
		super(threshold, highScoreList);
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
