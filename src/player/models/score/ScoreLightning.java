package player.models.score;

import java.util.Stack;

import player.models.Word;

public class ScoreLightning extends Score {
	
	public ScoreLightning(int threshold[], Stack<Integer> highScoreList) {
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
