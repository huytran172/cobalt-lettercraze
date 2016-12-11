package player.models.score;

import java.util.Stack;

import player.models.Word;

public class ScoreTheme extends Score {
	
	public ScoreTheme(int threshold[], Stack<Integer> highScoreList) {
		super(threshold, highScoreList);

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
