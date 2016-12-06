package player.models;


public class Puzzle extends Level{

	int maxMoves;
	Puzzle(int moves){
		this.maxMoves = moves;

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
