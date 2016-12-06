package player.models;


public class Puzzle extends Level{

	int maxMoves;
	Puzzle(int moves){
		this.maxMoves = moves;

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
