package player.models;

import player.models.score.ScorePuzzle;

public class Puzzle extends Level{

	int maxMoves;
	ScorePuzzle score;
	
	Puzzle(int moves, int threshold[]){
		super(new Board());
		this.maxMoves = moves;
		this.score = new ScorePuzzle(threshold);

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
