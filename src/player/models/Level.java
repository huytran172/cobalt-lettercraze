package player.models;

public abstract class Level {
	
	Board board;
	String wordsFound[];
	boolean isComplete;
	Dictionary dictionary;
	int index;
	
	
	Level(Board board){
		this.board = board;
		this.dictionary = new Dictionary();
	}
	

	public Board getBoard() {
		return board;
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
