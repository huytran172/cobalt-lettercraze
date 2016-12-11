package player.models;

import player.models.score.ScorePuzzle;

public class Puzzle extends Level{

	int maxMoves;
	ScorePuzzle score;
	
	public Puzzle(int moves, int threshold[]){
		super(new Board());
		this.maxMoves = moves;
		this.score = new ScorePuzzle(threshold);

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
	public boolean undo(){
		return true;
	}

	@Override
	public void initialize() {
		
	}


}
