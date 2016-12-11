package player.models;

import player.models.score.ScoreTheme;

public class Theme extends Level{
	String theme;
	String wordsToFind[];
	ScoreTheme score;
	
	public Theme(String theme, String wordsToFind[], int threshold[]){
		super(new Board());
		this.theme = theme;
		this.wordsToFind = wordsToFind;
		this.score = new ScoreTheme(threshold, super.highScoreList);
	}
	
	@Override
	boolean endLevel(){
		return true;
	}

	//Reset board, score, list of words found
	@Override
	boolean reset(){
		return false;
	}

	//Undo last move
	@Override
	boolean undo(){
		return true;
	}

	@Override
	void initialize() {
		
	}
	
	
}
