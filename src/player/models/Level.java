package player.models;

public abstract class Level {
	
	Board board;
	String wordsFound[];
	boolean isComplete;
	Dictionary dictionary;
	int index[];
	Score score;
	
	public void setBoard(Board b) {
		board = b;
	}

	public Board getBoard() {
		return board;
	}
	
	void updateHighScore(int highscore){
		
	}
	
	//Initialize a level
	abstract void initialize();
	
	
	//End this current level (and 
	abstract boolean endLevel();
	
	//Reset this level
	abstract boolean reset();
	
	//Undo last move
	abstract boolean undo();
}
