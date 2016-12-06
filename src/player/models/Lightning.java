package player.models;

import player.models.Timer;

public class Lightning extends Level{
	
	Timer timer;
	Lightning(int time){
		
	}
	
	//End this current level, return to menu
	boolean endLevel(){
		return true;
	}

	//Reset board, score, list of words found
	boolean reset(){
		return false;
	}

	//Undo last move
	boolean undo(){
		return true;
	}
}
