package player.models;

public class Level {
	
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
	
	//End this current level (and 
	boolean endLevel(){
		
		return true;
		
	}
	
	//Reset this level
	boolean reset(){
		return true;
	}
	
	//Undo last move
	boolean undo(){
		return true;
	}
}
