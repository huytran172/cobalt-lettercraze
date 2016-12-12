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
		this.score = new ScoreTheme(super.threshold, super.highScore);
	}
	
	@Override
	public boolean endLevel(){
		return true;
	}

	//Reset board, score, list of words found
	@Override
	public boolean reset(){
		return false;
	}

	//Undo last move
	@Override
	public boolean undo() {
		return true;
	}

	@Override
	public void initialize() {
		
	}

	@Override
	public void updateLevel() {
		// TODO Auto-generated method stub
		
	}
	
	
}
