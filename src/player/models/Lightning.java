package player.models;

import player.models.Timer;

public class Lightning extends Level{
	
	Timer timer;
	Lightning(int time){
		
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
