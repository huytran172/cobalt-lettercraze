package player.models;

import player.models.Timer;
import player.models.score.ScoreLightning;

public class Lightning extends Level{

	Timer timer;
	ScoreLightning score;
	
	
	Lightning(int time, int[] threshold){
		super(new Board());
		this.score = new ScoreLightning(threshold, super.highScoreList);
		
	}
	
	//End this current level, return to menu
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
