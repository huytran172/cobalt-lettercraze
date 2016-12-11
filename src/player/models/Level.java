package player.models;

import java.util.Stack;

import player.models.score.Score;

public abstract class Level {
	Stack<Integer> highScoreList;
	Board board;
	String stringWordsFound[];
	boolean isComplete;
	Dictionary dictionary;
	int index;
	Score score;
	//Stack<Word> wordsFound;
	
	
	Level(Board board){
		this.board = board;
		this.dictionary = new Dictionary();
		this.highScoreList = initializeStackHighScore();
	}
	

	public Board getBoard() {
		return board;
	}
	
/*	public void addFoundWord(Word w) {
		this.wordsFound.push(w);
	}
	
	public void removeLastFoundWord(){
		this.wordsFound.pop();
	}*/
	
	//Initialize a level
	abstract void initialize();
	
	
	//End this current level (and 
	abstract boolean endLevel();
	
	//Reset this level
	abstract boolean reset();
	
	//Undo last move
	boolean undo(){
		if (!this.board.wordsFound.empty()){
			Word lastWordFound = board.wordsFound.peek();
			
			
			
			//Update high score /////////////////TO-DO///////////
			if(this.score.getScore() == this.score.getHighScore()){
				this.score.getHighScoreList().pop();
				score.setHighScore(this.score.getHighScoreList().peek()); 
				
			};
			
			this.score.removeScore(lastWordFound);
			
			this.score.calculateStar();
			
		}
		return true;
	}
	
	//Update once player has found a valid word
	public void updateLevel(){
		
		if (board.updateBoard()){
			
			Word lastWordFound = board.wordsFound.peek();
			
			//Update the scores
			this.score.updateScore(lastWordFound);
			this.score.updateHighScore();
			this.score.calculateStar();
			
			//
		}
	}
	
	private Stack<Integer> initializeStackHighScore() {
		// STUB: TO DO
		// initialize current high score of this level
		return new Stack<Integer>();
	}
}
