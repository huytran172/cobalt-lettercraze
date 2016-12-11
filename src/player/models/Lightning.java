package player.models;

import player.models.LightningTimer;
import player.models.score.ScoreLightning;

public class Lightning extends Level{

	LightningTimer timer;
	ScoreLightning score;
	
	
	public Lightning(int time, int[] threshold){
		super(new Board());
		this.score = new ScoreLightning(threshold, super.highScoreList);
		
	}
	
	//End this current level, return to menu
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
	public boolean undo(){
		return true;
	}

	@Override
	public void initialize() {
		
	}

	
}
