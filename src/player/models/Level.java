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
}
