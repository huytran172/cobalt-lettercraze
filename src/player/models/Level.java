package player.models;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public abstract class Level {
	Board board;
	String stringWordsFound[];
	boolean isComplete;
	Dictionary dictionary;
	int index;
	int highScore;
	int threshold[] = new int[3];

	/**
	 * Constructor create a new board
	 * @param  board board
	 */
	public Level(Board board) {
		this.board = board;
		this.dictionary = new Dictionary();
	}

	/**
	 * Constructor load Level from file
	 * @param  f file
	 */
	public Level(File f) {
		BufferedReader inputStream = null;
		try {
			inputStream = new BufferedReader(new FileReader(f));
			// Level number
			this.index = Integer.parseInt(inputStream.readLine());
			
			// Skip feature info
			inputStream.readLine();
			
			// Threshold
			String thresholdString[] = inputStream.readLine().split(" ");
			for (int i = 0; i < 3; i++) {
				this.threshold[i] = Integer.parseInt(thresholdString[i]);
			}
			
			// High score
			this.highScore = Integer.parseInt(inputStream.readLine());
			
			// Is Complete
			this.isComplete = Integer.parseInt(inputStream.readLine()) == 0 ? false : true;
			
			// Board shape
			this.board = new Board();
			this.board.initialize(inputStream.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	

	/**
	 * get board
	 * @return return current board
	 */
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
	public abstract boolean undo();
//	{
//		if (!this.board.wordsFound.empty()){
//			Word lastWordFound = board.wordsFound.peek();
//			
//			
//			
//			//Update high score /////////////////TO-DO///////////
//			if(this.score.getScore() == this.score.getHighScore()){
//				this.score.getHighScoreList().pop();
//				score.setHighScore(this.score.getHighScoreList().peek()); 
//				
//			};
//			
//			this.score.removeScore(lastWordFound);
//			
//			this.score.calculateStar();
//			
//		}
//		return true;
//	}
	
	//Update once player has found a valid word
	public abstract void updateLevel();
//	{
//		
//		if (board.updateBoard()){
//			
//			Word lastWordFound = board.wordsFound.peek();
//			
//			//Update the scores
//			this.score.updateScore(lastWordFound);
//			this.score.updateHighScore();
//			this.score.calculateStar();
//			
//			//
//		}
//	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Index " + this.index); 
		sb.append("\n"); 
		sb.append("Threshold " + this.threshold[0] + " " + this.threshold[1] + " " + this.threshold[2]);
		sb.append("\n"); 
		sb.append("Highscore " + this.highScore);
		sb.append("\n"); 
		sb.append("Is complete " + this.isComplete);
		sb.append("\n"); 
		sb.append(this.board.toString());
		return sb.toString();
	}
	
}
